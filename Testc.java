import java.util.Scanner;

class Testc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        Integer z;
        System.out.println("Enter x: ");
        x = sc.nextInt();
        System.out.println("Enter y: ");
        y = sc.nextInt();
        sc.close();
        z = calc(x,y);
        System.out.println("result is "+ z.toString());
        String st = "Ð¯ Ñ…Ð¾Ñ€Ð¾ÑˆÐ¸Ð¹ Ñ€Ð°Ð·Ñ€Ð°Ð±Ð¾Ñ‚Ñ‡Ð¸Ðº Ð°Ð²Ñ‚Ð¾Ñ‚ÐµÑÑ‚Ð¾Ð².";
        System.out.println(modify(st,"Ð¿Ð»Ð¾Ñ…Ð¾Ð¹"));
        System.out.println(st.substring(10,21));
    }

    public static int  calc(int x, int y){
        return 3*(x+2*x-y)/(2*x);
    }

    public static String modify(String source, String stobe){
        return source.replace ("Ñ…Ð¾Ñ€Ð¾ÑˆÐ¸Ð¹", stobe);
    }
}

