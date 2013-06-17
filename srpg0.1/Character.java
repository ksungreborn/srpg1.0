package srpg;

/**
 * Few things to note: based on character's field (class) different weapons can
 * be used or not used, also different terrain types can be accessed. At chapter beginning
 * all HP must be replenished. Inventory needs to remain the same
 * @author KSung
 *
 */
public class Character {
    private String _name;
    private int _curHP;
    private int _HP;
    private int _STR;
    private int _INT;
    private int _SPD;
    private int _SKL;
    private int _DEF;
    private int _RES; 
    private int _LCK;
    private int _MV;
    private int _AVD;
    private int _HIT;
    private String _FIELD;
    private String[] _INVENTORY = new String[5];
    private String[] _growths;
    int _LVL;
    int _EXP;
    int _xPos;
    int _yPos;
    
    
    Character (String name, int curHP, int HP, int STR, int INT, int SPD, int SKL,
        int DEF, int RES, int LCK, int MV, int AVD, int HIT, String FIELD,
        String[] INVENTORY, int xPos, int yPos) {
        _name = name;
        _curHP = curHP;
        _HP = HP;
        _STR = STR;
        _INT = INT;
        _SPD = SPD;
        _SKL = SKL;
        _DEF = DEF;
        _RES = RES;
        _LCK = LCK;
        _FIELD = FIELD;
        _MV = MV;
        String[] _INVENTORY = INVENTORY;
        _xPos = xPos;
        _yPos = yPos;
    }
    
}

class Unit extends Character {
    String[] _growths;
    int _LVL;
    int _EXP;
    Unit(String name, int curHP, int HP, int STR, int INT, int SPD, int SKL,
        int DEF, int RES, int LCK, int MV, int AVD, int HIT, String FIELD,
        String[] INVENTORY, int xPos, int yPos, String[] growths, int LVL, int EXP) {
        super(name, curHP, HP, STR, INT, SPD, SKL, DEF, RES, LCK, MV, AVD, HIT, FIELD,
            INVENTORY, xPos, yPos);
        _growths = growths;
        _LVL = LVL;
        _EXP = EXP;
    }
    
}
