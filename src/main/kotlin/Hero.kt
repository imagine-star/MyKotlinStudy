@file:JvmName("Hero")

import java.io.IOException

/**
 * @Author STAR
 * @Description kotlin测试文件
 * @Date 2022/8/1 22:21
 */
fun main(args: Array<String>) {
    val adversary = Jhava()
    adversary.utterGreeting().easyPrint()

    val friendshipLevel = adversary.determineFriendshipLevel()
    friendshipLevel?.lowercase() ?: "It's complicated.".easyPrint()

    val adversaryHitPoints = adversary.hitPoints
    adversaryHitPoints.dec().easyPrint()
    adversaryHitPoints.javaClass.easyPrint()

    adversary.greeting = "Hello, Hero."
    adversary.utterGreeting().easyPrint()

    adversary.offerFood()

    try {
        adversary.extendHandInFriendship()
    } catch (e: Exception) {
        "Begone, foul beast!".easyPrint()
    }
}

val translator = { utterance: String ->
    utterance.lowercase().capitalize().easyPrint()
}

fun makeProclamation() = "Greeting, beast!"

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    "Mmmm... you hand over some delicious $leftHand and $rightHand.".easyPrint()
}

@Throws(IOException::class)
fun acceptApology() {
    throw IOException()
}

class Spellbook {

    @JvmField
    val spells = listOf("Magic Ms. L", "Lay on Hans")

    companion object {
        @JvmField
        val MAX_SPELL_COUNT = 10
        @JvmStatic
        fun getSpellbookGreeting() = "I am the Greet Grimoire!".easyPrint()
    }

}