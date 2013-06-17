package srpg;

import java.util.ArrayList;

/**
 * Whole file is subject to change based on graphics design.
 * For now we implement a grid 50 x 50 array. W marks WALL, - marks GROUND,
 * t marks TRENCH (all but tanks), b marks BUILDING (ground units only), m marks MOUNTAIN
 * (pilots only), f marks FOREST, c marks Cover.
 * Enemy units are designated by E, and player units P.
 * @author KSung
 *
 */

public class Map {
    String[] w = {"all"};
    String[] g = {"none"};
    String[] f = {"none"};
    String[] m = {"pilot", "zepellin", "fighterjet"};
    String[] s = {"groundunit"};
    String[] c = {"none"};
    String[] b = {"none"};
    String[] e = {"none"};
    Terrain W  = new Terrain(0, "Wall", w, 1, 0);
    Terrain G = new Terrain(0, "Ground", g, 1, 0);
    Terrain F = new Terrain(15, "Forest", f, 2, 0);
    Terrain M = new Terrain (30, "Mountain", m, 1, 0);
    Terrain S = new Terrain(25, "Structure", b, 1, 1);
    Terrain C = new Terrain(15, "Cover", c, 1, 1);
    Terrain B = new Terrain(35, "Base", s, 1, 1);
    Terrain E = new Terrain(35, "EnemyBase", e, 1, 1);
    /** Terrain of first map, prologue 1. */
    Terrain[][] p1 = {{G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G},
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}, 
                     {G, G, G, G, G, G, G, G, G, G}}
}