package Tugas;
public class nomor1 {
    public static void main(String[] ar){
        SinglyLingkedList lk = new SinglyLingkedList();
        lk.insertAwal(100);
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1);
        lk.display();
        lk.insertAtPos(80,2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
}
}