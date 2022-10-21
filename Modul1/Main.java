package Algodat.Modul1;
// class Main merupakan class utama dimana terdapat method main yaitu tempat semua code akan di jalankan
public class Main {
   // public static void main merupakan method utama yang menjadi tempat semua code akan di proses
   public static void main(String[] args) {
      // list merupakan object dari class JurnalMod1 yang digunakan untuk membuat list dengan menggunakan method yang ada di dalam classnya
      JurnalMod1 list = new JurnalMod1();

      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru
      System.out.println("KETIKA PENAMPILAN FEAST");
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Jidan", 183, 62);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Weng", 182, 61);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Azzam", 170, 57);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Pande", 168, 51);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Melki", 165, 40);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Devian", 160, 36);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Putri", 158, 34);
      // list.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list 
      list.insertFirst("Alita", 155, 33);
      //list.print digunakan untuk menampilkan list yang ada pada object list
      list.print();
      
      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru
      System.out.println("\nKETIKA DEVIAN KELUAR");
      // list.removeAfter digunakan untuk menghapus node yang di pilih pada list di object list
      list.removeAfter("Devian");
      //list.print digunakan untuk menampilkan list yang ada pada object list
      list.print();
      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru
      System.out.println("\nSETELAH DADI GANTIKAN DEVIAN");
      // list.insertAfter digunakan untuk menambahkan node baru yang berisi data nama, tinggi, dan power di setelah node acuan
      list.insertAfter("Dadi", 164, 37, "Putri");
      //list.print digunakan untuk menampilkan list yang ada pada object list
      list.print();
      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru
      System.out.println("\nKETIKA AZZAM KELUAR BARISAN");
      // list.removeAfter digunakan untuk menghapus node yang di pilih pada list di object list
      list.removeAfter("Azzam");
      //list,print digunakan untuk menampilkan list yang ada pada object list
      list.print();
      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru
      System.out.println("\nSETELAH AGUS GANTIKAN AZZAM");
      // list.insertAfter digunakan untuk menambahkan node baru yang berisi data nama, tinggi, dan powerdi setelah node acuan
      list.insertAfter("Agus", 169, 54, "Pande");
      //list.print digunakan untuk menampilkan list yang ada pada object list
      list.print();

      // list2 merupakan object dari class JurnalMod1 yang digunakan untuk membuat list dengan menggunakan method yang ada di dalam classnya
      JurnalMod1 list2 = new JurnalMod1();
      // list3 merupakan object dari class JurnalMod1 yang digunakan untuk membuat list dengan menggunakan method yang ada di dalam classnya
      JurnalMod1 list3 = new JurnalMod1();
      // merge merupakan object dari class JurnalMod1 yang digunakan untuk membuat list dengan menggunakan method yang ada di dalam classnya
      JurnalMod1 merge = new JurnalMod1();
      
      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru
      System.out.println("\nBERTEDUH");
      // list2.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list2
      list2.insertFirst("Dadi", 164, 37);
      // list2.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list2
      list2.insertFirst("Agus", 169, 54);
      // list2.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list2
      list2.insertFirst("Weng", 182, 61);
      // list2.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list2
      list2.insertFirst("Jidan", 183, 62);
      //list2.print digunakan untuk menampilkan list yang ada pada object list2
      list2.printList();

      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru.
      System.out.println("\n\nTETAP MENONTON KONSER");
      // list3.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list3
      list3.insertFirst("Permadi", 168, 51);
      // list3.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list3
      list3.insertFirst("Melki", 165, 40);
      // list3.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list3
      list3.insertFirst("Putri", 158, 34);
      // list3.insertFirst digunakan untuk menambahkan node yang berisi data nama,tinggi,dan power di awal list pada object list3
      list3.insertFirst("Alita", 155, 33);
      //list3.print digunakan untuk menampilkan list yang ada pada object list3
      list3.printList();

      // System.out.println merupakan perintah yang berfungsi untuk menampilkan data, setelah data tersebut ditampilkan diikuti dengan perpindahan baris baru.
      System.out.println("\n\nOUTPUT");
      // merge.mergeList merupakan method untuk menggabungkan 2 list dengan object berbeda, lalu method akan menampilkan list tersebut
      merge.mergeList(list3, list2);
   }
}
