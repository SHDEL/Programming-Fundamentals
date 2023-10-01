public class Lab4Q366019 {
    public static void main(String[] args) {
        int amountCharge = 0;
        int hrsPark = 0;
        for (int i = 0; i < args.length; i++) {

            hrsPark = Integer.parseInt(args[i]);
            if (hrsPark >= 24) {
                amountCharge = (hrsPark / 24) * 24;
                hrsPark = hrsPark % 24;
            } else if (hrsPark >= 18 && hrsPark <= 24) {
                amountCharge = 24;
            } else if (hrsPark > 4 && hrsPark <= 18) {
                amountCharge = 4 + (3 * 2) + (hrsPark - 4) * 1;
            } else if (hrsPark >= 3 && hrsPark <= 4) {
                System.out.println("case2");
                amountCharge = 4 + (hrsPark - 2) * 3;
            } else {
                amountCharge += 4;
                System.out.println("case1");
            }
            System.out.println("Parking for " + args[i] + "hrs, pay" + amountCharge + "baht.");
        }
    }

}
