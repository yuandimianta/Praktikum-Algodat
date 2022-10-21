package Algodat.Modul1;
// class Node merupakan class yang digunakan untuk merepresentasikan tiap Node yang di list
public class Node{
   // variabel next merupakan variabel yang berfungsi untuk menunjuk node selanjutnya pada list
   // variabel prev merupakan variabel yang berfungsi untuk menunjuk node sebelumnya pada list
   Node next, prev;
   // String nama merupakan variabel yang di gunakan untuk menginputan nama orang yang datang menonton konser
   String nama;
   //int tinggi dan power merupakan variabel yang digunakan untuk menginputkan tinggi dan power setiap orang yang datanag menonoton konser
   int tinggi, power;
   // Constructor Node adalah method yang berfungsi untuk menginisialisasi variabel- variabel instans yang akan dimiliki oleh objek.
   public Node(String nama, int tinggi, int power){
      //this.nama berfungsi sebagai referensi untuk objek nama saat ini yang dimiliki oleh constructor Node
      this.nama = nama;
      //this.tinggi berfungsi sebagai referensi untuk objek tinggi saat ini yang dimiliki oleh constructor Node
      this.tinggi = tinggi;
      //this.power berfungsi sebagai referensi untuk objek power saat ini yang dimiliki oleh constructor Node
      this.power = power;
   }
}