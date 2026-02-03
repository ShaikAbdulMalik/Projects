public class PatternCheck {
    public static void main(String[] args) {
     
        String Text = "ShaikAbdulMalikdawdaffafwawfacAbdulMalikdawdadawda";
        String Pattern = "AbdulMalik";

        // boolean result = Text.contains(Pattern);
        // if(result)
        // {
        //     System.out.println("Pattern Found");
        // }
        // else
        // {
        //     System.out.println("Not found");
        // }
        int index = Text.indexOf(Pattern);
        if(index != -1)
        {
            System.out.println("Pattern Found");
            System.out.println("At index : " + index);
        }
        else
        {
            System.out.println("Pattern Not found");
        }

        while(index != -1)
        {
            System.out.print(" "+index);
            index = Text.indexOf(Pattern, index+Pattern.length());
        }
    }
}
