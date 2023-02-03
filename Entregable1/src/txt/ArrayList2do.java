package txt;
import java.util.*;
import java.util.ArrayList;
public class ArrayList2do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);

		
		for(int i=0;i<=list.size();i++) {
			if (list.get(i)%2==0) {
				list.remove(i);
				
			}
		}
		System.out.println(list.get(0));
	}

}
