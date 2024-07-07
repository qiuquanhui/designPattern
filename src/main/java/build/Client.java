package build;/**
 * 作者:灰爪哇
 * 时间:2024-07-07
 */

/**
 *  客户端
 *
 * @author: Hui
 **/
public class Client {
    public static void main(String[] args) {
        //建造普通房子
        System.out.println("建造普通房子");
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.buildHouse();
//        System.out.println(house);
        System.out.println("------------------------------");
        //建造高楼
        System.out.println("建造高楼");
        houseDirector.setHouseBuild(new HighHouse());
        House house1 = houseDirector.buildHouse();
//        System.out.println(house1);

        StringBuilder stringBuilder = new StringBuilder();
    }

}
