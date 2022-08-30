public class Source {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(switchItUp(num).equals("One"));
    }
    public static String switchItUp(int number)    {
        String [] str = {"One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine"};
        return switch (number) {
            case 1 -> str[0];
            case 2 -> str[1];
            case 3 -> str[2];
            case 4 -> str[3];
            case 5 -> str[4];
            case 6 -> str[5];
            case 7 -> str[6];
            case 8 -> str[7];
            case 9 -> str[8];
            default -> "Zero";
        }; //return str[number];
    }
}
