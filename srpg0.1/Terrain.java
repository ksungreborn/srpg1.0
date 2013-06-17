package srpg;

/**
 * Represents terrain on map.
 * @author KSung
 */

class Terrain {
    int _AVD;
    int _MVcost;
    int _DEF;
    String _name;
    String[] _restricted;
    Terrain (int AVD, String name, String[] restricted, int MVcost, int DEF) {
        _AVD = AVD;
        _name = name;
        _restricted = restricted;
        _MVcost = MVcost;
        _DEF = DEF;
    }
}