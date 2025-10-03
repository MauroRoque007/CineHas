package br.com.etec.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ASSENTO")
public class Assento
{



    @Id
    @Column(name = "ID_ASSENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TX_FILEIRA")
    private String fileira;
    @Column(name = "NR_POSICAO")
    private  Integer posicao;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;

}
