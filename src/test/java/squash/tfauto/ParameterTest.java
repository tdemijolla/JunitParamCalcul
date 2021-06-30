package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentestfactory.util.ParameterService;

public class ParameterTest {

    int var1;
    int var2;
    int res;

    String label;

    @Test
    public void sub() {
        var1 = Integer.parseInt(ParameterService.INSTANCE.getParameter("DS_VAR1"));
        var2 = Integer.parseInt(ParameterService.INSTANCE.getParameter("DS_VAR2"));
        res = Integer.parseInt(ParameterService.INSTANCE.getParameter("DS_RES"));
        Assertions.assertTrue((var1-var2)==res, "Le résultat du calcul est incorrect.");
    }

    @Test
    public void display() {
        label = ParameterService.INSTANCE.getParameter("TC_CUF_label");
        Assertions.assertTrue(label.equals("Squash"), "Le label est incorrect.");
    }

    @Test
    public void displayWithDefaultValue() {
        label = ParameterService.INSTANCE.getParameter("TC_CUF_fake_label", "Squash");
        Assertions.assertTrue(label.equals("Squash"), "Le label est incorrect.");
    }
}
