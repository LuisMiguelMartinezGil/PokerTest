package co.com.ies.pruebas;

public class Poker {
    public WinnerRound playRound(PokerHand blanco, PokerHand negro) {
        WinnerRound ganador = new WinnerRound();
        String[] whiteHand = blanco.toString().split(" ");
        String[] blackHand = blanco.toString().split(" ");
        int maxWhite = 0;
        int maxBlack = 0;
        String[] numerosCartas = {"2","3","4","5","6","7","8","9","10", "J", "Q", "K", "A"};
        for(int i = 0; i < whiteHand.length; i++){
            String carta = whiteHand[i];
            int numCarta = (int)carta.charAt(0);
            String cartaSiguiente = whiteHand[i+1];
            int numCartaSiguiente = (int)cartaSiguiente.charAt(0);
            if(numCarta > numCartaSiguiente){
                maxWhite = numCarta;
            } else {
                maxWhite = numCartaSiguiente;
            }
        }

        for(int i = 0; i < blackHand.length; i++){
            String carta = blackHand[i];
            int numCarta = (int)carta.charAt(0);
            String cartaSiguiente = blackHand[i+1];
            int numCartaSiguiente = (int)cartaSiguiente.charAt(0);
            if(numCarta > numCartaSiguiente){
                maxBlack = numCarta;
            } else {
                maxBlack = numCartaSiguiente;
            }
        }

        if(maxWhite > maxBlack){
            
        }
        return ganador;
    }
}
