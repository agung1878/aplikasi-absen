    create table jurusan (
       id varchar(36) not null,
        nama_jurusan varchar(255) not null,
        updated_at timestamp,
        primary key (id)
    );    
    create table kelas (
       id varchar(36) not null,
        nama_kelas varchar(255) not null,
        updated_at timestamp,
        primary key (id)
    );    
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
        updated_at timestamp,
        id_jurusan varchar(36) not null,
        id_kelas varchar(36) not null,
        primary key (id)
    );    
    alter table jurusan 
       add constraint UK_1r0imgf49pydgw9rm0qdkucnw unique (nama_jurusan);    
    alter table siswa 
       add constraint UK_qj17trxkactt9gavs1adia5yq unique (nis);    
    alter table siswa 
       add constraint FKt9yambgs0v7lujpec8pdautta 
       foreign key (id_jurusan) 
       references jurusan (id);    
    alter table siswa 
       add constraint FKlbyb85ft4vq05gp235a432rur 
       foreign key (id_kelas) 
       references kelas (id);
