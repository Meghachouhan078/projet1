package StringProgram;
 class StringInsert {
public static void main(String[] args) {

    String mainString = "helloworld";
    String StringToInserted = "for";
    int position = 5;

    if(position<0||position>mainString.length()){
        System.out.println("Invalid position");
    }
    else{
String resultString = mainString.substring(0, position)
                    + StringToInserted
                    + mainString.substring(position);

        System.out.println("Resultant string: " + resultString);

}}}