public class string {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2= "Om Pathak";
        System.out.println(str2.charAt(3));
        char[] charArray = str2.toCharArray();
        int j = charArray.length-1;
        int i = 0;
        while(i<j){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        charArray.toString;
        System.out.println(new String(charArray));
        // System.out.println("Original String: " + str);

        // // Convert to uppercase
        // String upperStr = str.toUpperCase();
        // System.out.println("Uppercase String: " + upperStr);

        // // Convert to lowercase
        // String lowerStr = str.toLowerCase();
        // System.out.println("Lowercase String: " + lowerStr);

        // // Get the length of the string
        // int length = str.length();
        // System.out.println("Length of the String: " + length);

        // // Check if the string contains a substring
        // boolean containsWorld = str.contains("World");
        // System.out.println("Contains 'World': " + containsWorld);

        // // Replace a substring
        // String replacedStr = str.replace("World", "Java");
        // System.out.println("Replaced String: " + replacedStr);
        // System.out.println(str.indexOf(","));
        // System.out.println(str.concat(str2));
        

    }

}
