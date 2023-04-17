package launcher

import engine.Chess

fun main(args: Array<String>) {
    println("Chess Engine")
    val chess = Chess()

    for (i in 0..chess.board.lastIndex) {
        println(chess.board[i].contentToString())
    }
}