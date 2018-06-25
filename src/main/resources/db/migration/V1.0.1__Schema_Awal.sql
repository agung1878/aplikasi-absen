    create table jurusan (
       id varchar(36) not null,
        nama_jurusan varchar(255) not null,
        updated_at datetime,
        primary key (id)
    ) engine=MyISAM;    
    create table kelas (
       id varchar(36) not null,
        nama_kelas varchar(255) not null,
        updated_at datetime,
        primary key (id)
    ) engine=MyISAM;    
    create table siswa (
       id varchar(36) not null,
        agama varchar(255) not null,
        alamat varchar(255) not null,
        jenis_kelamin varchar(255) not null,
        nama_siswa varchar(255) not null,
        nis varchar(10) not null,
        nomor_telepon varchar(255) not null,
        tanggal_lahir date not null,
        tempat_lahir varchar(255) not null,
        updated_at datetime,
        id_jurusan varchar(36) not null,
        id_kelas varchar(36) not null,
        primary key (id)
    ) engine=MyISAM;    
    alter table c_security_grup_permission 
       add constraint UK_g3afl0dtqhaqme8ly2a5v2cau unique (name);    
    alter table c_security_permission 
       add constraint UK_k4suda9cvcsoikdgquscypmt6 unique (permission_value);    
    alter table c_security_user 
       add constraint UK_6s6ixjdhpc3ihraq0gssmugk4 unique (email);    
    alter table c_security_user 
       add constraint UK_qe0w506te27emuohn8x68d5la unique (no_hp);    
    alter table c_security_user 
       add constraint UK_at8if7a9lnl90wxllb9divpdf unique (username);    
    alter table jurusan 
       add constraint UK_1r0imgf49pydgw9rm0qdkucnw unique (nama_jurusan);    
    alter table siswa 
       add constraint UK_qj17trxkactt9gavs1adia5yq unique (nis);    
    alter table c_security_permission 
       add constraint FKdowhlmc6af32s1sfq02stvv13 
       foreign key (id_grup_permission) 
       references c_security_grup_permission (id);    
    alter table c_security_user_password 
       add constraint FK80arji7i1u0styufcy8b91it5 
       foreign key (id_user) 
       references c_security_user (id);    
    alter table siswa 
       add constraint FKt9yambgs0v7lujpec8pdautta 
       foreign key (id_jurusan) 
       references jurusan (id);    
    alter table siswa 
       add constraint FKlbyb85ft4vq05gp235a432rur 
       foreign key (id_kelas) 
       references kelas (id);
