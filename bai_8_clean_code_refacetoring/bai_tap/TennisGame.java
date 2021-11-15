package bai_8_clean_code_refacetoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String score = "";
        if (score1==score2)
        {
            score = getScore(score1) + "-All";
            if (score1 > 3) {
                score = "Deuce";
            }
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
                score = getScore(score1) + '-' + getScore(score2);
            }
            return score;
        }

    private static String getScore(int score1) {
        String score;
        switch (score1)
        {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
            default:
                score = "";
                break;

        }
        return score;
    }
}