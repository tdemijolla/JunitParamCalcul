package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;

public class ParameterTest {


    @Test
    public void sub() throws ParameterException {
        int var1 = ParameterService.INSTANCE.getInt("DS_VAR1");
        int var2 = ParameterService.INSTANCE.getIntTestParam("DS_VAR2");
        int res = ParameterService.INSTANCE.getIntGlobalParam("DS_RES");
        Assertions.assertEquals(res, var1-var2, "Wrong calculation result");
    }
    @Test
    public void add() {
        float var1 = ParameterService.INSTANCE.getFloat("DS_FAKE_VAR1", 42.21f);
        float var2 = ParameterService.INSTANCE.getFloatTestParam("DS_FAKE_VAR2", 15.23f);
        float res = ParameterService.INSTANCE.getFloatGlobalParam("DS_RES",57.44f );
        Assertions.assertEquals(res, var1+var2, "Wrong calculation result");
    }

    @Test
    public void displayLabel() throws ParameterException {
        Boolean isDisplay = ParameterService.INSTANCE.getBoolean("DS_DISPLAY");
        String label = "default";
        if(isDisplay){
            label = ParameterService.INSTANCE.getString("TC_CUF_LABEL");
        }
        Assertions.assertEquals(label, "Squash", "Wrong calculation result");
    }

}
