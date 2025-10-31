package com.example.ai37a

import kotlin.random.Random


fun main(args: Array<String>){
    val dictionary = mapOf(
        "bat" to "to play cricket",
        "book" to "to learn",
        "knife" to "have sharp edges used for cutting",
        "phone" to "a device to connect people"
    )
    print("Enter a word: ")
    val word = readLine()
    println("Meaning :${dictionary}word ?: not in the dictionary.")

    print("Hello World")

//mutable
// we can re assign values to mutable variables

    var age=20
    age =25

    //immutable
    // we cannot re assign values to immutable variables
    val roll=15
//    roll=15

    var a : Boolean = true
    var b : Char ='R'
    var c : Byte = 12
    var d : Short = -356
    var e : Int = 43534
    var f : Long= -53463256L
    var i : Float = 5.7F
    var h : Double = 7.324655

    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(i)
    println(h)

    var x : Double = 132.32
    var y: Int = x.toInt()
    var z : Byte = y.toByte()
    println(x)
    println(y)
    println(z)


    var j: String = "Hello World"
    var k : Int = j.length
    var l:Boolean = j.equals("Hello World")
    var username: String =" softwarica"

    println(username.trim())
    println(j)
    println(k)
    println(j.isEmpty())
    println(j.lowercase())
    println(j.uppercase())
    println(l)
    print(j.plus(",How are you"))

    var ages = arrayOf(1,2,3)
    println(ages)
    println("The first element of age is "+ ages[0])
    println("The first element of age is "+ ages[1])
    println("The first element of age is "+ ages[2])

    println("********************")

    var name= arrayOf("ram","shyam","hari")
    name[1] = "sam"
    println("The first element of name is "+ name[0])
    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])

    println(name.size)

    // we can add value only after our array is initilize

    var age1= ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    //we can add value directly in array while initializing variables
    var age2 = arrayListOf<Int>(1,20,5)
     var name = arrayListOf<String>("Sam","ram", "shyam")
    name.add(" hari")
    name. add(4," Sita")

    name.remove("shyam")
    name.removeAt(0)
    println(name)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])

    val numbers : List<String> = listOf("one", " two", "three","four")
    println("Number of elements : ${numbers.size}")
    println("Third element : ${numbers.get(2)}")
    println("Fourth element : ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")


    //Immutable list
    val lst = listOf("one","two","three")
    println("Mutable list")
    for(i in lst.indices) {
        println(lst[i])
    }
    println()
    //Mutable list
    val mutableLst= mutableListOf("one","two","three")
    mutableLst.add("Four")
    println("Immutable list")
    for(i in mutableLst.indices){
        println(lst[i])
    }

}
fun set(){
    val numbers = setOf(1,2,3,4)
    for(elements in numbers){
        println(elements)
    }
    val numbersBackwards = setOf(4,3,2,1)
    println("The set are equal : ${numbers == numbersBackwards}")
}
fun map(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to " New Delhi"
    )
    println("All keys : ${countriesCapitals.keys}")
    println("All keys : ${countriesCapitals.values}")

    println("Capital of Nepal is : ${ countriesCapitals["Nepal"]}")
}
// Immutable map
val studentMarks = mapOf(
    "ram" to 45,
    "shyam" to 45,
    "hari" to 45,
    "gita" to 45,
)
//println("Enter student name: ")
//val input : String = readln().lowercase()
//println(studentMarks[input])

//Mutuable map

//    studentMarks["ram"]=60
//    studentMarks.put("sabin",80)
//    println("Enter srudent name : ")
//    val input : String = readln().lowercase()
//    println(studentMarks[input])

