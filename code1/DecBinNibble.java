class DecBinNibble{
	public static void main (String a[]){
		
    int n;
    //Strings binary hexadecimal
    String bin; String hex, n1, n2, nn;
    
     System.out.println("DEC BIN HEX");
     
    for (n =0; n<= 255; n ++){
		    bin = Integer.toBinaryString(n);
		    hex = Integer.toHexString(n);
		    if(bin.length() == 1)bin = "0000000"+bin;
		    if(bin.length() == 2)bin = "000000"+bin;
            if(bin.length() == 3)bin = "00000"+bin;
		    if(bin.length() == 4)bin = "0000"+bin;
		    if(bin.length() == 5)bin = "000"+bin;
		    if(bin.length() == 6)bin = "00"+bin;
		    if(bin.length() == 7)bin = "0"+bin;
		    
		    System.out.println(n+" "+bin+" "+hex);
		 }
    
    }
}


