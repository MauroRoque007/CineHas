package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "TBL_SESSAO")
public class Sessao
{
    @Id
    @Column(name = "ID_SESSAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DT_DATA")
    private Date data;
    @Column(name = "HR_HORARIO")
    private Time horario;
    @Column(name = "NR_PRECO")
    private Double preco;
    @Column(name = "ID_SALA")
    private Integer sala;
    @Column(name = "ID_FILME")
    private Long filme;
}