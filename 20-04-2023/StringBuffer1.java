
package Lab;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("This is a String Buffer");
		
		//1. add the string 
		buffer.append(" This is a sample program");
		System.out.println(buffer);
		
		System.out.println();
		
		//2.inser string "Object" at 21st position
		buffer.insert(21, "Object");
		System.out.println("After Insertion : " + buffer);
		
		System.out.println();
		
		//3. reverse the string 
		buffer.reverse();
		System.out.println(buffer);
		
		System.out.println();
		
		//4. replace the word "Buffer" with "Builder"
		StringBuffer strbf = new StringBuffer("This is String Buffer ");
		strbf.replace(15, 22, "Builder");
		System.out.println("After replacing : " + strbf);
				

	}

}
