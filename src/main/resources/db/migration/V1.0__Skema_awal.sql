CREATE TABLE kelas (
    id         VARCHAR(225) NOT NULL,
    nama_kelas VARCHAR(30) NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT NOW(),
    PRIMARY KEY(id),
    UNIQUE(nama_kelas)
);

CREATE TABLE jurusan (
    id           VARCHAR(225) NOT NULL,
    nama_jurusan VARCHAR(30) NOT NULL,
    updated_at   TIMESTAMP NOT NULL DEFAULT NOW(),
    PRIMARY KEY(id),
    UNIQUE(nama_jurusan)
);

CREATE TABLE siswa (
    id           VARCHAR(225) NOT NULL,
    id_kelas     VARCHAR(225) NOT NULL,
    id_jurusan   VARCHAR(225) NOT NULL,
    nis          VARCHAR(100) NOT NULL,
    nama_siswa   VARCHAR(30) NOT NULL,
    alamat       VARCHAR(100) NOT NULL,
    tanggal_lahir    DATE NOT NULL,
    tempat_lahir VARCHAR(100) NOT NULL,
    jenis_kelamin  VARCHAR(2) NOT NULL,
    agama        VARCHAR(10) NOT NULL,
    nomor_telepon      VARCHAR(15) NOT NULL,
    updated_at   TIMESTAMP NOT NULL DEFAULT NOW(),
    PRIMARY KEY (id),
    UNIQUE (nis),
    FOREIGN KEY (id_kelas) REFERENCES kelas (id),
    FOREIGN KEY (id_jurusan) REFERENCES jurusan (id)
);

CREATE TABLE absen (
    id         VARCHAR(225) NOT NULL,
    id_siswa   VARCHAR(100) NOT NULL,
    masuk      VARCHAR(5) NOT NULL,
    izin       VARCHAR(5) NOT NULL,
    alpa       VARCHAR(5) NOT NULL,
    sakit      VARCHAR(5) NOT NULL,
    tanggal_absen  DATE NOT NULL,
    keterangan VARCHAR(100) NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT NOW(),
    PRIMARY KEY (id),
    FOREIGN KEY (id_siswa) REFERENCES siswa (id)
); 
    