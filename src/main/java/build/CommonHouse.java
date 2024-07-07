package build;/**
 * 作者:灰爪哇
 * 时间:2024-07-07
 */

/**
 * 具体建造者：普通房子
 *
 * @author: Hui
 **/
public class CommonHouse extends HouseBuild {


    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 5 米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 10cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
