package collectiondemo;
import java.util.ArrayList;
import org.junit.Test;
public class collectiondemo {
	@Test
public  void main() {
		int []arrays= {3,-1,0,23,4,5,63,63,2,34};
		ArrayList <Integer> values=new ArrayList<>();
		System.out.println("The elements present in the array with minimum 10 elements are:");
		for(int variable:arrays)
		{
			values.add(variable);
			System.out.print(variable+" ");
		}
		System.out.println("");
System.out.println("After adding elements into the array to demonstrate zero to infinite elementts:");
values.add(100);
values.add(899);
values.add(89);
for(int variable:values)
{
	System.out.print(variable+" ");
}
System.out.println("");
values.remove(0);
System.out.println("After removing the elements in the array:");
for(int variable:values)
{
	System.out.print(variable+" ");
}
System.out.println("");
System.out.println("To fetch the element from the array index 10:"+values.get(10));
	}

}
