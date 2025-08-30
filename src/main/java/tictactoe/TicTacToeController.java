package tictactoe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tictactoe.TicTacToeSystem;
import tictactoe.enums.Symbol;
import tictactoe.models.Player;

@RestController
@RequestMapping("/tictactoe")
public class TicTacToeController {

    private final TicTacToeSystem system = TicTacToeSystem.getInstance();
    private Player player1;
    private Player player2;

    // Create a new game with two players
    @PostMapping("/create")
    public ResponseEntity<String> createGame(@RequestParam String player1Name,
                                             @RequestParam String player2Name) {
        this.player1 = new Player(player1Name, Symbol.X);
        this.player2 = new Player(player2Name, Symbol.O);

        system.createGame(player1, player2);
        return ResponseEntity.ok(
                String.format("New game started: %s (X) vs %s (O)", player1Name, player2Name));
    }

    // Make a move
    @PostMapping("/move")
    public ResponseEntity<String> makeMove(@RequestParam String playerName,
                                           @RequestParam int row,
                                           @RequestParam int col) {
        Player player = player1.getName().equals(playerName) ? player1 : player2;
        system.makeMove(player, row, col);
        return ResponseEntity.ok("Move applied successfully. Check console for board state.");
    }

    // Print the current board
    @GetMapping("/board")
    public ResponseEntity<String> printBoard() {
        system.printBoard(); // still prints in console
        return ResponseEntity.ok("Board printed to console.");
    }

    // Print scoreboard
    @GetMapping("/scoreboard")
    public ResponseEntity<String> printScoreboard() {
        system.printScoreBoard(); // still prints in console
        return ResponseEntity.ok("Scoreboard printed to console.");
    }
}
