package chapter18.treemap;

import java.util.TreeMap;
import java.util.Iterator;
import chapter17.treeset.Member3;

public class memberTreeMap {

	private static TreeMap<Integer, String> treeMap;
	
	public memberTreeMap() {
		treeMap= new TreeMap<Integer, String>();
		
	}
	public void addMember ( Member3 member) {
		treeMap.put(member.getMemberID() ,member.getMemberName());
	}
	
	//removeMember
	public boolean removeMember(int memberId) {
		
		while(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
			}
		return false;
		}
	
	public static void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			String member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	
	
	
}
