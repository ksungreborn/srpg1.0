package srpg;

public class Item {
    String _NAME;
    int _HIT;
    int _ATK;
    int _DRB;
    int _WEx;
    String _TYPE;
    String _EFFECT;
    Item (String NAME, int HIT, int ATK, int DRB, String TYPE, String EFFECT, int WEx) {
        _NAME = NAME;
        _HIT = HIT;
        _ATK = ATK;
        _DRB = DRB;
        _TYPE = TYPE;
        _EFFECT = EFFECT;
        _WEx = WEx;
    }
}