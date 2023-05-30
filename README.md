# API E- COMMERCE SEDERHANA

## About
Program ini bertujuan untuk membuat backend API untuk aplikasi e-commerce sederhana. Program ini dibuat menggunakan bahasa Java guna memenuhi salah satu tugas mata kuliah yakni Pemrograman Berbasis Objek.
Program ini nantinya memberikan response dengan format JSON. Adapun request method pada API memuat: <br/>

**GET** untuk mendapatkan list atau detail data dari entitas. <br/>
**POST** untuk membuat data entitas baru. <br/>
**PUT** untuk mengubah data dari entitas. <br/>
**DELETE** untuk menghapus data dari entitas. <br/>

Data-data yang digunakan dalam aplikasi e-Commerce ini akan disimpan pada **database SQLite** yang kemudian akan dilakukan suatu pengujian API yang telah diprogram melalui aplikasi **Postman**

## Spesifikasi API dalam Aplikasi e-Commerce
### **GET**

- GET /users untuk mendapatkan daftar semua user yang termuat di dalam database. <br/>
``` {
    "User Information": [
        {
            "First_Name": "Arya",
            "Type": "buyer",
            "Email": "arya@mail.com",
            "Last_Name": "Pramana",
            "id_user": 1,
            "Phone Number": "088219590598"
        },
        {
            "First_Name": "Pringga",
            "Type": "buyer",
            "Email": "pringga@mail.com",
            "Last_Name": "Baskara",
            "id_user": 2,
            "Phone Number": "085234122345"
        },
        {
            "First_Name": "Sandhi",
            "Type": "seller",
            "Email": "sandhi@mail.com",
            "Last_Name": "Swarjaya",
            "id_user": 3,
            "Phone Number": "089765432123"
        },
        {
            "First_Name": "Indra",
            "Type": "seller",
            "Email": "indra@mail.com",
            "Last_Name": "Darma",
            "id_user": 4,
            "Phone Number": "081778554321"
        }
    ]
}

```

``` http://localhost:8016/users ```

<br/>

- GET /users/{id} untuk mendapatkan informasi user dan alamatnya. <br/>
``` {
    "User Information": [
        {
            "First_Name": "Arya",
            "Type": "buyer",
            "Email": "arya@mail.com",
            "Last_Name": "Pramana",
            "Id": 1,
            "City": "Denpasar",
            "Phone Number": "088219590598",
            "Postcode": "80223",
            "Province": "Bali"
        }
    ]
}
```

``` http://localhost:8016/users/1 ```
<br/>

- GET /users/{id}/products untuk mendapatkan daftar produk milik user. <br/>
 ```
{
    "Products Information": [
        {
            "User ID": 4,
            "Nama": "Indra",
            "Harga": 7000000,
            "Deskripsi": "Handphone IOS dengan Memori Internal 64GB dan RAM 2GB",
            "ID Barang": 3,
            "Nama Produk": "Iphone 11",
            "Stock": 15
        },
        {
            "User ID": 4,
            "Nama": "Indra",
            "Harga": 12000000,
            "Deskripsi": "Handphone IOS dengan Memori Internal 128GB dan RAM 3GB",
            "ID Barang": 4,
            "Nama Produk": "Iphone 12",
            "Stock": 3
        }
    ]
}
```

``` http://localhost:8016/users/4/products ```
<br/>

- GET /users/{id}/orders untuk mendapatkan daftar order milik user. <br/>
``` {
    "Order Information": [
        {
            "Order": 1,
            "Nama": "Arya",
            "Total": 2000000,
            "Diskon": 0,
            "id user": 1
        }
    ]
}
```

``` http://localhost:8016/users/1/orders ```

<br/>

- GET /users/{id}/reviews untuk mendapatkan daftar review yang dibuat oleh user. <br/>
 ``` {
    "Reviews Information": [
        {
            "User": 1,
            "star": 5,
            "First Name": "Arya",
            "Deskripsi": "Barang diterima dengan baik",
            "Last Name": "Pramana",
            "order": 1
        }
    ]
}
```

``` http://localhost:8016/users/1/reviews ```
<br/>

