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
    var res = ""
    var count = 1
    for (i in 1..name.length)
    {
        if (i < name.length && name[i] == name[i - 1])
        {
            count++
        }
        else
        {
            res += name[i - 1]
            if (count > 1) {
                res += count
            }
            count = 1
        }
    }
    println(res)
}