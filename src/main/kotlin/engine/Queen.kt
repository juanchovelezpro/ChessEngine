package engine

class Queen(
    position: Position,
    team: Team,
    chess: Chess
) : Piece(position, team, chess) {

    init {
        shape = if (team == Team.WHITE) {
            "\u2655"
        } else {
            "\u265B"
        }
    }

    override fun possibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }

    override fun futurePossibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }
}