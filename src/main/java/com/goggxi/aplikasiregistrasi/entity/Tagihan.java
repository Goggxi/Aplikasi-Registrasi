package com.goggxi.aplikasiregistrasi.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
public class Tagihan {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_pendaftaran")
    private Pendaftaran pendaftaran;

    @NotEmpty
    private String nomorInvoice;

    @NotEmpty
    private String bank;

    @NotEmpty
    private String nomorRekening;

    @NotEmpty
    private String namaRekening;

    @NotEmpty
    private String keterangan;

    @NotNull
    private LocalDateTime tanggalPembuatan = LocalDateTime.now();

    @NotNull
    private LocalDateTime tanggalKadaluarsa = LocalDateTime.now().plusMonths(1);

    @NotNull
    private Boolean lunas = false;

}
