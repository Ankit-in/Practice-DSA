
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find find string present on name string
		String name="this is ankit kumr. i'm btech ankit";
		String find="ankit";
		//contains method return true if String present in 2nd String.
		System.out.println("contains"+" "+name.contains(find));
		//indexof takes string as input and gives index if string present if not present return -1;
		System.out.println("indexof string "+ " "+name.indexOf(find));
		//indexof takes char as input and return index if not present then return -1;
		System.out.println("indexof char"+" "+name.indexOf('n'));
		//indexof(string,index from) takes String that we want to find and index from where in another string it will search.
		System.out.println("indexof String,index from "+" "+name.indexOf(find,9));
		//indexof(ch,index from) do same work as above indexof but with char.
		System.out.println("indexof char,index from"+" "+name.indexOf('a', 9));
		//lastIndexof(char) takes char and return index value from last occurance if not present retunr -1.
		System.out.println("lastIndexof char"+" "+name.lastIndexOf('h'));
		//lastIndexof(string) takes string and return index.
		System.out.println("lastIndexof String"+" "+name.lastIndexOf(find));
		//lastIndexof(char,from index) takes char that want to find and index from where in to search start
		System.out.println("lastIndexof char,from index"+" "+name.lastIndexOf('a', 12));
		//lastIndexof(String,from index) works same as above lastIndex; 
		System.out.println("lastIndexof String,from index"+" "+name.lastIndexOf(find, name.length()-1));
		//charAt(index) gives value at that index;
		System.out.println("charAt(index) "+" "+name.charAt(0));
		//codePointAt(index) gives ascii value of index At value;like here at index 0 -> t and t ascii value is 116
		System.out.println("codePointAt(index) "+name.codePointAt(0));
		//codePointBefore(index) give before index value ascii code;
		System.out.println("codePointBefore(index) "+name.codePointBefore(1));
		// codePointcount(begain index,endindex) count start from begain index, till endindex-1; here endindex is not added;
		System.out.println("codePointCount "+name.codePointCount(0, 30));
		System.out.println(name.compareTo(find));
		
		
		

	}

}
