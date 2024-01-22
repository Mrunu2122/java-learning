public class string {
    
    public static void main(String[] args) {
        String name1 = "Mrunal";
        String name2 = "dipti";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        // java is a zero based index langugage

        String name = "Mrunal";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        // replace
        name = "dipti";
        name2 = name.replace('i', 'b');
        System.out.println(name2);
    }
}
