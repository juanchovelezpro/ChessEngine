package engine

class Box(
    val position: Position,
    var piece: Piece?,
    var originalColor: Color? = null,
    var currentColor: Color? = null
) {

    override fun toString() = "$piece"

}