package test.java.com.tests;

public class finra_yasmin {

    public static void main(String[] args) {

        String result = ""; // finra
        for(int i=1; i <= 100; i++) {
            if(i % 5==0 && i %3 ==0) // two conditions
                result += "FINRA ";
            else if(i%5 == 0)
                result += "RA";
            else if(i%3==0)
                result+="FIN";
            else
                result += i+" ";
        }
        System.out.println(result);
    }




    }





