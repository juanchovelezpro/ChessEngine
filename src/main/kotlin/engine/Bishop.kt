package engine

class Bishop(
    position: Position,
    team: Team,
    chess: Chess
) : Piece(position, team, chess) {

    init {
        shape = if (team == Team.WHITE) {
            "\u2657"
        } else {
            "\u265D"
        }
    }


    override fun possibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }

    override fun futurePossibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }
}