package in.coderarmy.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("payment-property")
public class PaymentProperties {

    private String type;
    private int retryCount;
    private Boolean enabled;
    private int timeOut;

    public int getTimeOut() {
        return timeOut;
    }

    public String getType() {
        return type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public Boolean getEnabled() {
        return enabled;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
