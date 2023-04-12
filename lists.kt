// A list is an ordered, resizable collection, typically implemented as a resizable array. 
// When the array is filled to capacity and you try to insert a new element, 
// the array is copied to a new bigger array.

fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size) 
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }

    val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    mutableSolarSystem.add("Pluto")
    mutableSolarSystem.add(3, "Theia")

    mutableSolarSystem[3] = "Future Moon"
    
    mutableSolarSystem.removeAt(9)
    mutableSolarSystem.remove("Future Moon")

    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)

}
