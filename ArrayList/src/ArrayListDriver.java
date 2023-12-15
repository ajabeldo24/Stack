public class ArrayListDriver {
    public static void main(String[] args) {
        ArrayList<Integer> bla = new ArrayList<>();
        bla.add(0,5);
        bla.add(1,6);
        bla.add(2,7);
        bla.add(3,8);
        bla.add(4,9);
        System.out.println(bla);
        System.out.println(bla.size());
        System.out.println(bla.get(4));
        bla.remove(4);
        bla.size();
        bla.add(4,9);
        bla.set(3,9);
        bla.set(4,10);
        System.out.println(bla);
        bla.set(3,8);
        bla.set(4,9);
        System.out.println(bla);
    }
}
