

public class Protocol {
    // Client -> Server
    public static final String LOGIN = "LOGIN";
    public static final String CHALLENGE = "CHALLENGE";
    public static final String ACCEPT = "ACCEPT";
    public static final String REJECT = "REJECT";
    public static final String MOVE = "MOVE";
    public static final String SWAP_LETTER = "SWAP_LETTER";
    public static final String SUBMIT_WORD = "SUBMIT_WORD";
    public static final String THOAT = "THOAT";
    public static final String GET_LEADERBOARD = "GET_LEADERBOARD";
    
    // Server -> Client
    public static final String LOGIN_SUCCESS = "LOGIN_SUCCESS";
    public static final String PLAYER_LIST = "PLAYER_LIST";
    public static final String CHALLENGE_REQUEST = "CHALLENGE_REQUEST";
    public static final String GAME_START = "GAME_START";
    public static final String GAME_UPDATE = "GAME_UPDATE";
    public static final String BONUS_QUESTION = "BONUS_QUESTION";
    public static final String BONUS_RESULT = "BONUS_RESULT";
    public static final String GAME_END = "GAME_END";
    public static final String LEADERBOARD = "LEADERBOARD";
    public static final String ERROR = "ERROR";
    
    public static final String DELIMITER = "|";
    
    // Round types
    public static final String ROUND_NORMAL = "NORMAL";
    public static final String ROUND_BONUS = "BONUS";
}