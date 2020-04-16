import java.util.Scanner;

public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
		boolean result = true;
        a=a.toUpperCase();
        b=b.toUpperCase();

        int alen = a.length();
        int blen = b.length();

        if(alen != blen){
            return false;
        }
        else{
            char aArr[]= a.toCharArray();
            char bArr[] =b.toCharArray();

            for(int i=0;i<aArr.length-1;i++){
                for(int j=0;j<aArr.length-i-1;j++){

                if(aArr[j] >aArr[j+1]){
                    char temp =aArr[j];
                    aArr[j] = aArr[j+1];
                    aArr[j+1] = temp;
                }

                if(bArr[j] >bArr[j+1]){
                    char temp =bArr[j];
                    bArr[j] = bArr[j+1];
                    bArr[j+1] = temp;
                }
            }}

            System.out.println(aArr);
            System.out.println(bArr);
			for(int i=0;i<aArr.length;i++){
                
                if(aArr[i] != bArr[i]){
					result = false;
					break;
                }
            }
        }
        return result;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println(ret);
    }
}
