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
 * XmlToVoFacade���e�X�g����N���X�B
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
	public void VO��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("�e�L�X�g�f�[�^", vo.getElementSub());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void VO��XML����擾�����A�g���r���[�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("�A�g���r���[�g�f�[�^", vo.getAttribute());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void List�^�̃t�B�[���h�ɕ������e�L�X�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			Collections.sort(vo.getElementSubs());
			assertEquals(2, vo.getElementSubs().size());
			assertEquals("�e�L�X�g�f�[�^������1", vo.getElementSubs().get(0));
			assertEquals("�e�L�X�g�f�[�^������2", vo.getElementSubs().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void List�^�̃t�B�[���h�ɕ������A�g���r���[�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			Collections.sort(vo.getAttributes());
			assertEquals(2, vo.getAttributes().size());
			assertEquals("�A�g���r���[�g�f�[�^������1", vo.getAttributes().get(0));
			assertEquals("�A�g���r���[�g�f�[�^������2", vo.getAttributes().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Set�^�̃t�B�[���h�ɕ������e�L�X�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getElementSubss());
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("�e�L�X�g�f�[�^������1-1", list.get(0));
			assertEquals("�e�L�X�g�f�[�^������2-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Set�^�̃t�B�[���h�ɕ������A�g���r���[�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getAttributess());
			
			Collections.sort(list);
			assertEquals(2, list.size());
			assertEquals("�A�g���r���[�g�f�[�^������1-1", list.get(0));
			assertEquals("�A�g���r���[�g�f�[�^������2-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Collection�^�̃t�B�[���h�ɕ������e�L�X�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getElementSubsss());
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("�e�L�X�g�f�[�^������1-1-1", list.get(0));
			assertEquals("�e�L�X�g�f�[�^������2-1-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Collection�^�̃t�B�[���h�ɕ������A�g���r���[�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			List<String> list = new ArrayList<String>(vo.getAttributesss());
			
			Collections.sort(list);
			assertEquals(2, list.size());
			assertEquals("�A�g���r���[�g�f�[�^������1-1-1", list.get(0));
			assertEquals("�A�g���r���[�g�f�[�^������2-1-1", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void int�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(2, vo.getIntType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void byte�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(3, vo.getByteType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void short�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(4, vo.getShortType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void long�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(1000000, vo.getLongType());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void float�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getFloatType() == 1000.5F);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void double�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getDoubleType() == 555.582D);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void boolean�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.isBooleanType());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Integer�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(700000, vo.getIntegerType().intValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Byte�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(8, vo.getByteWrapperType().byteValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Short�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(5, vo.getShortWrapperType().shortValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Long�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(9000000, vo.getLongWrapperType().longValue());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Float�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getFloatWrapperType().floatValue() == 999.51F);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Double�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getDoubleWrapperType().doubleValue() == 55598.58277D);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Boolean�^�t�B�[���h��XML����擾�����e�L�X�g�f�[�^���ݒ肳��Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertTrue(vo.getBooleanWrapperType().booleanValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void XML����擾�����A�g���r���[�g�f�[�^�ɂ��R���o�[�g���s���Ă��邩() {
		try {
			TestVo2 vo = XmlToVoFacade.parseXmlToVo(TestVo2.class, 
					new FileInputStream("test2.xml"));
			
			assertEquals(1, vo.getIntTypeAttr());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void List������������ۃN���X���^�Ɏ��t�B�[���h�Ƀo�C���h�ł��邩() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getConcreteList());
			
			assertEquals(2, vo.getConcreteList().size());
			assertEquals("List��ۃN���X1", vo.getConcreteList().get(0));
			assertEquals("List��ۃN���X2", vo.getConcreteList().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Set������������ۃN���X���^�Ɏ��t�B�[���h�Ƀo�C���h�ł��邩() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			List<String> list = new ArrayList<String>(vo.getConcreteSet());
			
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("Set��ۃN���X1", list.get(0));
			assertEquals("Set��ۃN���X2", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �R���N�V�����t�B�[���h�̃W�F�l���N�X���L����() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getGenericsValifyList());
			
			assertEquals(2, vo.getGenericsValifyList().size());
			assertEquals(5000, vo.getGenericsValifyList().get(0).intValue());
			assertEquals(7000, vo.getGenericsValifyList().get(1).intValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void �W�F�l���N�X���Ȃ�List���^�Ɏ��t�B�[���h�ɒl���o�C���h�ł��邩() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getGenericsNonList());
			
			assertEquals(2, vo.getGenericsNonList().size());
			assertEquals("List�W�F�l���N�X�Ȃ�1", vo.getGenericsNonList().get(0));
			assertEquals("List�W�F�l���N�X�Ȃ�2", vo.getGenericsNonList().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void �W�F�l���N�X���Ȃ�Set���^�Ɏ��t�B�[���h�ɒl���o�C���h�ł��邩() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			List<String> list = new ArrayList<String>(vo.getGenericsNonSet());
			
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("Set�W�F�l���N�X�Ȃ�1", list.get(0));
			assertEquals("Set�W�F�l���N�X�Ȃ�2", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void List���^�Ɏ��t�B�[���h�̏����l��null�łȂ��ꍇ�ɒl���o�C���h�ł��邩() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			Collections.sort(vo.getNotNullInitList());
			
			assertEquals(2, vo.getNotNullInitList().size());
			assertEquals("List�̏����l��null�łȂ�1", vo.getNotNullInitList().get(0));
			assertEquals("List�̏����l��null�łȂ�2", vo.getNotNullInitList().get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void Set���^�Ɏ��t�B�[���h�̏����l��null�łȂ��ꍇ�ɒl���o�C���h�ł��邩() {
		try {
			TestVo3 vo = XmlToVoFacade.parseXmlToVo(TestVo3.class, 
					new FileInputStream("test3.xml"));
			
			List<String> list = new ArrayList<String>(vo.getNotNullInitSet());
			
			Collections.sort(list);
			
			assertEquals(2, list.size());
			assertEquals("Set�̏����l��null�łȂ�1", list.get(0));
			assertEquals("Set�̏����l��null�łȂ�2", list.get(1));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void XML����擾�����e�L�X�g�f�[�^����̂Ƃ�VO�̃t�B�[���h�ɋ󕶎����ݒ肳��Ă��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("", vo.getElementEmpty());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void VO�̃t�B�[���h�̃o�C���h�p�X�Ɏw�肵���v�f��XML�Ȃ��Ƃ�null���ݒ肳��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertNull(vo.getElementNull());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �^�̃R���o�[�g�Ɏ��s�����Ƃ��v���~�e�B�u�^�t�B�[���h�ɏ����l���ݒ肳��Ă��邩() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
			
			assertEquals(0, vo.getConvertErrorPrimitive());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �^�̃R���o�[�g�Ɏ��s�����Ƃ����b�p�[�^�t�B�[���h�ɏ����l���ݒ肳��Ă��邩() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
			
			assertNull(vo.getConvertErrorWrapper());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �傫�ȃT�C�Y�̃e�L�X�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo5 vo = XmlToVoFacade.parseXmlToVo(TestVo5.class, 
					new FileInputStream("test5.xml"));
			
			assertEquals(8000, vo.getBiglen().length());
			
			Pattern p = Pattern.compile("^[��]+$");
			assertTrue(p.matcher(vo.getBiglen()).find());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �傫�ȃT�C�Y�̃A�g���r���[�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo5 vo = XmlToVoFacade.parseXmlToVo(TestVo5.class, 
					new FileInputStream("test5.xml"));
			
			assertEquals(8000, vo.getBiglenAttr().length());
			
			Pattern p = Pattern.compile("^[��]+$");
			assertTrue(p.matcher(vo.getBiglenAttr()).find());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �G�X�P�[�v���ꂽ�������܂ރe�L�X�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("&����<������   �@��>������\"��'", vo.getEscapeIncluded());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �G�X�P�[�v���ꂽ�������܂ރA�g���r���[�g�f�[�^���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("&attr����<������   �@��>������\"��'", vo.getEscapeIncludedAttr());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �l�[���X�y�[�X�������Ă����[�J���l�[���ŃA�N�Z�X�ł��邩() {
		try {
			TestVo6 vo = XmlToVoFacade.parseXmlToVo(TestVo6.class, 
					new FileInputStream("test6.xml"));
			
			assertEquals("���O��Ԃ������Ă����[�J���l�[���ŃA�N�Z�X�ł���", vo.getNsAttach());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void XML�`�����s���̂Ƃ��G���[�ɂȂ邩() {
		try {
			XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test7.xml"));
			
			fail("����I���̂��߁A�e�X�g���s�B");
			
		} catch (XmlToVoException xtve) {
			assertTrue(xtve.getCause() instanceof SAXParseException); 
		} catch (Exception e) {
			e.printStackTrace();
			fail("�z��O�̗�O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void VO�̃C���X�^���X�������ł��Ȃ��Ƃ��G���[�ɂȂ邩() {
		try {
			XmlToVoFacade.parseXmlToVo(CanNotCreateInstance.class, 
					new FileInputStream("test1.xml"));
			
			fail("����I���̂��߁A�e�X�g���s�B");
			
		} catch (XmlToVoException xtve) {
			xtve.getCause().printStackTrace();
			
			assertTrue(xtve.getCause() instanceof IllegalAccessException); 
		} catch (Exception e) {
			e.printStackTrace();
			fail("�z��O�̗�O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void VO�ɃC���X�^���X�������ł��Ȃ�List������Ƃ��l��null�ƂȂ邩() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
		 
			assertNull(vo.getCannotCreateInstanceList());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void ����t�B�[���h�̃G���[���ʂ̃t�B�[���h�ɉe�����Ȃ���() {
		try {
			TestVo4 vo = XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
		 
			assertEquals("�ʂ̃t�B�[���h�ŃG���[���������Ă����̃t�B�[���h�ɂ͉e�����Ȃ�", vo.getBindOkValue());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �I�[�o�[���[�h���ꂽ���\�b�h�������Ă��l�ݒ肳��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
		 
			assertEquals("�I�[�o�[���[�h���ꂽ���\�b�h�������Ă��l�ݒ肳���", vo.getTwoGetterSetter());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �t�B�[���h��gettersetter�̌^������Ă��l�ݒ肳��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
		 
			assertEquals(1001, vo.getTypeDiff());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �����R�[�h��ύX�����ꍇ�ł��������l�ێ�����邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test8.xml"));
			
			assertEquals("�e�L�X�g�f�[�^", vo.getElementSub());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �o�C���h�p�X�Ɏg�p���镶�����e�L�X�g�f�[�^�ɂ����Ă��l���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("@/", vo.getBindPathChar());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void �o�C���h�p�X�Ɏg�p���镶�����A�g���r���[�g�f�[�^�ɂ����Ă��l���ێ��ł��邩() {
		try {
			TestVo1 vo = XmlToVoFacade.parseXmlToVo(TestVo1.class, 
					new FileInputStream("test1.xml"));
			
			assertEquals("@/attr", vo.getBindPathCharAttr());
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		}
	}
	
	@Test
	public void printError��true�̂Ƃ��X�^�b�N�ƃ��[�X���o�͂���邩_assert�Ȃ��ڎ��m�F�p() {
		try {
			XmlToVoFacade.setPrintError(true);
			
			XmlToVoFacade.parseXmlToVo(TestVo4.class, 
					new FileInputStream("test4.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			fail("��O�����̂��߁A�e�X�g���s�B");
		} finally {
			XmlToVoFacade.setPrintError(false);
		}
	}

}
