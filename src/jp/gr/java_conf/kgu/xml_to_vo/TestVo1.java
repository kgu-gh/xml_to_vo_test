package jp.gr.java_conf.kgu.xml_to_vo;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 正常系テスト用。
 * 
 * @author kgu
 *
 */
public class TestVo1 {

	@BindPath("/root/normal/element/elementSub")
	private String elementSub;
	
	@BindPath("/root/normal/element/elementSub@attribute")
	private String attribute;

	@BindPath("/root/normal/elements/elementSubs")
	private List<String> elementSubs;
	
	@BindPath("/root/normal/elements/elementSubs@attribute")
	private List<String> attributes;
	
	@BindPath("/root/normal/elements/elementSubss")
	private Set<String> elementSubss;
	
	@BindPath("/root/normal/elements/elementSubss@attribute")
	private Set<String> attributess;
	
	@BindPath("/root/normal/elements/elementSubsss")
	private Collection<String> elementSubsss;
	
	@BindPath("/root/normal/elements/elementSubsss@attribute")
	private Collection<String> attributesss;
	
	@BindPath("/root/normal/elementEmpty/elementSub")
	private String elementEmpty;
	
	@BindPath("/root/normal/elementNull/elementSub")
	private String elementNull;
	
	@BindPath("/root/normal/escapeIncluded")
	private String escapeIncluded;
	
	@BindPath("/root/normal/escapeIncludedAttr@attr")
	private String escapeIncludedAttr;
	
	@BindPath("/root/normal/twoGetterSetter")
	private String twoGetterSetter;
	
	@BindPath("/root/normal/typeDiff")
	private String typeDiff;
	
	@BindPath("/root/normal/bindPathChar")
	private String bindPathChar;
	
	@BindPath("/root/normal/bindPathCharAttr@attr")
	private String bindPathCharAttr;
	
	public String getElementSub() {
		return elementSub;
	}

	public void setElementSub(String elementSub) {
		this.elementSub = elementSub;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public List<String> getElementSubs() {
		return elementSubs;
	}
	
	public void setElementSubs(List<String> elementSubs) {
		this.elementSubs = elementSubs;
	}

	public List<String> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public Set<String> getElementSubss() {
		return elementSubss;
	}

	public void setElementSubss(Set<String> elementSubss) {
		this.elementSubss = elementSubss;
	}

	public Set<String> getAttributess() {
		return attributess;
	}

	public void setAttributess(Set<String> attributess) {
		this.attributess = attributess;
	}

	public Collection<String> getElementSubsss() {
		return elementSubsss;
	}

	public void setElementSubsss(Collection<String> elementSubsss) {
		this.elementSubsss = elementSubsss;
	}

	public Collection<String> getAttributesss() {
		return attributesss;
	}

	public void setAttributesss(Collection<String> attributesss) {
		this.attributesss = attributesss;
	}

	public String getElementEmpty() {
		return elementEmpty;
	}

	public void setElementEmpty(String elementEmpty) {
		this.elementEmpty = elementEmpty;
	}

	public String getElementNull() {
		return elementNull;
	}

	public void setElementNull(String elementNull) {
		this.elementNull = elementNull;
	}

	public String getEscapeIncluded() {
		return escapeIncluded;
	}

	public void setEscapeIncluded(String escapeIncluded) {
		this.escapeIncluded = escapeIncluded;
	}

	public String getEscapeIncludedAttr() {
		return escapeIncludedAttr;
	}

	public void setEscapeIncludedAttr(String escapeIncludedAttr) {
		this.escapeIncludedAttr = escapeIncludedAttr;
	}

	public String getTwoGetterSetter() {
		return twoGetterSetter;
	}

	public void setTwoGetterSetter(String twoGetterSetter) {
		this.twoGetterSetter = twoGetterSetter;
	}
	
	public String getTwoGetterSetter(int i) {
		return twoGetterSetter;
	}
	
	public void setTwoGetterSetter(int x, String twoGetterSetter) {
		this.twoGetterSetter = twoGetterSetter;
	}

	public int getTypeDiff() {
		return new Integer(typeDiff).intValue();
	}

	public void setTypeDiff(int typeDiff) {
		this.typeDiff = new Integer(typeDiff).toString();
	}

	public String getBindPathChar() {
		return bindPathChar;
	}

	public void setBindPathChar(String bindPathChar) {
		this.bindPathChar = bindPathChar;
	}

	public String getBindPathCharAttr() {
		return bindPathCharAttr;
	}

	public void setBindPathCharAttr(String bindPathCharAttr) {
		this.bindPathCharAttr = bindPathCharAttr;
	}
}
