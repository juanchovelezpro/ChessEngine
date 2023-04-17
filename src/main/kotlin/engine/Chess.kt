package engine

class Chess : IChess {

    val board = Array(8) { x -> Array(8) { y -> Box(Position(x, y), null) } }
    val possibleBoxes = mutableListOf<Box>()
    var selectedBox: Box? = null
    var activePiece: Piece? = null
    var whiteTurn = true
    val whitePiecesAlive = mutableListOf<Piece>()
    val blackPiecesAlive = mutableListOf<Piece>()
    var observer: IChess? = null
    val movements = mutableListOf<Movement>()

    init {
        initBoard()
    }

    private fun initBoard() {

        for (i in 0..board.lastIndex) {
            for (j in 0..board[0].lastIndex) {
                putBoxColors(i, j)
                putPieces(i, j)
            }
        }
    }

    private fun putPieces(i: Int, j: Int) {
        board[i][j].piece = when (i) {
            0 -> {
                putPiece(i, j, Team.BLACK)
            }

            1 -> {
                Pawn(Position(i, j), Team.BLACK, this)
            }

            6 -> {
                Pawn(Position(i, j), Team.WHITE, this)
            }

            7 -> {
                putPiece(i, j, Team.WHITE)
            }

            else -> {
                null
            }
        }
    }

    private fun putPiece(i: Int, j: Int, team: Team): Piece {
        return when (j) {
            1, 6 -> Knight(Position(i, j), team, this)
            3 -> Queen(Position(i, j), team, this)
            4 -> King(Position(i, j), team, this)
            2, 5 -> Bishop(Position(i, j), team, this)
            else -> Rook(Position(i, j), team, this)
        }
    }

    private fun putBoxColors(i: Int, j: Int) {

        val box = board[i][j]

        when {
            i % 2 == 0 -> {
                if (j % 2 == 0) {
                    box.currentColor = Color.WHITE
                    box.originalColor = Color.WHITE
                } else {
                    box.currentColor = Color.BLACK
                    box.originalColor = Color.BLACK
                }
            }

            else -> {
                if (j % 2 == 0) {
                    box.currentColor = Color.BLACK
                    box.originalColor = Color.BLACK
                } else {
                    box.currentColor = Color.WHITE
                    box.originalColor = Color.WHITE
                }
            }
        }
    }

    fun rotateBoard180(): Array<Array<Box>> {

        val rotated = Array(8) { x -> Array(8) { y -> Box(Position(x, y), null) } }

        var i = 0
        var j = board.lastIndex

        while (i <= board.lastIndex && j >= 0) {
            rotated[i++] = board[j--].reversedArray()
        }

        return rotated

    }

    override fun onKill(killer: Piece, killed: Piece) {

        TODO("Not yet implemented")
    }

    override fun onMovement(from: Position, destination: Position, piece: Piece) {
        TODO("Not yet implemented")
    }

    override fun onPromotion(pawn: Pawn, promPosition: Position): Piece {
        TODO("Not yet implemented")
    }

    override fun onCheck(team: Team) {
        TODO("Not yet implemented")
    }

    override fun onCheckmate(winner: Team, loser: Team) {
        TODO("Not yet implemented")
    }

    override fun onTie() {
        TODO("Not yet implemented")
    }

    override fun onTurnChange() {
        TODO("Not yet implemented")
    }
}