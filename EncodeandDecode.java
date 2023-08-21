package encodeandecode;

import java.util.Base64;

public class EncodeandDecode {
	
//	public static String getEncoded(String value) {
//		 byte[] encodebtye = Base64.getEncoder().encode(value.getBytes());
//		String encodedtext  = new String(encodebtye);
//		return encodedtext;
//	 }
//	
//	public static String getDecoded(String value) {
//		byte[] decodebtye = Base64.getDecoder().decode(value.getBytes());
//		String decodedtext  = new String(decodebtye);
//		return decodedtext;
//	 }
//	
	
         public static void main(String[] args) {
        	     	 
        	 String name="user";
			byte[] encodebyte = Base64.getEncoder().encode(name.getBytes());
			String encodedtext  = new String(encodebyte);
			
			System.out.println("Encoded text " +encodedtext);
			
			 byte[] decodebyte = Base64.getDecoder().decode(encodebyte);
				String decodedtext  = new String(decodebyte);
				
				System.out.println("Encoded text " +decodedtext);
		}
        
}
