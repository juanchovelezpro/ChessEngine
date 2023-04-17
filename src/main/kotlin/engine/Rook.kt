package engine

class Rook(
    position: Position,
    team: Team,
    chess: Chess
) : Piece(position, team, chess) {

    init {
        shape = if (team == Team.WHITE) {
            "\u2656"
        } else {
            "\u265C"
        }
    }

    override fun possibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }

    override fun futurePossibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }
}