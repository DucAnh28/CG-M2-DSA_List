package Demo;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
        arr.add(9);
        arr.add(2);
        arr.add(3);
        arr.add(9);
        arr.add(1);
        //Them vao arraylist vi tri index
        arr.add(2, 18);



        //Thay doi phan tu
//        arr.set(0, 555);

        //Xoa phan tu
//        arr.remove(new Integer(3));
//        arr.remove(0);

        //Tim phan tu
//        System.out.println(arr.lastIndexOf(9));

        //Lay phan tu
//        System.out.println(arr.get(0));

        //Do dai cua arraylist
//        System.out.println(arr.size());
    }
}
