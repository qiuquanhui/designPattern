package build;/**
 * 作者:灰爪哇
 * 时间:2024-07-07
 */

/**
 *  指挥者：用于返回创建对象，设置对象创建的顺序
 *
 * @author: Hui
 **/
public class HouseDirector {

    //聚合抽象建造者
    private HouseBuild houseBuild;

    //使用构造方法来设置抽象建造者
    public HouseDirector(HouseBuild houseBuild){
        this.houseBuild = houseBuild;
    }

    //使用 set 方法来设置抽象建造者
    public void setHouseBuild(HouseBuild houseBuild){
        this.houseBuild = houseBuild;
    }

    //提供返回产品对象的方法。
    public House buildHouse(){
        houseBuild.buildBasic();
        houseBuild.buildWalls();
        houseBuild.roofed();
        return houseBuild.buildHouse();
    }

}
