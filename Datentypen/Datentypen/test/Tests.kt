import org.junit.Test
import org.junit.Assert
import java.util.regex.Pattern

class Test() {
    @Test
    fun testForByteDataType() {
        Assert.assertTrue(Task.returnByteDataType() is Byte)
    }
    @Test
    fun testForShortDataType() {
        Assert.assertTrue(Task.returnShortDataType() is Short)
    }
    @Test
    fun testForIntDataType() {
        Assert.assertTrue(Task.returnIntDataType() is Int)
    }
    @Test
    fun testForLongDataType() {
        Assert.assertTrue(Task.returnLongDataType() is Long)
    }
    @Test
    fun testForFloatDataType() {
        Assert.assertTrue(Task.returnFloatDataType() is Float)
    }
    @Test
    fun testForDoubleDataType() {
        Assert.assertTrue(Task.returnDoubleDataType() is Double)
    }
    @Test
    fun testForBooleanDataType() {
        Assert.assertTrue(Task.returnBooleanDataType() is Boolean)
    }
    @Test
    fun testForCharDataType() {
        Assert.assertTrue(Task.returnCharDataType() is Char)
    }
    @Test
    fun testForStringDataType() {
        Assert.assertTrue(Task.returnStringDataType() is String)
    }
}