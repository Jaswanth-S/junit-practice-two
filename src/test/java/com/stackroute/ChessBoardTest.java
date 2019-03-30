package com.stackroute;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class ChessBoardTest {
    private static ChessBoard chessBoard;
    @BeforeClass
    public static void setUp()
    {
        chessBoard = new ChessBoard();
    }
    @AfterClass
    public static void tearDown()
    {
        chessBoard=null;
    }

    @Test
    public void checkGenerateBoard()
    {
        assertEquals("checkGenerateBoard, generateChessBoard() does not return correct value"
                ,new String[]{
                        "WW|BB|WW|BB|WW|BB|WW|BB|",
                        "BB|WW|BB|WW|BB|WW|BB|WW|",
                        "WW|BB|WW|BB|WW|BB|WW|BB|",
                        "BB|WW|BB|WW|BB|WW|BB|WW|",
                        "WW|BB|WW|BB|WW|BB|WW|BB|",
                        "BB|WW|BB|WW|BB|WW|BB|WW|",
                        "WW|BB|WW|BB|WW|BB|WW|BB|",
                        "BB|WW|BB|WW|BB|WW|BB|WW|"
                },
                chessBoard.generateChessBoard());
    }
    @Test
    public void checkGenerateChessBoardFailure()
    {
        assertNotNull("checkGenerateBoardFailure, generateChessBoard() does not return correct value",
                chessBoard.generateChessBoard());
        assertNotEquals("checkGenerateBoard, generateChessBoard() does not return correct value"
                ,new String[]{
                        "WW|BB|WW|BB|WW|BB|WW|BB|",
                        "BB|WW|BB|WW|BB|WW|BB|WW|"}
                ,
                chessBoard.generateChessBoard());
    }
}
