package jp.gr.java_conf.kgu.xml_to_vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * コレクションのテスト用。
 * 
 * @author kgu
 *
 */
@SuppressWarnings("rawtypes")
public class TestVo3 {
	
	@BindPath("/root/collectionTest/listConcreteClass/ConcreteClass")
	private ArrayList<String> concreteList;
	
	@BindPath("/root/collectionTest/setConcreteClass/ConcreteClass")
	private HashSet<String> concreteSet;
	
	@BindPath("/root/collectionTest/listGenericsValify/genericsValify")
	private List<Integer> genericsValifyList;
	
	@BindPath("/root/collectionTest/listGenericsNon/genericsNon")
	private List genericsNonList;
	
	@BindPath("/root/collectionTest/setGenericsNon/genericsNon")
	private Set genericsNonSet;
	
	@BindPath("/root/collectionTest/listNotNullInit/notNullInit")
	private List<String> notNullInitList = new ArrayList<String>();
	
	@BindPath("/root/collectionTest/setNotNullInit/notNullInit")
	private Set<String> notNullInitSet = new HashSet<String>();
	
	public ArrayList<String> getConcreteList() {
		return concreteList;
	}

	public void setConcreteList(ArrayList<String> concreteList) {
		this.concreteList = concreteList;
	}

	public List<Integer> getGenericsValifyList() {
		return genericsValifyList;
	}

	public void setGenericsValifyList(List<Integer> genericsValifyList) {
		this.genericsValifyList = genericsValifyList;
	}

	public HashSet<String> getConcreteSet() {
		return concreteSet;
	}

	public void setConcreteSet(HashSet<String> concreteSet) {
		this.concreteSet = concreteSet;
	}

	public List getGenericsNonList() {
		return genericsNonList;
	}

	public void setGenericsNonList(List genericsNonList) {
		this.genericsNonList = genericsNonList;
	}
	
	public Set getGenericsNonSet() {
		return genericsNonSet;
	}

	public void setGenericsNonSet(Set genericsNonSet) {
		this.genericsNonSet = genericsNonSet;
	}

	public List<String> getNotNullInitList() {
		return notNullInitList;
	}

	public void setNotNullInitList(List<String> notNullInitList) {
		this.notNullInitList = notNullInitList;
	}

	public Set<String> getNotNullInitSet() {
		return notNullInitSet;
	}

	public void setNotNullInitSet(Set<String> notNullInitSet) {
		this.notNullInitSet = notNullInitSet;
	}
}
