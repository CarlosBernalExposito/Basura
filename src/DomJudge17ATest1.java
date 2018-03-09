import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DomJudge17ATest1 {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Assert.assertEquals(2, DomJudge17A.contaPeces(1, 2));
		Assert.assertEquals(14, DomJudge17A.contaPeces(3, 3));
		Assert.assertEquals(1, DomJudge17A.contaPeces(1,1));
		Assert.assertEquals(55, DomJudge17A.contaPeces(5, 5));
		Assert.assertEquals(0, DomJudge17A.contaPeces(0, 0));
		Assert.assertEquals(385, DomJudge17A.contaPeces(10, 10));
		Assert.assertEquals(18, DomJudge17A.contaPeces(1, 18));
		Assert.assertEquals(18, DomJudge17A.contaPeces(18, 1));
		Assert.assertEquals(2, DomJudge17A.contaPeces(2, 1));
		Assert.assertEquals(168, DomJudge17A.contaPeces(7, 8));
		Assert.assertEquals(168, DomJudge17A.contaPeces(8, 7));
		Assert.assertEquals(70, DomJudge17A.contaPeces(5, 6));
		Assert.assertEquals(70, DomJudge17A.contaPeces(6, 5));
		Assert.assertEquals(100, DomJudge17A.contaPeces(5, 8));
		Assert.assertEquals(100, DomJudge17A.contaPeces(8, 5));
		Assert.assertEquals(40, DomJudge17A.contaPeces(4, 5));
		Assert.assertEquals(40, DomJudge17A.contaPeces(5, 4));
		Assert.assertEquals(12, DomJudge17A.contaPeces(12,1));
		
	}

}
