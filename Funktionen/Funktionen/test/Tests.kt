import org.junit.Test
import org.junit.Assert
import java.util.regex.Pattern

class Test() {
    @Test
    fun testQuaqdratVon() {
        val xValues = listOf(
                Task.quadratVon(4),
                Task.quadratVon(5),
                Task.quadratVon(7),
                Task.quadratVon(2),
                Task.quadratVon(745),
                Task.quadratVon(346))
        Assert.assertEquals(listOf(4,5,7,2,745,346).map { it*it }.toString(), xValues.toString())
    }

    @Test
    fun testHalloWorldAusgaben() {
        Assert.assertEquals("HalloWorld", Task.halloWorldAusgeben())
    }

    @Test
    fun summeAusZweiGanzenZahlen(){
        val summen = listOf(
                3 to 5,
                57 to 64,
                434734 to 3424,
                0 to 0,
                92 to -4
        )
        Assert.assertEquals(summen.map { it.first+it.second }, summen.map { Task.summeVonGanzenZahlen(it.first, it.second) })
    }
}
