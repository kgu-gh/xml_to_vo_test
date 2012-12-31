package jp.gr.java_conf.kgu.xml_to_vo;

/**
 * ネームスペースありXMLのテスト用。
 * 
 * @author kgu
 *
 */
public class TestVo6 {

	@BindPath("/root/nsTest/nsAttach")
	private String nsAttach;

	public String getNsAttach() {
		return nsAttach;
	}

	public void setNsAttach(String nsAttach) {
		this.nsAttach = nsAttach;
	}
}
