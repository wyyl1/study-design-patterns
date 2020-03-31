package decorator;

/**
 * 饮料
 */
public interface Beverage {

    default String getDescription(){
        return "未知的饮料";
    }

    double cost();
}
