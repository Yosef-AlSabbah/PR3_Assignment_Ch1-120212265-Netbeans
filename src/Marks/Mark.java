package Marks;

/**
 * @author Yousef M. Y. AlSabbah
 * @author 120212265
 * <p>
 * Note: JDK must be 13 or newer. Record Mark created to store each mark along
 * with its name.
 *
 * @param mark_name
 * @param mark
 */
public record Mark(String mark_name, int mark) {

    @Override
    public String toString() {
        return mark_name + ": " + mark;
    }
}
