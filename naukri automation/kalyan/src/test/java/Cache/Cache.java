package Cache;

import com.naukri.cloud.Steps.pageactions.loginpage;
import test.Common;

import java.io.IOException;

public class Cache {
    Common common;
    public Cache() {
        this.common=new Common(Common.driver);
    }

    public loginpage getLoginPage(){
        loginpage onboard;
        try {
            onboard = new loginpage(common.getDriver());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return onboard;
    }
}
