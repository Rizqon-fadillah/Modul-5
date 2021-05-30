package Tugas;
public class SingLingkedListApp {
public static void main(String[] ar){
        SinglyLingkedList lk = new SinglyLingkedList();
        lk.insertAwal(10);
        lk.display();
        lk.insertAwal(20);
        lk.display();
        lk.insertAkhir(30);
        lk.display();
        lk.insertAkhir(40);
        lk.display();
        lk.insertAtPos(50, 2);
        lk.display();
        lk.insertAkhir(60);
        lk.display();
        lk.deleteAtPos(2);
        lk.display();
}
}