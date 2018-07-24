insert into s_user (id, username) values ('1','admin');
insert into s_user_password (id, id_user, password) values ('1', '1', 'admin');
insert into s_group (id, nama) values ('g', 'Guru');
insert into s_user_group(id, id_group, id_user) values ('x', 'g', '1');
insert into s_permission (id, nama) values ('c', 'CEK_ABSENSI');
insert into s_permission (id, nama) values ('i', 'ISI_ABSEN');
insert into s_group_permission(id, id_group, id_permission) values ('1','g', 'i');