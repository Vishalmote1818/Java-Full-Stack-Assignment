public class CheckCharacter {
    
    public static void main(String[] args) {
        
        char ch='a';
        
        if(Character.isUpperCase(ch)){
            System.out.println("Character is Uppercase.");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("Character is Lowercase.");
        }
        else if(Character.isDigit(ch)){
            System.out.println("Character is digit.");
        }
        else{

            System.out.println("Character is special character.");
        }
    }
}
