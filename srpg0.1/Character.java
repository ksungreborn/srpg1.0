package srpg;

/**
 * Few things to note: based on character's field (class) different weapons can
 * be used or not used, also different terrain types can be accessed. At chapter beginning
 * all HP must be replenished. Inventory needs to remain the same
 * @author KSung
 *
 */
public class Character {
    String getName() {
        return _name;
    }
    private String _name;
    
    int getCurHP() {
        return _curHP;
    }
    private int _curHP;
    
    int getHP() {
        return _HP;
    }
    private int _HP;
    
    private int _STR;
    int getSTR() {
        return _STR;
    }
    
    private int _MGC;
    int getMGC() {
        return _MGC;
    }
    
    private int _SPD;
    int getSPD() {
        return _SPD;
    }
    
    private int _SKL;
    int getSKL() {
        return _SKL;
    }
    
    private int _DEF;
    int getDEF() {
        return _DEF;
    }
    
    private int _RES; 
    int getRES() {
        return _RES;
    }
    
    private int _LCK;
    int getLCK() {
        return _LCK;
    }
    
    private int _MV;
    int getMV() {
        return _MV;
    }
    
    private int _AVD;
    int getAVD() {
        return _AVD;
    }
    
    private String _FIELD;
    String getField() {
        return _FIELD;
    }
    
    
    private Item[] _INVENTORY = new Item[5];
    Item[] getInventory() {
        return _INVENTORY;
    }
    
    private int _xPos;
    int getXPos() {
        return _xPos;
    }
    
    private int _yPos;
    int getYPos() {
        return _yPos;
    }
    
    private Item _equipped;
    Item getEquipped() {
        return _equipped;
    }
    
    private int _LVL;
    int getLVL() {
        return _LVL;
    }
    
    Character (String name, int curHP, int HP, int STR, int MGC, int SPD, int SKL,
        int DEF, int RES, int LCK, int MV, int AVD, String FIELD,
        Item[] INVENTORY, Item equipped, int xPos, int yPos, int LVL) {
        _name = name;
        _curHP = curHP;
        _HP = HP;
        _STR = STR;
        _MGC = MGC;
        _SPD = SPD;
        _SKL = SKL;
        _DEF = DEF;
        _RES = RES;
        _LCK = LCK;
        _FIELD = FIELD;
        _MV = MV;
        _AVD = AVD;
        _INVENTORY = INVENTORY;
        _equipped = equipped;
        _xPos = xPos;
        _yPos = yPos;
    }
    
}

class Unit extends Character {
    private int[] _growths;
    int[] getGrowths() {
        return _growths;
    }
    
    private int _LVL;
    int getLVL() {
        return _LVL;
    }
    
    private int _EXP;
    int getEXP() {
        return _EXP;
    }
    

    Unit(String name, int curHP, int HP, int STR, int MGC, int SPD, int SKL,
        int DEF, int RES, int LCK, int MV, int AVD, String FIELD,
        Item[] INVENTORY, Item equipped, int xPos, int yPos, int LVL, int[] growths, int EXP) {
        super(name, curHP, HP, STR, MGC, SPD, SKL, DEF, RES, LCK, MV, AVD, FIELD,
            INVENTORY, equipped, xPos, yPos, LVL);
        _growths = growths;
        _LVL = LVL;
        _EXP = EXP;
    }
    
}
