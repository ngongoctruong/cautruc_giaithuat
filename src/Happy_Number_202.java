import java.lang.reflect.Array;
import java.util.ArrayList;

public class Happy_Number_202 {
    public static void main(String[] args) {
        int n = 11111111;
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n){
        String number = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        int cout;
        do{
            cout = 0;
            for (int i = 0; i < number.length(); i++) {
                cout += Integer.parseInt(number.charAt(i) + "" ) * Integer.parseInt(number.charAt(i) + "");
            }System.out.println(cout);
            number= cout + "";

            if(cout==1){
                return true;
            }
            if(list.contains(cout)){
                break;
            }
            list.add(cout);
        }
        while (true) ;

        return false;
    }
}