fun calculation(){
    //Arithmetic operator
    var num1:Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1/num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operator
    var x:Int = 20
    var y:Int = 10
    var z: Int = 0

    z= x+y
    println("z = x + y =$z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= x = $z")
    z *=x
    println("z *= x = $z")
    z /= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")

    //unary operator
    var number: Double = 7.6
    var isCheck : Boolean = true
    println("+number = ${+number}")
    println("-number =${-number}")
    println("++number = ${++number}")
    println("--number = ${--number}")
    println("!isCheck = ${!isCheck}")
    println("---------------------------")
    var result: Double = 4.7
    println("result : $result")
    println("result++  :" +result++)

    //Equality and Relational Operators
    var a : Int =5
    var b: Int = 5

    println("a == b : "+ (a == b))
    println("a !=b : "+ (a != b))
    println("a < b : " + (a < b))
    println("a > b : " + (a>b))
    println("a >= b : " + (a>=b))
    println("a <=b : " + (a <= b))


    //conditional operators
    var number1: Int =5
    var number2: Int = 8
    var number3:Int = 12
    var result:Boolean = false
    //conditional operator (&&)
    result =(number1 > number2) && (number3 > number2)
    println(result)
    //conditional operator(||)
    result = (number1 > number2) || (number3 > number2)
    println(result)

    //operator precedence
    //BODMAS
    var result:Int = 5+2*4
    println("Result = "+result)
    result = (5+2)*4
    println("Result ="+result)
    var x:Int=8
    var y:Int=4
    var z: Int =2
    var sum: Int =0
    sum = x + --y + --z
    print("x+ --y + --z ::: $sum")

    //rangeTo() Function and "in" operator
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange ='a'..'j'
    var check ='Z' in testCharRange
    println("mycharRange has Z :$check")
    println(myCharRange)
    println(testCharRange)

    //console input in android app development
    print("Enter name :: ")
    var name: String? = readln()
    print("Enter age::")
    var age : Int = readln()!!.toInt()



    //If else Statement
    print("Please enter a number: ")
    var number:Any = readln()!!.toInt()
    if(number.toString().toInt() %2 ==0){
        println("$number is even")
    }else{
        println("$number is odd")
    }

    //If Else ladder statement
    print("Please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()
    if (yourAge < 13){
        print("You are a child")
    }else if (yourAge < 19){
        print("You are teenager")
    }else{
        if (yourAge<50){
            print(" you are an adult")
        }else {
            print(" You are senior")
        }
    }

    //Nested If else statement
    println("Please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int =readln()!!.toInt()
    var largestNumber: Int
    if(number1 >= number2){
        if(number1 >= number3){
            largestNumber = number1
        }else{
            largestNumber = number3
        }
    }else{
        if(number2>= number3){
            largestNumber = number2
        }else{
            largestNumber=number3
        }
    }
    println(" The largest number is $largestNumber")


    // switch case
    print("please enter a day of week:: -")
    var dayNumber : Int = readln()!!.toInt()
    var day: String
    when(dayNumber)
    {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)

    //For Loop
    for (i in 1..9){
        println(i)
    }
    var sum:Int =0
    for (x in 0..5){
        println(x)
        sum += x//sum=sum+x
    }
    var sum: Int =0
    for (x in 0..10){
        if(x % 2 == 0){
            println(x)
            sum += x // sum = sum + x
        }
    }
    println(" The sum of even number is $sum")


    // While loop
    var i: Int =0
    while(i<5){
        println(i)
        i++
    }

    var k =1
    var fact =1
    while (k<6){
        fact*=kprintln("$k! = $fact")
        k++
    }


    //Infinite loop
    var number = Random.nextInt(0,1000)
    println("Please enter any number from 0 to 1000: ")
    while(2>1){
        var userGuess:Int = readln()!!.toInt()
        if(userGuess == number){
            println("congrats you won")
            break
        }else if(userGuess<number){
            println("Increase your guess")
        }else{
            println("Decrease your guess")
        }
    }



    //Do While Loop
    var number = 1
    do{
        println(number)
        number++
    }while (number <= 15)
}



fun calculate(a:Int,b:Int) : Int{
    return a+b
}
fun login(username: String, password:String) : Unit{

}
