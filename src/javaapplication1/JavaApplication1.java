
package javaapplication1;




public class JavaApplication1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        String str = "Salman Salim Khan"; //input any string
        char[] new_str;
        new_str = str.toCharArray();   //converting string into array

        System.out.println( new_str[0] + "."); //we always need first letter of first name
       
        for(int i = 1;i<str.length();i++){
            
            int count = 0;
            for(int j=str.length()-1;j>0;j--){
                
                count++;
                
                
                if(new_str[j]==' '){          //checking spaces from reverse side
                    break;
                }
            }
            
            int z;
            z = (str.length()-count);
            int temp = i;
            if(temp != (z)){
                if(new_str[i]== ' '){       //taking value of i and j same
                    i++;
                    System.out.println(new_str[i] + ".");
                }
            }
            else{
                
                for(int k=i;k<str.length();k++){
                    System.out.println(new_str[k]);
                }
            }
            
        }
        
        
        
        
        
        
        
    }
    

}