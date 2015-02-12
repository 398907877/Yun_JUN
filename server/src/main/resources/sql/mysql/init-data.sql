 /* 角色 */
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('ROLE','ADMIN', '系统管理员', 1);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('ROLE','OPERATOR', '操作员', 2);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('ROLE','USER', '用户', 3);
 
 /* 用户 */
 insert into edu_user (login_name, name, password, salt, roles, register_date) values('admin','Admin','691b14d79bf0fa2215f155235df5e670b64394cc','7efbd59d9741d34f','ADMIN','2012-06-04 01:00:00');
 /* 学科 */
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Chinese', '语文', 1);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Math', '数学', 2);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','English', '英语', 3);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Physical', '物理', 4);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Chemical', '化学', 5);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','History', '历史', 6);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Geography', '地理', 7);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Politics', '政治', 8);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('SUBJECT','Science', '科学', 9);
 /* 年级 */
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','One', '一年级', 1);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Two', '二年级', 2);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Three', '三年级', 3);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Four', '四年级', 4);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Five', '五年级', 5);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Six', '六年级', 6);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Seven', '七年级', 7);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Eight', '八年级', 8);
  insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GRADE','Nine', '九年级', 9);
 /* 教学版本 */
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('EDITION','e1', '人教版', 1);
 /* 设备类型 */
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('DEVICE_TYPE','3', 'Android', 1);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('DEVICE_TYPE','4', 'IOS', 2);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('DEVICE_TYPE','5', 'WinPhone', 3);
 /*    姓别 */
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GENDER','3', 'Male', 1);
 insert into hk_dictionaries (class_name, class_key, dict_value, seq) values('GENDER','4', 'Female', 2);
