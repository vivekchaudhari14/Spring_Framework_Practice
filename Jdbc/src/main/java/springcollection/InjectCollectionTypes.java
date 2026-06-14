package springcollection;

 import java.util.ArrayList;
 import java.util.Set;
 import java.util.HashMap;

public class InjectCollectionTypes {
	private ArrayList<Integer> roll_Number;
	private Set<String> name;
	private HashMap<String,String> sub_Add;
	public ArrayList<Integer> getRoll_Number() {
		return roll_Number;
	}
	public void setRoll_Number(ArrayList<Integer> roll_Number) {
		this.roll_Number = roll_Number;
	}
	public Set<String> getName() {
		return name;
	}
	public void setName(Set<String> name) {
		this.name = name;
	}
	public HashMap<String, String> getSub_Add() {
		return sub_Add;
	}
	public void setSub_Add(HashMap<String, String> sub_Add) {
		this.sub_Add = sub_Add;
	}
	public InjectCollectionTypes(ArrayList<Integer> roll_Number, Set<String> name, HashMap<String, String> sub_Add) {
		super();
		this.roll_Number = roll_Number;
		this.name = name;
		this.sub_Add = sub_Add;
	}
	public InjectCollectionTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InjectCollectionTypes [roll_Number=" + roll_Number + ", name=" + name + ", sub_Add=" + sub_Add + "]";
	}
	
	
}
