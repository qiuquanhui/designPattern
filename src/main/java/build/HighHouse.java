package build;/**
 * 作者:灰爪哇
 * 时间:2024-07-07
 */

/**
 *  具体建造者：高楼
 *
 * @author: Hui
 **/
public class HighHouse extends HouseBuild{


    @Override
    public void buildBasic() {
        System.out.println(" 高楼打地基 100 米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼封顶-透明顶 ");
    }
}
