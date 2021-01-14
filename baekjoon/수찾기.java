import java.util.*;

public class Test {            

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tempN, tempM ;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < n; i++){            
            sb.append(Integer.toString(sc.nextInt()));
        }
        tempN = sb.toString();
        //StringBuffer 초기화, 새로운 문자열을 받아야 되기 때문
        sb.delete(0, sb.length());

        int m = sc.nextInt();        
        for(int i=0; i < m; i++){
            sb.append(Integer.toString(sc.nextInt()));
        }        
        tempM = sb.toString();

        sc.close();        

        for(int i =0; i < m; i++){

            //indexOf를 사용하려고 string 형태로 만들었는데, 두자리, 세자리 같은 숫자들을 고려못함.
            if(tempN.indexOf(tempM.charAt(i)) == -1){
                System.out.println("ch: "+ tempM.charAt(i));
                System.out.println(0);
            }
            else{
                System.out.println("ch: "+ tempM.charAt(i));
                System.out.println(1);            
            }
        }

    }   
}
