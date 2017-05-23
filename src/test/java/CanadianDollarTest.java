import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class CanadianDollarTest {
    @Test
    public void canadianDollarToSingaporeDollarTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 82.08;
        double actual = canadianDollar.canadianDollarToSingaporeDollar(76);

        Assert.assertEquals("This should return 82.08", expected, actual, .01);
    }

    @Test
    public void canadianDollarToSwissFrancTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 87.10;
        double actual = canadianDollar.canadianDollarToSwillFranc(67);

        Assert.assertEquals("This should return 87.10", expected, actual, .01);
    }

    @Test
    public void canadianDollarToMalaysianRinggitTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 307.58;
        double actual = canadianDollar.canadianDollarToMalaysianRinggit(91);

        Assert.assertEquals("This should return 307.58", expected, actual, .01);
    }

    @Test
    public void canadianDollarToJapaneseYenTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 7107.75;
        double actual = canadianDollar.canadianDollarToJapaneseYen(81);

        Assert.assertEquals("This should return 7107.75", expected, actual, .01);
    }

    @Test
    public void canadianDollarToChineseYuanRenminbiTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 351.08;
        double actual = canadianDollar.canadianDollarToChineseYaunRenminbi(67);

        Assert.assertEquals("This should return 351.08", expected, actual, .01);
    }

    @Test
    public void canadianDollarToAmericanDollarTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expceted = 14.52;
        double acutal = canadianDollar.canadianDollarToAmericanDollar(11);

        Assert.assertEquals("This should return 14.52", expceted, acutal, .01);
    }

    @Test
    public void canadianDollarToEuroTest(){
        CanadianDollar canadianDollar = new CanadianDollar();

        double expected = 51.80;
        double actual = canadianDollar.canadianDollarToEuro(37);

        Assert.assertEquals("This should return 51.80", expected, actual, .01);
    }

}
