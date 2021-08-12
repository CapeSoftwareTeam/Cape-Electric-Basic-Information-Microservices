


--------> Part_1  Basic information


CREATE TABLE report_details_table (
		    REPORT_ID INT AUTO_INCREMENT,
		    SITE_ID INT,
			USER_NAME VARCHAR(255),
			DESCRIPTION_REPORT VARCHAR(500),
			REASON_REPORT VARCHAR(500),
			INSTALLATION_TYPE VARCHAR(255),
			DESCRIPTION_PREMISE VARCHAR(255) ,
			ESTIMATED_WIRE_AGE VARCHAR(255),
			EVIDANCE_ADDITION VARCHAR(255),
		    PREVIOUS_RECORDS VARCHAR(255),
		    LAST_INSPECTION VARCHAR(255),
		    NEXT_INSPECTION VARCHAR(255),	
		    EXTENT_INSTALLATION VARCHAR(500),
		    CLIENT_DETAILS VARCHAR(500),
		    INSTALLATION_DETAILS VARCHAR(500),
		    VERIFICATION_DATE VARCHAR(500),  
		    VERIFIED_ENGINEER VARCHAR(255),
		    DESIGNATION VARCHAR(255) ,
		    COMPANY VARCHAR(255),
			CREATED_BY VARCHAR(255),
		    CREATED_DATE datetime,
		    CONSTRAINT PK_REPORT_ID PRIMARY KEY(REPORT_ID)
 );
 
 
 
 CREATE TABLE sign_details_table (
            SIGNATOR_ID INT AUTO_INCREMENT,
            REPORT_ID INT,
			SIGNATOR_ROLE VARCHAR(255),
			PERSON_NAME VARCHAR(255),
			PERSON_CONTACT_NO VARCHAR(255),
			PERSON_MAIL_ID VARCHAR(255),
			MANAGER_NAME VARCHAR(255),
			MANAGER_CONTACT_NO VARCHAR(255),
			MANAGER_MAIL_ID VARCHAR(255),
			COMPANY_NAME VARCHAR(255),
			ADDRESS_LINE1 VARCHAR(255),
			ADDRESS_LINE2 VARCHAR(255),
			LAND_MARK VARCHAR(255),
			STATE VARCHAR(255),
			PIN_CODE VARCHAR(255),
			COUNTRY VARCHAR(255),
			DECLARATION_DATE VARCHAR(255),
			DECLARATION_NAME VARCHAR(255),
			DECLARATION_SIGNATURE VARCHAR(255),
			CONSTRAINT PK_SIGNATOR_ID PRIMARY KEY(SIGNATOR_ID),
			CONSTRAINT FK_REPORT_ID FOREIGN KEY (REPORT_ID) REFERENCES REPORT_DETAILS_TABLE(REPORT_ID) ON DELETE CASCADE
);
 

