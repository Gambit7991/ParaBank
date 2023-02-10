package factories;

import bean.UserBean;
import file_manager.PropertyManager;
import file_manager.PropertyName;

public class UserFactory {
    private static final PropertyManager propertyManager = new PropertyManager("database.properties");

    public static UserBean getUser(){
        return UserBean.builder()
                .firstName(propertyManager.getProperty(PropertyName.FIRST_NAME))
                .lastName(propertyManager.getProperty(PropertyName.LAST_NAME))
                .address(propertyManager.getProperty(PropertyName.ADDRESS))
                .city(propertyManager.getProperty(PropertyName.CITY))
                .state(propertyManager.getProperty(PropertyName.STATE))
                .zipCode(propertyManager.getProperty(PropertyName.ZIP_CODE))
                .phoneNumber(propertyManager.getProperty(PropertyName.PHONE_NUMBER))
                .ssn(propertyManager.getProperty(PropertyName.SSN))
                .userName(propertyManager.getProperty(PropertyName.USER_NAME))
                .password(propertyManager.getProperty(PropertyName.PASSWORD))
                .build();
    }
}
