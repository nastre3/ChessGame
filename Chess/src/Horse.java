public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // конь не мог выйти за доску (доска в нашем случае — это двумерный массив размером 8 на 8,
        // напоминаем, что индексы начинаются с 0) и мог ходить только буквой «Г».
        // Также фигура не может сходить в точку, в которой она сейчас находится.
        // Если конь может пройти от точки (line, column) до точки (toLine, toColumn)
        // по всем правилам (указанным выше), то функция вернет true, иначе — false.
        if ((line  == 0 || column == 0 || line == 8 || column == 8)
                && (toLine-line==1 && toColumn-column==2) || (toLine-line==2 && toColumn-column==1)) {
            return true;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
