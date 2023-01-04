# CarDealershipAPI

# remember to add the password to your mysql to the line in your application.properties file:
spring.datasource.password={yourpassword}

# to add a customer to your application, copy and paste this command to your terminal:
curl localhost:8080/customer/add -d firstName=Chris -d lastName=Tucker -d email=contact-us@test.com