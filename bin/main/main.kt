import kotlin.math.max

fun main() {
    println(calculatePrice(790, "Maestro", 6))
}

fun calculatePrice(amount: Int, card: String, moneyTransfers: Int): Int {
    return when (card) {
        "Visa" -> if (amount < 150_000 && amount + moneyTransfers <= 600_000) max(35, (amount * 0.0075).toInt()) else -2
        "Maestro" -> if (amount < 150_000 && amount + moneyTransfers <= 600_000 && amount > 75000) (amount * 0.006 + 20).toInt() else 0
        "VK Pay" -> if (amount < 15_000 && amount + moneyTransfers <= 40_000) 0 else -4
        else -> -1


    }
}

