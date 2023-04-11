import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Junit {

    @Test
    @DisplayName("Вторая строка ни разу не входит в первую")
    public void the_Second_Line_Is_Never_Included_In_The_First() {
        String s1 = "QWERTY";
        String s2 = "AB";
        assertEquals(0, Main.Character(s1, s2), "Failed");

    }


    @Test
    @DisplayName("Вторая строка входит в первую только один раз")
    public void the_Second_Line_Enters_The_First_One_Only_Once() {
        String s1 = "QW";
        String s2 = "QW";
        assertEquals(1, Main.Character(s1, s2), "Failed");
    }

    @Test
    @DisplayName("Вторая строка входит в первую несколько раз")
    public void the_Second_Line_Enters_The_First_Several_Times() {
        String s1 = "QWQWQWQWQWQWQWQW";
        String s2 = "QW";
        assertEquals(8, Main.Character(s1, s2), "Failed");

    }

    @Test
    @DisplayName("Введена пустая вторая строка")
    public void An_Empty_Second_Line_Has_Been_Entered (){
        assertThrows(Exception.class, ()->{
                    Main.Character ("ABCDEDTYS","");
                }
        );}
    @Test
    @DisplayName("Первая строка пустая")
    public void the_First_Line_Is_Empty(){
        String s1 = "";
        String s2 = "QW";
        assertEquals(0, Main.Character(s1, s2), "Faild");
    }
}
