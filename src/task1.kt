fun main() {
    var name: String
    while (true)
    {
      print("Введите строку: ")
      name = readln()
      if (name.isNotEmpty())
      {
          break
      }
      println("Строка не может быть пустой!")
    }
    val name2 = name.uppercase()
    var res = ""
    var count = 1
    for (i in 1..name2.length)
    {
        if (i < name2.length && name2[i] == name2[i - 1])
        {
            count++
        }
        else
        {
            res += name2[i - 1]
            if (count > 1) {
                res += count
            }
            count = 1
        }
    }
    println(res)
}