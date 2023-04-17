package engine

abstract class Piece(
    val position: Position,
    val team: Team,
    val chess: Chess,
    var firstMovementDone: Boolean = false,
) {

    lateinit var shape: String

    fun move(board: Array<Array<Box>>, destination: Position) {

        val fromBox = board[position.x][position.y]
        val destinationBox = board[destination.x][destination.y]

    }

    fun possibleMovementsValidated(): ArrayList<Box> {
        TODO()
    }

    fun isEnemy(piece: Piece) = team != piece.team

    abstract fun possibleMovements(): ArrayList<Box>

    abstract fun futurePossibleMovements(): ArrayList<Box>

    override fun toString() = shape

}