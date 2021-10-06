package digitalinnovation.cursokotlin.collections.classes

class General <T> {
    val mapMutable= mutableMapOf<String, T>()

    fun create(id: String, value: T){
        mapMutable[id] = value
    }

    fun findById(id: String) = mapMutable[id]

    fun findAll() = mapMutable.values

    fun  remove(id: String)= mapMutable.remove(id)
}