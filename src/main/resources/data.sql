insert into category (title, active) values ('Desi' , 'Y');
insert into category (title, active) values ('Chineese' , 'Y');
insert into category (title, active) values ('Continental' , 'Y');
insert into category (title, active) values ('Fast Food' , 'Y'); 
insert into category (title, active) values ('Beverages' , 'Y');
insert into category (title, active) values ('Pizzas' , 'Y'); 
insert into category (title, active) values ('Frozen' , 'Y'); 

insert into unit (title) values ('kg');
insert into unit (title) values ('grams');
insert into unit (title) values ('serving');
insert into unit (title) values ('small'); 
insert into unit (title) values ('medium');
insert into unit (title) values ('large'); 
insert into unit (title) values ('Standard Pack');

insert into dish (title, category_id, unit_price, quantity_per_unit, unit_id, description, active) values ('SEEKH KABAB OVERLOAD', (select id from CATEGORY where title = 'Pizzas'), 
1200, 1, (select id from UNIT where title = 'medium'), 'Topped with Seekh Kabab chunks on tantalizing blend of spicy chicken, onions, capsicum, green pepper and cheese' , 'Y'); 

insert into dish (title, category_id, unit_price, quantity_per_unit, unit_id, description, active) values ('BBQ BUZZ', (select id from CATEGORY where title = 'Pizzas'), 
1200, 1, (select id from UNIT where title = 'small'), 'Smoked chicken, sweet corn, onions and black olives with sweet and smoky BBQ sauce' , 'Y');

insert into dish (title, category_id, unit_price, quantity_per_unit, unit_id, description, active) values ('CHICKEN AND VEGETABLE SPRING ROLLS', (select id from CATEGORY where title = 'Frozen'), 
300, 12, (select id from UNIT where title = 'Standard Pack'), 'Chicken And Vegetable Spring Rolls' , 'Y');

insert into dish (title, category_id, unit_price, quantity_per_unit, unit_id, description, active) values ('CHICKEN AND VEGETABLE MIX SAMOSAS', (select id from CATEGORY where title = 'Frozen'), 
300, 30, (select id from UNIT where title = 'Standard Pack'), 'Chicken And Vegetable Mix Samosas' , 'Y');

insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Haniya Masood', '0322-8018600', '286 A Revenue Society Johar Town Lahore', '900', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Attiq Rathor', '0322-4033840', 'House 143-A, PCSIR Phase-2 Johar Town Lahore', '600', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Umer Tahir', '0321-5687892', 'House # 6-E, Model Town', '600', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Hassan Khan', '0321-4576638', 'RedMath', '600', SYSDATE); 
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Mohid', '0322-2857988', 'House no 29/B st#16 Hota Singh Road Sant Nagar near Naved Academy', '600', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Shahista Khalid', '0321-4939299', 'Qila Gujjar Singh', '600', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Shahid Khan', '0323-4662193', 'House# 17, Street# 55-A, Khyber Park, Sant Nagar, LHR', '500', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Rabiya Sherwani', '0333-8001651', 'Wapda Town', '600', SYSDATE);
insert into CUSTOMER (NAME, PH_NUMBER, ADDRESS, TOTAL_SALE, CREATION_DATE) values ('Jawwad Farooq Shami', '0334-4227165', 'RedMath', '1200', SYSDATE);

insert into ORDERS (CUSTOMER_ID, ORDER_DATE) values (1, SYSDATE);

insert into ORDER_DETAIL (ORDER_ID, DISH_ID, QUANTITY, SUB_TOTAL) values (1, (select id from DISH where title = 'CHICKEN AND VEGETABLE SPRING ROLLS'), 2, 600);