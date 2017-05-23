import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class EuroConversionTest {

    @Test
    public void euroToBritishPoundTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected =  8.70;
        double actual = euroConversion.euroToBritishPound(10);

        Assert.assertEquals("This should return 8.70", expected ,actual, .01);
    }

    @Test
    public void euroToAmericanDollarsTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 14.10;
        double actual = euroConversion.euroToAmericanDollars(15);

        Assert.assertEquals("This should return 14.10", expected, actual, .01);
    }

    @Test
    public void euroToRupeeTest(){
        EuroConversion euroConversion = new EuroConversion();

        double expected = 3661.61;
        double actual = euroConversion.euroToRupee(50.38);

        Assert.assertEquals("This should return 3661.61", expected, actual, .01);
    }
}
