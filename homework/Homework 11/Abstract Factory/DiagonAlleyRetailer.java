import java.util.*;
public class DiagonAlleyRetailer {
    public static void main(String[] args) {
        ArrayList<Enchanted> itemsOrdered = new ArrayList<Enchanted>();
        // To keep the demonstration code simple, we construct instances
        // of the concrete factory classes here (despite the fact that
        // it seems odd for the client class to be instantiating factory
        // classes):
        Factory broomfac = new BroomstickFactory("Hogwarts");
        Factory wandfac = new MagicWandFactory("Hogwarts");
        Factory owlfac = new OwlEmporium("Hogwarts");
        while (true) {
            System.out.println("\n\nTo order an enchanted broomstick, "
                    + "enter 1"
                    + "\nTo order a magic wand, enter 2"
                    + "\nTo order an owl, enter 3"
                    + "\nTo quit ordering, enter 4\n");
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            if (in == 1) itemsOrdered.add(broomfac.deliverItem());
            if (in == 2) itemsOrdered.add(wandfac.deliverItem());


            if (in == 3) itemsOrdered.add(owlfac.deliverItem());
            if (in == 4) break;
        }
        System.out.println("Number of items ordered: "
                + itemsOrdered.size());
        System.out.println("\n\nWould you like to see what you "
                + "ordered? "
                + "\n Answer \"y\" for yes and \"n\" "
                + "for no: ");
        Scanner sc = new Scanner(System.in);
        String yORn = sc.next();
        System.out.println();
        if (yORn.equals("y")) {
            ListIterator<Enchanted> iter = itemsOrdered.listIterator();
            while (iter.hasNext()) {
                Object item = iter.next();
                if (Broomstick.class.isAssignableFrom(item.getClass())) {
                    System.out.println("Item ordered: "
                            + "one broomstick " + item);
                    continue;
                }
                if (MagicWand.class.isAssignableFrom(item.getClass())) {
                    System.out.println("Item ordered: "
                            + "one magic wand " + item);
                    continue;
                }
                if (Owl.class.isAssignableFrom(item.getClass())) {
                    System.out.println("Item ordered: "
                            + "oneowl" + item);
                    continue;
                }
                System.out.println("Goodbye!!");
            }
        }
    }
}