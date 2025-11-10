public class GameEngine {
private char[][] board; 
private char currentPlayer;

public GameEngine(){
board = new char [3][3];
currentPlayer = 'x';
initializeBoard();
}

private void initializeBoard(){
for(int i = 0; i < 3; i++){
for(int j = 0; j < 3; j++){
board[i][j] = '-
cat > src/GameEngine.java << 'EOF'
public class GameEngine {
private char[][] board; 
private char currentPlayer;

public GameEngine(){
board = new char [3][3];
currentPlayer = 'x';
initializeBoard();
}

private void initializeBoard(){
for(int i = 0; i < 3; i++){
for(int j = 0; j < 3; j++){
board[i][j] = '-';

}
}
}
//TODO: Implement game logic methods
}
