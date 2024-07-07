package build;/**
 * 作者:灰爪哇
 * 时间:2024-07-07
 */

/**
 *  抽象建造者
 *
 * @author: Hui
 **/
public abstract class HouseBuild {

    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }

}
