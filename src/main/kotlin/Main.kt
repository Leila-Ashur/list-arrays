fun main() {
    number(arrayOf())
    val Person = listOf(
        Person("Marisa", 30, 50, 70),
        Person("Faith", 20, 170, 20),
        Person("Annet", 20, 160, 60))
    println(Person)
    var sort=Person.sortedByDescending { it.age }
    var names =takeNames("leila","Val","Marisa")
    val carList = listOf(
        Car("ABC123", 70000),
        Car("DEF456", 80000),
        Car("GHI789", 16000)
    )

    val averageMileage = averageMileage(carList)
    println("Average mileage: $averageMileage")


}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun number(num :Array<Int>){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total= numbers[1]+numbers[4]
    println(total)

    var index=numbers.indexOf(158)
    println(index)
    var sort=numbers.sorted()
    println(sort)
}


//2. Given a list of Person objects, each with the attributes, name, age, height,
// and weight. Sort the list in order of descending age


data class Person(val name: String, val age: Int, val height: Int, val weight: Int){

}
//Create a function that takes in 3 names and returns a string array containing all 3 names
fun takeNames(name: String,name1: String,name2: String):Array<String>{
    return arrayOf(name, name1, name2)

}

// Write a function that takes in a list of Car objects each with a registration and mileage
// attribute and returns the average mileage of all the vehicles in the list.
data class Car (var registration:String,var mileage:Int)
fun averageMileage(car: List<Car>):Double{
    val totalMileage = car.sumBy { it.mileage }
    val averageMileagee = totalMileage.toDouble() / car.size
    return averageMileagee

}