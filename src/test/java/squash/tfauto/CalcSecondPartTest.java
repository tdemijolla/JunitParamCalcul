package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentestfactory.util.ParameterServiceImpl;

import java.io.IOException;

public class CalcSecondPartTest {

    int var1;
    int var2;
    int res;

    @Test
    public void sub() throws IOException {

        var1 = Integer.parseInt(ParameterServiceImpl.getInstance().getParameter("DS_VAR1"));
        var2 = Integer.parseInt(ParameterServiceImpl.getInstance().getParameter("DS_VAR2"));
        res = Integer.parseInt(ParameterServiceImpl.getInstance().getParameter("DS_RES"));
        Assertions.assertTrue((var1-var2)==res, "Le résultat du calcul est incorrect.");
    }
}
