package engine

class Pawn(
    position: Position,
    team: Team,
    chess: Chess
) : Piece(position, team, chess) {

    init {
        shape = if (team == Team.WHITE) {
            "\u2659"
        } else {
            "\u265F"
        }
    }

    override fun possibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }

    override fun futurePossibleMovements(): ArrayList<Box> {
        TODO("Not yet implemented")
    }

}