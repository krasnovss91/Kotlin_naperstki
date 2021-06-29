fun main(args: Array<String>) {
    val naperstok = (1..3).random()

    val scan = java.util.Scanner(System.`in`)

    println("Ваш баланс:")
    var balance = scan.nextInt()

    println("Делайте ставки!")
    val rate = scan.nextInt()

    do {
        println("Перед вами 3 напёрстка, 2 из них пустые. Какой проверить?")
        val choise = scan.nextInt()

        if (choise == naperstok) {
            balance += rate
            println("Угадали!" + "Баланс: $balance")
        } else {
            balance -= rate
            println("Не угадали..." + "Баланс:$balance")
        }
        println("Играем дальше?")

        var answer = readLine()
    } while (answer.equals("да"))

}