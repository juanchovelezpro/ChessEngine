package engine

class Knight(
    position: Position,
    team: Team,
    chess: Chess
) : Piece(position, team, chess) {

    init {
        shape = if (team == Team.WHITE) {
            "\u2658"
        } else {
            "\u265E"
        }
    }

    override fun possibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }

    override fun futurePossibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }
}