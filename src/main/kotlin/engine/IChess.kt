package engine

interface IChess {
    fun onKill(killer: Piece, killed: Piece)
    fun onMovement(from: Position, destination: Position, piece: Piece)
    fun onPromotion(pawn: Pawn, promPosition: Position): Piece
    fun onCheck(team: Team)
    fun onCheckmate(winner: Team, loser: Team)
    fun onTie()
    fun onTurnChange()
}