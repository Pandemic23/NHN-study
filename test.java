package Converter;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
   

    public static int  binaryToDecomal(String binary){ //2->10 8->10  16->10

            int k=1;
            int j=0;
        
        
        for (int i=0; i<binary.length(); i++){
            
            if(binary.charAt(binary.length()-1-i)=='1')
            {
                j+=k;
                k*=2;
            }
            else
            {
                k*=2;
            }
            
        }
        return j  ;
        
        
    }
    private static String Decomaltobinary(String a) { //10->2 10->8 10->16
		String result = ""; //출력할 값
		Integer A= Integer.valueOf(a);
		for(int i=A; i>0; i/=2) {
			result = String.valueOf(i%2) + result;
    }
    return result;
    }
    
    public static void HexDecomal(String[] args) throws Exception { //16 <->10
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hexInput = br.readLine();
 
        System.out.println("input : " + hexInput);
 
        int decimal = Integer.parseInt(hexInput,16);
        System.out.println("Hex -> Decimal : " + decimal);
 
        String hex = Integer.toHexString(decimal);
        System.out.println("Decimal -> Hex : " + hex);
    }

    public static int OctDec(int b)  { //  8<->10
        String A ="0";
        A =new StringBuilder(A).append(b).toString();
        int result =Integer.valueOf(A);
        return result;
    }



    public static void main(String[] args){
        
        //System.out.println(binaryToDecomal("0101001")); //2진수에서 10진수
        // System.out.println(Decomaltobinary("41")); //10진수에서 2진수
        System.out.println (OctDec(201));
    }


}
    

