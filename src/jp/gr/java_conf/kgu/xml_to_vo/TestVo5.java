package jp.gr.java_conf.kgu.xml_to_vo;

/**
 * 大きなデータのテスト用。
 * 
 * @author kgu
 *
 */
public class TestVo5 {

	@BindPath("/root/biglen")
	private String biglen;
	
	@BindPath("/root/biglenAttr@attr")
	private String biglenAttr;

	public String getBiglen() {
		return biglen;
	}

	public void setBiglen(String biglen) {
		this.biglen = biglen;
	}

	public String getBiglenAttr() {
		return biglenAttr;
	}

	public void setBiglenAttr(String biglenAttr) {
		this.biglenAttr = biglenAttr;
	}
}
