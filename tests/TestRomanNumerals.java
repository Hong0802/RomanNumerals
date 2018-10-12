import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void Iwhen1() {

        Assert.assertEquals("I", RomanNumerals.convertToString(1));

	}
	@Test
	public void IIwhen2() {

        Assert.assertEquals("II", RomanNumerals.convertToString(2));

	}
	@Test
	public void IIIwhen3() {

        Assert.assertEquals("III", RomanNumerals.convertToString(3));

	}
	@Test
	public void IVwhen4() {

        Assert.assertEquals("IV", RomanNumerals.convertToString(4));

	}
	@Test
	public void Vwhen5() {

        Assert.assertEquals("V", RomanNumerals.convertToString(5));

	}
	@Test
	public void VIwhen6() {

        Assert.assertEquals("VI", RomanNumerals.convertToString(6));

	}
	@Test
	public void VIIwhen7() {

        Assert.assertEquals("VII", RomanNumerals.convertToString(7));

	}
	@Test
	public void VIIIwhen8() {

        Assert.assertEquals("VIII", RomanNumerals.convertToString(8));

	}
	@Test
	public void IXwhen9() {

        Assert.assertEquals("IX", RomanNumerals.convertToString(9));

	}
	@Test
	public void Xwhen10() {

        Assert.assertEquals("X", RomanNumerals.convertToString(10));

	}
	@Test
	public void XXwhen20() {

        Assert.assertEquals("XX", RomanNumerals.convertToString(20));

	}
	@Test
	public void XXXwhen30() {

        Assert.assertEquals("XXX", RomanNumerals.convertToString(30));

	}
	@Test
	public void XLwhen40() {

        Assert.assertEquals("XL", RomanNumerals.convertToString(40));

	}
	@Test
	public void Lwhen50() {

        Assert.assertEquals("L", RomanNumerals.convertToString(50));

	}
	@Test
	public void LXwhen60() {

        Assert.assertEquals("LX", RomanNumerals.convertToString(60));

	}
	@Test
	public void LXXwhen70() {

        Assert.assertEquals("LXX", RomanNumerals.convertToString(70));

	}
	@Test
	public void LXXXwhen80() {

        Assert.assertEquals("LXXX", RomanNumerals.convertToString(80));

	}
	@Test
	public void XCwhen90() {

        Assert.assertEquals("XC", RomanNumerals.convertToString(90));

	}
	@Test
	public void Cwhen100() {

        Assert.assertEquals("C", RomanNumerals.convertToString(100));

	}
	@Test
	public void CCwhen200() {

        Assert.assertEquals("CC", RomanNumerals.convertToString(200));

	}
	@Test
	public void CCCwhen300() {

        Assert.assertEquals("CCC", RomanNumerals.convertToString(300));

	}
	@Test
	public void CDwhen400() {

        Assert.assertEquals("CD", RomanNumerals.convertToString(400));

	}
	@Test
	public void Dwhen500() {

        Assert.assertEquals("D", RomanNumerals.convertToString(500));

	}
	@Test
	public void DCwhen600() {

        Assert.assertEquals("DC", RomanNumerals.convertToString(600));

	}
	@Test
	public void DCCwhen700() {

        Assert.assertEquals("DCC", RomanNumerals.convertToString(700));

	}
	@Test
	public void DCCCwhen800() {

        Assert.assertEquals("DCCC", RomanNumerals.convertToString(800));

	}
	@Test
	public void CMwhen900() {

        Assert.assertEquals("CM", RomanNumerals.convertToString(900));

	}
	@Test
	public void Mwhen1000() {

        Assert.assertEquals("M", RomanNumerals.convertToString(1000));

	}
	@Test
	public void MCMLXXXIVwhen1984() {

        Assert.assertEquals("MCMLXXXIV", RomanNumerals.convertToString(1984));

	}
	@Test
	public void MMXIVwhen2014() {

        Assert.assertEquals("MMXIV", RomanNumerals.convertToString(2014));

	}

}
