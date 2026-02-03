public class sb {
    public static void main(String[] args) {
     
        StringBuilder sb = new StringBuilder("HelloWorld");

        // This is the length
        int length = sb.length();
        System.out.println("The Length is : "+length);

        // CharAt(index)
        char indexAt = sb.charAt(2);
        System.out.println("The character at this index is : "+indexAt);

        // indexOf()
        int indexof = sb.indexOf("W");
        System.out.println("The index of this charracter is : "+indexof);

        // indexOf(str,fromIndex)
        int IndexOf = sb.indexOf("e", 0);
        System.out.println("The index of the character from the index : "+IndexOf);

        // lastIndexOf(str)
        int LastIndexOf = sb.lastIndexOf("e");
        System.out.println("The last index of this character is : " + LastIndexOf);

        // lastIndexOf(str,fromIndex)
        int LastIndexOf1 = sb.lastIndexOf("o", 9);
        System.out.println("The last char from the index is : " + LastIndexOf1);

        // Here on are exclusive methods that are only used in StringBuilder and StringBuffer  
        // append()
        StringBuilder Append = sb.append("Malik");
        System.out.println("Here is the appended Word : " + Append);

        // insert()
        StringBuilder Insert = sb.insert(9,"Y");
        System.out.println("Inserting Y at index 9 : " + Insert);

        // SetCharAt()
        sb.setCharAt(3 ,'_'  ); // No need for reference 
        StringBuilder Set = sb;
        System.out.println("Replacing the letter l at index 3 with _ : "+Set);

        // reverse()
        StringBuilder Reverse = sb.reverse();
        System.out.println("The Reverse of the word is : " + Reverse);

        // delete()
        StringBuilder Delete = sb.delete(9,13);
        System.out.println("After Deleting "+Delete);

        int Capacity = sb.capacity();
        System.out.println(Capacity); // Here its 26 because initial String size is always 16 and the length is 10 so 16+10 = 26

    }
}
