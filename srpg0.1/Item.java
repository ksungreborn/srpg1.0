package srpg;

public class Item {
    String _NAME;
    int _HIT;
    int _AVD;
    int _ATK;
    int _DRB;
    String _TYPE;
    String _EFFECT;
    Item (String NAME, int HIT, int AVD, int ATK, int DRB, String TYPE, String EFFECT) {
        _NAME = NAME;
        _HIT = HIT;
        _AVD = AVD;
        _ATK = ATK;
        _DRB = DRB;
        _TYPE = TYPE;
        _EFFECT = EFFECT;
    }
}