package Algodat.Modul1;
// Class JurnalMod1 merupakan class tempat method untuk menambahkan list 
public class JurnalMod1{
   // head merupakan variabel yang akan digunakan sebagai penanda node pertama pada list
   // tail merupakan variabel yang akan digunakan sebagai penanda node terakhir pada list
   // current merupakan variabel bantu yang akan digunakan untuk menunjuk setiap node
   Node head, tail, current;

   // insert first merupakan method untuk menambahkan data di list terdepan dengan parameter nama,tinggi, dan power sebagai data yang akan di inputkan
   public void insertFirst(String nama, int tinggi, int power){
      // Node baru merupkan object dari class Node yang berisi constructor Node yang digunakan untuk menambahkan node baru di list
      Node baru = new Node(nama, tinggi, power);
      // if merupakan kondisi bersyarat dimana jika syarat kondisi tersebut terpenuhi maka code yang ada di dalam blok kondisi tersebut akan di proses
      if(head == null){
         // head = tail = baru digunakan untuk menjadikan node pertama di list sebagai head sekaligus tail
         head = tail = baru;
      } else {
         // baru.next digunakan untuk menghungkan node baru ke node selanjutnya yaitu node head
         baru.next = head;
         // head.prev digunakan untuk menghubunkan head ke node sebelumnya yaitu node baru
         head.prev = baru;
         // head = baru berfungsi untuk memindahkan posisi head ke node baru sehingga node baru menjadi head atau node pertama
         head = baru;
         // head.prev = null digunakan untuk mengosongkan node sebelum node head
         head.prev = null;
      }
   }
   
   // insert after merupakan method untuk menambahkan data di depan list acuan dengan parameter nama,tinggi, dan power sebagai data yang akan di inputkan
   public void insertAfter(String nama, int tinggi, int power, String acuan){
      // Node baru merupkan object dari class Node yang berisi constructor Node yang digunakan untuk menambahkan node baru di list
      Node baru = new Node(nama, tinggi, power);
      // current = head digunakan untuk  menempatkan variable current di head atau node pertama
      current = head;
      // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current 
      while(current != null){
         // if merupakan kondisi bersyarat dimana jika syarat kondisi tersebut terpenuhi maka code yang ada di dalam blok kondisi tersebut akan di proses
         if(current.nama == acuan){
            // baru.next = current.next digunakan untuk menghubungkan node baru ke node setelah current
            baru.next = current.next;
            // current.next.prev = baru digunakan untuk menghubungkan node setelah current ke node sebelumnya yaitu node baru 
            current.next.prev = baru;
            // current.next = baru digunakan untuk menghubungkan node yang di tunjuk current ke node selanjutnya yaitu node baru
            current.next = baru;
            // baru.prev = current digunakan untuk menghubungkan node current ke node sebelumnya yaitu node yang di tunjuk current
            baru.prev = current;
            // break digunakan untuk menghentikan proses yang ada di dalam methode ini
            break;
         }
         // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
         current = current.next;
      }
   }

   // remove after merupakan method untuk menghapus node yang berada diantara node di list
   public void removeAfter(String choose){
      // current = head digunakan untuk  menempatkan variable current di head atau node pertama
      current = head;
      // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current
      while(current != null){
         // if merupakan kondisi bersyarat dimana jika syarat kondisi tersebut terpenuhi maka code yang ada di dalam blok kondisi tersebut akan di proses
         if(current.next.nama == choose){
            // current.next = current.next.next digunakan untuk menghubungkan node yang ditunjuk current ke 2 node setelahnya
            current.next = current.next.next;
            // current.next.prev = current digunakan untuk menghubungkan node setelah node yang ditunjuk current ke node sebelumnya yaitu node yang di tunjuk current
            current.next.prev = current;
            // break digunakan untuk menghentikan proses yang ada di dalam methode ini
            break;
         }
         // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
         current = current.next;
      }
   }

   // print merupakan method yang di gunakan untuk menampilkan semua list pada jurnal no.1
   public void print(){
      // current = head digunakan untuk  menempatkan variable current di head atau node pertama
      current = head;
      // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current
      while(current != null){
         // System.out.println merupakan perintah yang berfungsi untuk mencetak data, setelah data tersebut dicetak diikuti dengan perpindahan baris baru
         System.out.println("Nama : " + current.nama + "\theight : " + current.tinggi + "\tPower : " + current.power);
         // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
         current = current.next;
      }
   }
   
   // merge list adalah methode untuk menggabungkan 2 list dari object yang berbeda menggunakan parameter dengan tipe data nama class list tersebut agar list tersebut dapat di akses
   public void mergeList(JurnalMod1 list, JurnalMod1 list2){
      // list.tail.next = list2.head digunakan untuk menghubungkan tail dari list pertama ke node selanjutnya yaitu head dari list ke dua
      list.tail.next = list2.head;
      // list2.head.prev = list.tail digunakan untuk menghubungkan head list ke dua ke node sebelumnya yaitu tail dari list pertama
      list2.head.prev = list.tail;
      // current = head digunakan untuk  menempatkan variable current di head atau node pertama dari list pertama
      current = list.head;
      // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current
      while(current != null){
         // if merupakan kondisi bersyarat dimana jika syarat kondisi tersebut terpenuhi maka code yang ada di dalam blok kondisi tersebut akan di proses
         if(current.next != null){
            // System.out.print merupakan perintah yang berfungsi untuk mencetak data
            System.out.print(current.nama + " -> ");
            // kondisi else merupakan kondisi dmana code yang ada di dalam bloknya akan di proses jika syarat kondisi if tidak terpenuhi
         } else {
            // System.out.print merupakan perintah yang berfungsi untuk mencetak data
            System.out.print(current.nama);
         }
         // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
         current = current.next;
      }
   }

   // print merupakan method yang di gunakan untuk menampilkan semua list pada jurnal no.2
   public void printList(){
      // current = head digunakan untuk  menempatkan variable current di head atau node pertama
      current = head;
      // while looping dengan syarat current tidak sama dengan null digunakan sebagai perulangan untuk memindahkan posisi current
      while(current != null){
         // if merupakan kondisi bersyarat dimana jika syarat kondisi tersebut terpenuhi maka code yang ada di dalam blok kondisi tersebut akan di proses
         if(current.next != null){
            // System.out.print merupakan perintah yang berfungsi untuk mencetak data
            System.out.print(current.nama + " -> ");
            // kondisi else merupakan kondisi dmana code yang ada di dalam bloknya akan di proses jika syarat kondisi if tidak terpenuhi
         } else {
            // System.out.print merupakan perintah yang berfungsi untuk mencetak data
            System.out.print(current.nama);
         }
         // current = current.next digunakan untuk memindahkan posisi current ke node selanjutnya
         current = current.next;
      }
   }
}