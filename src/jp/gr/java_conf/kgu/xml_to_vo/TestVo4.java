package jp.gr.java_conf.kgu.xml_to_vo;

/**
 * 異常系テスト用。
 * 
 * @author kgu
 *
 */
public class TestVo4 {

	@BindPath("/root/exceptions/convertErrorPrimitive")
	private int convertErrorPrimitive;
	
	@BindPath("/root/exceptions/convertErrorWrapper")
	private Integer convertErrorWrapper;
	
	@BindPath("/root/exceptions/cannotCreateInstanceList")
	private CanNotCreateInstanceList cannotCreateInstanceList;
	
	@BindPath("/root/exceptions/bindOkValue")
	private String bindOkValue;

	public int getConvertErrorPrimitive() {
		return convertErrorPrimitive;
	}

	public void setConvertErrorPrimitive(int convertErrorPrimitive) {
		this.convertErrorPrimitive = convertErrorPrimitive;
	}

	public Integer getConvertErrorWrapper() {
		return convertErrorWrapper;
	}

	public void setConvertErrorWrapper(Integer convertErrorWrapper) {
		this.convertErrorWrapper = convertErrorWrapper;
	}

	public CanNotCreateInstanceList getCannotCreateInstanceList() {
		return cannotCreateInstanceList;
	}

	public void setCannotCreateInstanceList(
			CanNotCreateInstanceList cannotCreateInstanceList) {
		this.cannotCreateInstanceList = cannotCreateInstanceList;
	}

	public String getBindOkValue() {
		return bindOkValue;
	}

	public void setBindOkValue(String bindOkValue) {
		this.bindOkValue = bindOkValue;
	}
}
