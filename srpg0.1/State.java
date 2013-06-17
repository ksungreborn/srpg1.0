package srpg;

/**
 * Represents a game save state. When game is saved, a state is created and written out to a file.
 * Playing from that gave state requires running SRPG (name subject to change) with the file.
 * @author Kevin
 *
 */
public class State {
    
    private String _user;
    String getUser() {
        return _user;
    }
    
    private String _nickname;
    String getNickname() {
        return _nickname;
    }
    
    private String _chapter;
    String getChapter() {
        return _chapter;
    }
    
    private String _chardata;
    String getCharData() { 
        return _chardata; 
    }
    
    private String _inventory;
    String getInventory() {
        return _inventory;
    }
    
    State(String user, String nickname, String chapter, String chardata, String inventory) {
        
    }

}