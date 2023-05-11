package br.com.api.produtos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos")
@Getter
@Setter
public class ProdutoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nome;
    private String marca;
    private String nomedopais;
    private String endereco;
    private String cpf;
    private String sexo;
    private String telefone;
    private float altura;
    private float peso;
    private int dataNascimento;
    private String diagnostico;
    private String receita;
    private String exames;
}
