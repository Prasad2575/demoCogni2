public class CodeIDE {
    public static void main(String[] args) {



        String str = "prasad";

        String rvs = "";

        for(int i = str.length()-1 ; i >= 0 ; i--){

            rvs = rvs + str.charAt(i);


        }
        System.out.println(rvs);

    }
}


