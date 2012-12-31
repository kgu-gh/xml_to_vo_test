package jp.gr.java_conf.kgu.xml_to_vo;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXParseException;

/**
 * XmlToVoFacadeをテストするクラス。
 * 
 * @author kgu
 *
 */
public class XmlToVoFacadeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void VOにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("テキストデータ", vo.getElementSub());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void VOにXMLから取得したアトリビュートデータが設定されているか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("アトリビュートデータ", vo.getAttribute());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void List型のフィールドに複数件テキストデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			Collections.sort(vo.getElementSubs());
			assertEquals(2, vo.getElementSubs().size());
			assertEquals("テキストデータ複数件1", vo.getElementSubs().get(0));
			assertEquals("テキストデータ複数件2", vo.getElementSubs().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void List型のフィールドに複数件アトリビュートデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			Collections.sort(vo.getAttributes());
			assertEquals(2, vo.getAttributes().size());
			assertEquals("アトリビュートデータ複数件1", vo.getAttributes().get(0));
			assertEquals("アトリビュートデータ複数件2", vo.getAttributes().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Set型のフィールドに複数件テキストデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getElementSubss());
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("テキストデータ複数件1-1", list.get(0));
			assertEquals("テキストデータ複数件2-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Set型のフィールドに複数件アトリビュートデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getAttributess());
			
			Collections.sort(list);
			assertEquals(2, list.size());
			assertEquals("アトリビュートデータ複数件1-1", list.get(0));
			assertEquals("アトリビュートデータ複数件2-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Collection型のフィールドに複数件テキストデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getElementSubsss());
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("テキストデータ複数件1-1-1", list.get(0));
			assertEquals("テキストデータ複数件2-1-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Collection型のフィールドに複数件アトリビュートデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getAttributesss());
			
			Collections.sort(list);
			assertEquals(2, list.size());
			assertEquals("アトリビュートデータ複数件1-1-1", list.get(0));
			assertEquals("アトリビュートデータ複数件2-1-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void int型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(2, vo.getIntType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void byte型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(3, vo.getByteType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void short型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(4, vo.getShortType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void long型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(1000000, vo.getLongType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void float型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getFloatType() == 1000.5F);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void double型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getDoubleType() == 555.582D);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void boolean型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.isBooleanType());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Integer型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(700000, vo.getIntegerType().intValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Byte型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(8, vo.getByteWrapperType().byteValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Short型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(5, vo.getShortWrapperType().shortValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Long型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(9000000, vo.getLongWrapperType().longValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Float型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getFloatWrapperType().floatValue() == 999.51F);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Double型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getDoubleWrapperType().doubleValue() == 55598.58277D);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Boolean型フィールドにXMLから取得したテキストデータが設定されているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getBooleanWrapperType().booleanValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void XMLから取得したアトリビュートデータにもコンバートが行われているか() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(1, vo.getIntTypeAttr());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Listを実装した具象クラスを型に持つフィールドにバインドできるか() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getConcreteList());
			
			assertEquals(2, vo.getConcreteList().size());
			assertEquals("List具象クラス1", vo.getConcreteList().get(0));
			assertEquals("List具象クラス2", vo.getConcreteList().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Setを実装した具象クラスを型に持つフィールドにバインドできるか() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			List<String> list = new ArrayList<String>(vo.getConcreteSet());
			
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("Set具象クラス1", list.get(0));
			assertEquals("Set具象クラス2", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void コレクションフィールドのジェネリクスが有効か() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getGenericsValifyList());
			
			assertEquals(2, vo.getGenericsValifyList().size());
			assertEquals(5000, vo.getGenericsValifyList().get(0).intValue());
			assertEquals(7000, vo.getGenericsValifyList().get(1).intValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void ジェネリクスがないListを型に持つフィールドに値をバインドできるか() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getGenericsNonList());
			
			assertEquals(2, vo.getGenericsNonList().size());
			assertEquals("Listジェネリクスなし1", vo.getGenericsNonList().get(0));
			assertEquals("Listジェネリクスなし2", vo.getGenericsNonList().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void ジェネリクスがないSetを型に持つフィールドに値をバインドできるか() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			List<String> list = new ArrayList<String>(vo.getGenericsNonSet());
			
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("Setジェネリクスなし1", list.get(0));
			assertEquals("Setジェネリクスなし2", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Listを型に持つフィールドの初期値がnullでない場合に値をバインドできるか() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getNotNullInitList());
			
			assertEquals(2, vo.getNotNullInitList().size());
			assertEquals("Listの初期値がnullでない1", vo.getNotNullInitList().get(0));
			assertEquals("Listの初期値がnullでない2", vo.getNotNullInitList().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void Setを型に持つフィールドの初期値がnullでない場合に値をバインドできるか() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			List<String> list = new ArrayList<String>(vo.getNotNullInitSet());
			
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("Setの初期値がnullでない1", list.get(0));
			assertEquals("Setの初期値がnullでない2", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void XMLから取得したテキストデータが空のときVOのフィールドに空文字が設定されているか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("", vo.getElementEmpty());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void VOのフィールドのバインドパスに指定した要素がXMLないときnullが設定されるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertNull(vo.getElementNull());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void 型のコンバートに失敗したときプリミティブ型フィールドに初期値が設定されているか() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
			
			assertEquals(0, vo.getConvertErrorPrimitive());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void 型のコンバートに失敗したときラッパー型フィールドに初期値が設定されているか() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
			
			assertNull(vo.getConvertErrorWrapper());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void 大きなサイズのテキストデータが保持できるか() {
		try {
			TestVo5 vo = XmlToVoFacade.parseXmlToVo(TestVo5.class, 
					new FileInputStream("test5.xml"));
			
			assertEquals(8000, vo.getBiglen().length());
			
			Pattern p = Pattern.compile("^[あ]+$");
			assertTrue(p.matcher(vo.getBiglen()).find());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void 大きなサイズのアトリビュートデータが保持できるか() {
		try {
			TestVo5 vo = XmlToVoFacade.parseXmlToVo(TestVo5.class, 
					new FileInputStream("test5.xml"));
			
			assertEquals(8000, vo.getBiglenAttr().length());
			
			Pattern p = Pattern.compile("^[い]+$");
			assertTrue(p.matcher(vo.getBiglenAttr()).find());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void エスケープされた文字を含むテキストデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("&あい<うえお   　か>きくけ\"こ'", vo.getEscapeIncluded());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void エスケープされた文字を含むアトリビュートデータが保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("&attrあい<うえお   　か>きくけ\"こ'", vo.getEscapeIncludedAttr());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void ネームスペースがあってもローカルネームでアクセスできるか() {
		try {
			TestVo6 vo = XmlToVoFacade.parseXmlToVo(TestVo6.class, 
					new FileInputStream("test6.xml"));
			
			assertEquals("名前空間があってもローカルネームでアクセスできる", vo.getNsAttach());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void XML形式が不正のときエラーになるか() {
		try {
			XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test7.xml"));
			
			fail("正常終了のため、テスト失敗。");
			
		} catch (XmlToVoException xtve) {
			assertTrue(xtve.getCause() instanceof SAXParseException); 
		} catch (Exception e) {
			e.printStackTrace();
			fail("想定外の例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void VOのインスタンスが生成できないときエラーになるか() {
		try {
			XmlToVoFacade.parseXmlToVo(CanNotCreateInstance.class, 
					new FileInputStream("test1.xml"));
			
			fail("正常終了のため、テスト失敗。");
			
		} catch (XmlToVoException xtve) {
			xtve.getCause().printStackTrace();
			
			assertTrue(xtve.getCause() instanceof IllegalAccessException); 
		} catch (Exception e) {
			e.printStackTrace();
			fail("想定外の例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void VOにインスタンスが生成できないListがあるとき値はnullとなるか() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
		 
			assertNull(vo.getCannotCreateInstanceList());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void あるフィールドのエラーが別のフィールドに影響しないか() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
		 
			assertEquals("別のフィールドでエラーが発生しても他のフィールドには影響しない", vo.getBindOkValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void オーバーロードされたメソッドがあっても値設定されるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
		 
			assertEquals("オーバーロードされたメソッドがあっても値設定される", vo.getTwoGetterSetter());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void フィールドとgettersetterの型が違っても値設定されるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
		 
			assertEquals(1001, vo.getTypeDiff());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void 文字コードを変更した場合でも正しく値保持されるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test8.xml"));
			
			assertEquals("テキストデータ", vo.getElementSub());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void バインドパスに使用する文字がテキストデータにあっても値が保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("@/", vo.getBindPathChar());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void バインドパスに使用する文字がアトリビュートデータにあっても値が保持できるか() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("@/attr", vo.getBindPathCharAttr());
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		}
	}
	
	@Test
	public void printErrorがtrueのときスタックとレースが出力されるか_assertなし目視確認用() {
		try {
			XmlToVoFacade.setPrintError(true);
			
			XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("例外発生のため、テスト失敗。");
		} finally {
			XmlToVoFacade.setPrintError(false);
		}
	}

}
