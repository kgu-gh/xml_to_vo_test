package jp.gr.java_conf.kgu.xml_to_vo;

/**
 * �l�[���X�y�[�X����XML�̃e�X�g�p�B
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