- GET /orders/{id} untuk mendapatkan informasi order, buyer, detail order, review, product title, beserta pricenya. <br/>
``` {
    "Orders Information": [
        {
            "Id Product": 1,
            "Price": "2000000",
            "Star": 5,
            "Id User": 1,
            "Id Order": 1,
            "Full Name": "Arya Pramana",
            "Quantity": 1,
            "Title": "Samsung A20",
            "Review": "Barang diterima dengan baik"
        }
    ]
}
```

``` http://localhost:8016/orders/1 ```

<br/>

- GET /products untuk mendapatkan daftar semua produk. <br/>
 ```
{
    "Product Information": [
        {
            "Description": "Handphone Android dengan Memori Internal 32GB dan RAM 2GB",
            "User": 3,
            "Price": "2000000",
            "Title": "Samsung A20",
            "Id": 1,
            "Stock": 5
        },
        {
            "Description": "Handphone Android dengan Memori Internal 16GB dan RAM 2GB",
            "User": 3,
            "Price": "1500000",
            "Title": "Oppo A3S",
            "Id": 2,
            "Stock": 10
        },
        {
            "Description": "Handphone IOS dengan Memori Internal 64GB dan RAM 2GB",
            "User": 4,
            "Price": "7000000",
            "Title": "Iphone 11",
            "Id": 3,
            "Stock": 15
        },
        {
            "Description": "Handphone IOS dengan Memori Internal 128GB dan RAM 3GB",
            "User": 4,
            "Price": "12000000",
            "Title": "Iphone 12",
            "Id": 4,
            "Stock": 3
        }
    ]
}
```

``` http://localhost:8016/products ```

<br/>

- GET /products/{id} untuk mendapatkan informasi produk dan seller. <br/>
``` {
    "Product Information": [
        {
            "First_Name": "Indra",
            "Type": "seller",
            "Description": "Handphone IOS dengan Memori Internal 64GB dan RAM 2GB",
            "Email": "indra@mail.com",
            "Price": "7000000",
            "Last_Name": "Darma",
            "Title": "Iphone 11",
            "Seller": 4,
            "Id": 3,
            "id_user": 4,
            "Phone Number": "081778554321",
            "Stock": 15
        },
        {
            "First_Name": "Indra",
            "Type": "seller",
            "Description": "Handphone IOS dengan Memori Internal 128GB dan RAM 3GB",
            "Email": "indra@mail.com",
            "Price": "12000000",
            "Last_Name": "Darma",
            "Title": "Iphone 12",
            "Seller": 4,
            "Id": 4,
            "id_user": 4,
            "Phone Number": "081778554321",
            "Stock": 3
        }
    ]
}
```

``` http://localhost:8016/products/4 ```
<br/>

### **POST**
- Membuat entitas baru berupa tabel ... 
- <br/>
```
"first_name" : "Arya",
"last_name" : "Pramana",
"email" : "arya@mail.com",
"phone_number" : "088219590598",
"type" : "buyer"

}
```
``` http://localhost:8016/users ```
<br/>

### **PUT** ###
- Mengubah entitas yang ada dimana saya mengubah entitas pada ... 
- <br/>
``` 
"first_name" : "Arya",
"last_name" : "Prananda",
"email" : "arya@mail.com",
"phone_number" : "088219590598",
"type" : "buyer"

}
```
``` http://localhost:8016/users```

<br/>

### **DELETE**
- Menghapus data dari entitas tertentu dimana saya mencoba untuk menghapus data yang terdapat pada tabel ... <br/>
  Deskripsiin sendiri sesuai proses

``` http://localhost:8016/users ```
<br/>

## Closing
Sebelumnya, saya mengucapkan terima kasih karena telah membaca laporan project ini sampai dengan selesai. Selain itu, saya juga mengucapkan banyak terima kasih kepada teman - teman yang telah membantu saya dalam membuat project ini. Saya menyadari bahwa project ini masih terdapat banyak sekali kekurangan dan kesalahan di dalamnya. Oleh sebab itu, saya meminta maaf terkait dengan hal tersebut dan juga menerima kritik dan saran agar kedepannya bisa menjadi lebih baik lagi. Terima kasih!

I Made Arya Adi Pramana - 2205551016