class TypeCast{
	public static void main (String[] args){
//implicite casting
		int a = 10000;
		double b = a;
        System.out.println(b);
//Explicite casting
System.out.println("------------------------character Captail-----------------------");
        for(char c = 'A'; c <= 'Z'; c++)
        {
            int d = (int)c;
            System.out.println(d);
        }
System.out.println("------------------Small letters --------------------------------");
        for(char c = 'a'; c <= 'z'; c++)
        {
            int d = (int)c;
            System.out.println(d);
        }
	}
}