package com.zilker.constant;

public class SqlConstant {
	
	public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/RENTALDB";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "password";
	public static final String SELECT_ROLE = "SELECT * FROM ROLE WHERE USER_ROLE = ?"; 
	public static final String RETRIEVE_AREA_ID = "SELECT AREA_ID FROM AREA WHERE ZIPCODE = ?";
	public static final String INSERT_USER_ADDRESS = "INSERT INTO ADDRESS(ADDRESS,AREA_ID,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?)";
	public static final String RETRIEVE_ADDRESS = "SELECT ADDRESS_ID,ADDRESS FROM ADDRESS WHERE ADDRESS = ?";
	public static final String INSERT_USER = "INSERT INTO USER(FNAME,EMAIL,USER_PASSWORD,PHONE_NO,OCCUPATION,ADDRESS_ID,ROLE_ID,CREATED_BY,UPDATED_BY,LNAME) VALUES(?,?,?,?,?,?,?,?,?,?)";
	public static final String SELECT_USER = "SELECT EMAIL,USER_PASSWORD,ROLE_ID FROM USER WHERE EMAIL = ? AND USER_PASSWORD = ?";
	public static final String RETRIEVE_ROLE_ID = "SELECT * FROM ROLE WHERE ROLE_ID = ?";
	public static final String RETRIEVE_TYPE = "SELECT TYPE_ID FROM HOUSE_TYPE WHERE TYPE = ?";
	public static final String INSERT_RENTAL_ADDRESS = "INSERT INTO ADDRESS(ADDRESS,AREA_ID,LATITUDE,LONGITUDE,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?,?,?)";
	public static final String RETRIEVE_RENT_ADDRESS_ID = "SELECT AREA_ID,ADDRESS_ID FROM ADDRESS WHERE ADDRESS = ?";
	public static final String RETRIEVE_EMAIL = "SELECT USER_ID,EMAIL,FNAME FROM USER WHERE EMAIL = ?";
	public static final String SELECT_USERID = "SELECT USER_ID FROM USER WHERE EMAIL = ?";
	public static final String RETRIEVE_RENTAL_CHOICE = "SELECT * FROM RENTAL_OPTION WHERE RENTAL_CHOICE = ?";
	public static final String INSERT_RENTAL_DETAILS = "INSERT INTO RENTAL_DETAILS(USER_ID,TYPE_ID,CHOICE_ID,ADDRESS_ID,STATUS_ID,PRICE,CREATED_BY,UPDATED_BY,LANDMARK) VALUES(?,?,?,?,?,?,?,?,?)";
	public static final String RETRIEVE_HOUSE_ID = "SELECT HOUSE_ID,USER_ID FROM RENTAL_DETAILS WHERE ADDRESS_ID = ?";
	public static final String SELECT_FACILITY = "SELECT * FROM RENTAL_FACILITY WHERE FACILITY = ?";
	public static final String RETRIEVE_PG_GENDER = "SELECT PG_ID,GENDER_ID FROM PG_SHARING,PG_GENDER WHERE SHARING = ? AND GENDER = ?";
	public static final String INSERT_PG_DESCRIPTION = "INSERT INTO PG_DESCRIPTION(HOUSE_ID,PG_ID,GENDER_ID,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?,?)";
	public static final String INSERT_RENTAL_DESCRIPTION = "INSERT INTO RENTAL_DESCRIPTION(HOUSE_ID,SQ_FEET,DEPOSIT,TOTAL_FLOORS,FLOOR_NO,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?,?,?,?)";
	public static final String GET_HOUSE_ID = "SELECT HOUSE_ID,USER_ID FROM RENTAL_DETAILS,ADDRESS WHERE ADDRESS.ADDRESS = ? AND ADDRESS.ADDRESS_ID = RENTAL_DETAILS.ADDRESS_ID";
	public static final String UPDATE_ROLE_ID = "UPDATE USER SET ROLE_ID = 3 WHERE USER_ID = ?";
	public static final String RETRIEVE_ID = "SELECT HOUSE_ID,ADDRESS_ID,STATUS_ID FROM RENTAL_DETAILS,USER WHERE USER.EMAIL = ? AND USER.USER_ID = RENTAL_DETAILS.USER_ID";
	public static final String RETRIEVE_ADDRESS_AREA = "SELECT ADDRESS,AREA_ID FROM ADDRESS WHERE ADDRESS_ID = ?";
	public static final String RETRIEVE_AREA= "SELECT * FROM AREA WHERE AREA_ID = ?";
	public static final String RETRIEVE_USER_INTEREST = "SELECT USER_ID,REQUEST_PAY FROM USER_RENTAL_INTEREST WHERE HOUSE_ID = ? AND USER_RENTAL_INTEREST.STATUS_ID = 1";
	public static final String RETRIEVE_USER = "SELECT * FROM USER WHERE USER_ID = ?";
	public static final String DISPLAY_CONTACT = "SELECT PHONE_NO FROM USER,RENTAL_DETAILS WHERE RENTAL_DETAILS.HOUSE_ID = ? AND RENTAL_DETAILS.USER_ID = USER.USER_ID";
	public static final String RETRIEVE_FACILITY = "SELECT FACILITY FROM RENTAL_FACILITY WHERE FACILITY_ID = ?";
	public static final String SEARCH_RENT = "SELECT DISTINCT RENTAL_DETAILS.HOUSE_ID,ADDRESS,AREA,ZIPCODE,LANDMARK,TYPE,PRICE,DEPOSIT,SQ_FEET,TOTAL_FLOORS,FLOOR_NO FROM HOUSE_TYPE,RENTAL_DETAILS,ADDRESS,AREA,RENTAL_OPTION,RENTAL_STATUS,RENTAL_DESCRIPTION WHERE RENTAL_DETAILS.HOUSE_ID = ? AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND RENTAL_DETAILS.TYPE_ID=HOUSE_TYPE.TYPE_ID AND RENTAL_DETAILS.CHOICE_ID = RENTAL_OPTION.CHOICE_ID AND RENTAL_DETAILS.HOUSE_ID = RENTAL_DESCRIPTION.HOUSE_ID";
	public static final String SELECT_FACILITY_ID = "SELECT FACILITY_ID FROM RENTAL_FACILITY_MAPPING WHERE HOUSE_ID =?";
	public static final String SEARCH_PG = "SELECT DISTINCT RENTAL_DETAILS.HOUSE_ID,ADDRESS,AREA,ZIPCODE,LANDMARK,TYPE,PRICE,SHARING,GENDER FROM HOUSE_TYPE,RENTAL_DETAILS,ADDRESS,AREA,RENTAL_OPTION,PG_DESCRIPTION,PG_SHARING,PG_GENDER WHERE RENTAL_DETAILS.HOUSE_ID= ? AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND RENTAL_DETAILS.TYPE_ID=HOUSE_TYPE.TYPE_ID AND RENTAL_OPTION.CHOICE_ID = RENTAL_DETAILS.CHOICE_ID AND RENTAL_DETAILS.HOUSE_ID = PG_DESCRIPTION.HOUSE_ID AND PG_DESCRIPTION.PG_ID = PG_SHARING.PG_ID AND PG_DESCRIPTION.GENDER_ID = PG_GENDER.GENDER_ID";
	public static final String RETRIEVE_USER_INTEREST_STATUS = "SELECT STATUS_ID FROM USER_RENTAL_INTEREST WHERE HOUSE_ID = ?";
	public static final String INSERT_USER_INTEREST = "INSERT INTO USER_RENTAL_INTEREST(HOUSE_ID,USER_ID,REQUEST_PAY,STATUS_ID,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?,?,?)";
	public static final String DISPLAY_ADDRESS = "SELECT DISTINCT RENTAL_DETAILS.HOUSE_ID,RENTAL_CHOICE,ADDRESS,AREA FROM RENTAL_DETAILS,ADDRESS,RENTAL_STATUS,AREA,RENTAL_OPTION,USER,USER_RENTAL_INTEREST WHERE RENTAL_STATUS.STATUS_ID = 2 AND RENTAL_STATUS.STATUS_ID = RENTAL_DETAILS.STATUS_ID AND ADDRESS.AREA_ID=AREA.AREA_ID AND RENTAL_DETAILS.ADDRESS_ID=ADDRESS.ADDRESS_ID AND RENTAL_OPTION.CHOICE_ID = RENTAL_DETAILS.CHOICE_ID AND USER.EMAIL = ? AND USER.USER_ID != RENTAL_DETAILS.USER_ID AND USER_RENTAL_INTEREST.HOUSE_ID != 4";
	public static final String INSERT_REVIEW = "INSERT INTO USER_REVIEW(USER_ID,HOUSE_ID,RATING,REVIEW,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?,?,?)";
	public static final String INSERT_FACILITY = "INSERT INTO RENTAL_FACILITY_MAPPING(FACILITY_ID,HOUSE_ID,CREATED_BY,UPDATED_BY) VALUES(?,?,?,?)";
	public static final String VIEW_HOUSE = "SELECT DISTINCT RENTAL_DETAILS.HOUSE_ID,TYPE,ADDRESS,AREA,ZIPCODE,PRICE FROM USER,RENTAL_DETAILS,HOUSE_TYPE,AREA,ADDRESS,USER_RENTAL_INTEREST WHERE USER.EMAIL = ? AND USER.USER_ID = RENTAL_DETAILS.USER_ID AND RENTAL_DETAILS.STATUS_ID = 2 AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND RENTAL_DETAILS.TYPE_ID = HOUSE_TYPE.TYPE_ID";
	public static final String RETRIEVE_REVIEW_RATING = "SELECT FNAME,RATING,REVIEW FROM USER_REVIEW,USER WHERE HOUSE_ID =? AND USER_REVIEW.USER_ID = USER.USER_ID";
	public static final String UPDATE_STATUS_ID = "UPDATE USER_RENTAL_INTEREST SET STATUS_ID = ? WHERE USER_ID = ? AND HOUSE_ID = ?";
	public static final String UPDATE_TYPE = "UPDATE RENTAL_DETAILS SET TYPE_ID = ? WHERE HOUSE_ID = ?";
	public static final String UPDATE_RENT_ADDRESS = "UPDATE ADDRESS SET ADDRESS = ? WHERE ADDRESS_ID = ?";
	public static final String UPDATE_AREA = "UPDATE ADDRESS SET AREA_ID = ? WHERE ADDRESS_ID = ?";
	public static final String UPDATE_PRICE = "UPDATE RENTAL_DETAILS SET PRICE = ? WHERE HOUSE_ID = ?";
	public static final String DISPLAY_REQUESTED_HOUSE = "SELECT DISTINCT RENTAL_DETAILS.HOUSE_ID,ADDRESS.ADDRESS,AREA.AREA,AREA.ZIPCODE FROM RENTAL_DETAILS,ADDRESS,AREA WHERE RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND STATUS_ID = 1";
	public static final String UPDATE_HOUSE_STATUS="UPDATE RENTAL_DETAILS SET STATUS_ID = ? WHERE HOUSE_ID = ?";
	public static final String SEARCH = "SELECT DISTINCT RENTAL_DETAILS.HOUSE_ID,ADDRESS.ADDRESS,AREA.AREA,AREA.ZIPCODE,HOUSE_TYPE.TYPE,RENTAL_DETAILS.PRICE FROM USER,HOUSE_TYPE,RENTAL_DETAILS,ADDRESS,AREA,RENTAL_OPTION,RENTAL_STATUS WHERE AREA = ? AND AREA.AREA_ID = ADDRESS.AREA_ID AND ADDRESS.ADDRESS_ID = RENTAL_DETAILS.ADDRESS_ID AND RENTAL_DETAILS.TYPE_ID=HOUSE_TYPE.TYPE_ID AND RENTAL_OPTION.RENTAL_CHOICE = ? AND RENTAL_OPTION.CHOICE_ID = RENTAL_DETAILS.CHOICE_ID AND RENTAL_DETAILS.STATUS_ID = 2 AND USER.EMAIL = ? AND USER.USER_ID != RENTAL_DETAILS.USER_ID";
	public static final String INTEREST_HOUSE_ID = "SELECT HOUSE_ID FROM USER_RENTAL_INTEREST WHERE USER_RENTAL_INTEREST.HOUSE_ID = ?";
	public static final String GET_INTEREST_HOUSE_ID = "SELECT HOUSE_ID FROM USER_RENTAL_INTEREST WHERE HOUSE_ID = ? AND USER_RENTAL_INTEREST.STATUS_ID =4";
	public static final String CHECK_INTEREST = "SELECT USER_RENTAL_INTEREST.USER_ID,USER_RENTAL_INTEREST.HOUSE_ID FROM USER_RENTAL_INTEREST,USER WHERE USER.EMAIL = ? AND USER.USER_ID = USER_RENTAL_INTEREST.USER_ID AND USER_RENTAL_INTEREST.HOUSE_ID = ?";
	public static final String CHECK_REVIEW_RATING = "SELECT DISTINCT USER_REVIEW.USER_ID,USER_REVIEW.HOUSE_ID FROM USER_REVIEW,USER WHERE USER.EMAIL = ? AND HOUSE_ID = ? AND USER_REVIEW.USER_ID = USER.USER_ID";
	public static final String VIEW_APPROVED_HOUSE = "SELECT distinct USER_RENTAL_INTEREST.HOUSE_ID,ADDRESS,AREA,TYPE,PRICE,STATUS FROM USER_RENTAL_INTEREST,USER,RENTAL_DETAILS,ADDRESS,AREA,HOUSE_TYPE,RENTAL_STATUS WHERE USER.EMAIL = ? AND USER.USER_ID = USER_RENTAL_INTEREST.USER_ID AND USER_RENTAL_INTEREST.HOUSE_ID = RENTAL_DETAILS.HOUSE_ID AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND HOUSE_TYPE.TYPE_ID = RENTAL_DETAILS.TYPE_ID AND USER_RENTAL_INTEREST.STATUS_ID = 2 AND USER_RENTAL_INTEREST.STATUS_ID = RENTAL_STATUS.STATUS_ID";
	public static final String VIEW_USER_STATUS = "SELECT distinct USER_RENTAL_INTEREST.HOUSE_ID,ADDRESS,AREA,TYPE,PRICE,STATUS FROM USER_RENTAL_INTEREST,USER,RENTAL_DETAILS,ADDRESS,AREA,HOUSE_TYPE,RENTAL_STATUS WHERE USER.EMAIL = ? AND USER.USER_ID = USER_RENTAL_INTEREST.USER_ID AND USER_RENTAL_INTEREST.HOUSE_ID = RENTAL_DETAILS.HOUSE_ID AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND HOUSE_TYPE.TYPE_ID = RENTAL_DETAILS.TYPE_ID AND RENTAL_STATUS.STATUS_ID = USER_RENTAL_INTEREST.STATUS_ID";
	public static final String UPDATE_CONFIRMED_STATUS = "UPDATE USER_RENTAL_INTEREST SET STATUS_ID = 4 WHERE HOUSE_ID = ? AND USER_ID = ?";
	public static final String RETRIVE_USER_HOUSE_ID = "SELECT USER_RENTAL_INTEREST.USER_ID,USER_RENTAL_INTEREST.HOUSE_ID FROM USER_RENTAL_INTEREST,USER WHERE HOUSE_ID = ? AND USER.EMAIL = ? AND USER.USER_ID = USER_RENTAL_INTEREST.USER_ID";
	public static final String UPDATE_USER_REJECTED = "UPDATE USER_RENTAL_INTEREST SET STATUS_ID = 3 WHERE USER_ID = ? AND STATUS_ID != 4";
	public static final String UPDATE_HOUSE_REJECTED = "UPDATE USER_RENTAL_INTEREST SET STATUS_ID = 3 WHERE HOUSE_ID = ? AND STATUS_ID != 4";
	public static final String RETRIEVE_NAME = "SELECT FNAME FROM USER WHERE USER_ID = ?";
	public static final String RETRIEVE_ADDRESS_ID = "SELECT ADDRESS_ID FROM RENTAL_DETAILS WHERE HOUSE_ID = ?";
	public static final String CHECK_ACCEPTED_REQUEST = "SELECT USER_RENTAL_INTEREST.USER_ID,USER_RENTAL_INTEREST.HOUSE_ID FROM USER_RENTAL_INTEREST,USER WHERE USER.EMAIL = ? AND USER.USER_ID = USER_RENTAL_INTEREST.USER_ID AND USER_RENTAL_INTEREST.HOUSE_ID = ? AND USER_RENTAL_INTEREST.STATUS_ID = 2";
	public static final String VIEW_STATUS = "SELECT ADDRESS.ADDRESS,AREA.AREA,AREA.ZIPCODE,RENTAL_STATUS.STATUS FROM USER,RENTAL_DETAILS,ADDRESS,AREA,RENTAL_STATUS WHERE USER.EMAIL = ? AND USER.USER_ID = RENTAL_DETAILS.USER_ID AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND RENTAL_DETAILS.STATUS_ID = RENTAL_STATUS.STATUS_ID";
	public static final String RETRIEVE_RENTAL_DETAILS_HOUSE_ID = "SELECT HOUSE_ID FROM USER,RENTAL_DETAILS WHERE USER.EMAIL = ? AND USER.USER_ID = RENTAL_DETAILS.USER_ID";
	public static final String VIEW_CONFIRMED_HOUSE = "SELECT DISTINCT ADDRESS,AREA,RENTAL_CHOICE,PRICE,STATUS FROM USER_RENTAL_INTEREST,ADDRESS,RENTAL_DETAILS,AREA,RENTAL_STATUS,RENTAL_OPTION WHERE RENTAL_DETAILS.HOUSE_ID = ? AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND RENTAL_DETAILS.CHOICE_ID = RENTAL_OPTION.CHOICE_ID AND RENTAL_DETAILS.HOUSE_ID = USER_RENTAL_INTEREST.HOUSE_ID AND RENTAL_STATUS.STATUS_ID = USER_RENTAL_INTEREST.STATUS_ID AND USER_RENTAL_INTEREST.STATUS_ID = 4";
	public static final String VIEW_REJECTED_HOUSE = "SELECT DISTINCT ADDRESS,AREA,RENTAL_CHOICE,PRICE,STATUS FROM USER_RENTAL_INTEREST,ADDRESS,RENTAL_DETAILS,AREA,RENTAL_STATUS,RENTAL_OPTION WHERE RENTAL_DETAILS.HOUSE_ID = ? AND RENTAL_DETAILS.ADDRESS_ID = ADDRESS.ADDRESS_ID AND ADDRESS.AREA_ID = AREA.AREA_ID AND RENTAL_DETAILS.CHOICE_ID = RENTAL_OPTION.CHOICE_ID AND RENTAL_DETAILS.HOUSE_ID = USER_RENTAL_INTEREST.HOUSE_ID AND RENTAL_STATUS.STATUS_ID = USER_RENTAL_INTEREST.STATUS_ID AND USER_RENTAL_INTEREST.STATUS_ID = 3";
	
}
