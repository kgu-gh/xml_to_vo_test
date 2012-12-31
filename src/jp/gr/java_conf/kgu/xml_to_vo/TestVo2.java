package jp.gr.java_conf.kgu.xml_to_vo;

/**
 * バインドする型のテスト用。
 * 
 * @author kgu
 *
 */
public class TestVo2 {

	@BindPath("/root/typeTest/intType")
	private int intType;
	
	@BindPath("/root/typeTest/byteType")
	private byte byteType;
	
	@BindPath("/root/typeTest/shortType")
	private short shortType;
	
	@BindPath("/root/typeTest/longType")
	private long longType;
	
	@BindPath("/root/typeTest/floatType")
	private float floatType;
	
	@BindPath("/root/typeTest/doubleType")
	private double doubleType;
	
	@BindPath("/root/typeTest/booleanType")
	private boolean booleanType;
	
	@BindPath("/root/typeTest/IntegerType")
	private Integer integerType;
	
	@BindPath("/root/typeTest/ByteType")
	private Byte byteWrapperType;
	
	@BindPath("/root/typeTest/ShortType")
	private Short shortWrapperType;
	
	@BindPath("/root/typeTest/LongType")
	private Long longWrapperType;
	
	@BindPath("/root/typeTest/FloatType")
	private Float floatWrapperType;
	
	@BindPath("/root/typeTest/DoubleType")
	private Double doubleWrapperType;
	
	@BindPath("/root/typeTest/BooleanType")
	private Boolean booleanWrapperType;
	
	@BindPath("/root/typeTest/intType@attribute")
	private int intTypeAttr;
	
	public int getIntType() {
		return intType;
	}
	public void setIntType(int intType) {
		this.intType = intType;
	}
	public int getIntTypeAttr() {
		return intTypeAttr;
	}
	public void setIntTypeAttr(int intTypeAttr) {
		this.intTypeAttr = intTypeAttr;
	}
	public byte getByteType() {
		return byteType;
	}
	public void setByteType(byte byteType) {
		this.byteType = byteType;
	}
	public short getShortType() {
		return shortType;
	}
	public void setShortType(short shortType) {
		this.shortType = shortType;
	}
	public long getLongType() {
		return longType;
	}
	public void setLongType(long longType) {
		this.longType = longType;
	}
	public float getFloatType() {
		return floatType;
	}
	public void setFloatType(float floatType) {
		this.floatType = floatType;
	}
	public double getDoubleType() {
		return doubleType;
	}
	public void setDoubleType(double doubleType) {
		this.doubleType = doubleType;
	}
	public boolean isBooleanType() {
		return booleanType;
	}
	public void setBooleanType(boolean booleanType) {
		this.booleanType = booleanType;
	}
	public Integer getIntegerType() {
		return integerType;
	}
	public void setIntegerType(Integer integerType) {
		this.integerType = integerType;
	}
	public Byte getByteWrapperType() {
		return byteWrapperType;
	}
	public void setByteWrapperType(Byte byteWrapperType) {
		this.byteWrapperType = byteWrapperType;
	}
	public Short getShortWrapperType() {
		return shortWrapperType;
	}
	public void setShortWrapperType(Short shortWrapperType) {
		this.shortWrapperType = shortWrapperType;
	}
	public Long getLongWrapperType() {
		return longWrapperType;
	}
	public void setLongWrapperType(Long longWrapperType) {
		this.longWrapperType = longWrapperType;
	}
	public Float getFloatWrapperType() {
		return floatWrapperType;
	}
	public void setFloatWrapperType(Float floatWrapperType) {
		this.floatWrapperType = floatWrapperType;
	}
	public Double getDoubleWrapperType() {
		return doubleWrapperType;
	}
	public void setDoubleWrapperType(Double doubleWrapperType) {
		this.doubleWrapperType = doubleWrapperType;
	}
	public Boolean getBooleanWrapperType() {
		return booleanWrapperType;
	}
	public void setBooleanWrapperType(Boolean booleanWrapperType) {
		this.booleanWrapperType = booleanWrapperType;
	}
}
