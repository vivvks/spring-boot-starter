package model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlainPojo {

    @Value("${config.dbUrl}")
    private String dbURL;

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }


    @Override
    public String toString() {
        return "PlainPojo{" +
                "dbURL='" + dbURL + '\'' +
                '}';
    }
}
