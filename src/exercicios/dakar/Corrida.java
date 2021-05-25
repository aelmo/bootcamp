package exercicios.dakar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corrida {
    private final Integer quantidadeVeiculosPermitidos;
    private Map<Integer, Veiculo> listaVeiculos = new HashMap<>();
    private int patente = 0;
    private Socorrista<Carro> socorristaCarro = new SocorristaCarro();
    private Socorrista<Moto> socorristaMoto = new SocorristaMoto();

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public void registrarVeiculo(Veiculo veiculo) {
        if(this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            listaVeiculos.put(patente,veiculo);
            patente++;
        } else {
            System.out.println("Quantidade máxima de veículos atingida");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        if(this.listaVeiculos.size() > 0) {
            listaVeiculos.remove(veiculo);
        }
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaVeiculos.forEach((patente, veiculo) -> {
            if(veiculo.getPlaca().equals(placa)) {
                listaVeiculos.remove(veiculo);
            }
        });
    }

    public void calculaVencedor() {
        double result = 0.0;
        int patenteVencedor = 0;

        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculo veiculo = listaVeiculos.get(i);
            double resultadoVeiculo = veiculo.getVelocidade() * veiculo.getAceleracao() / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));

            if (result < resultadoVeiculo) {
                result = resultadoVeiculo;
                patenteVencedor = i;
            }
        }

        System.out.println("O veiculo vencedor é " + patenteVencedor);
    }

    public void socorrerCarro(String documento) {
        listaVeiculos.forEach((patente, veiculo) -> {
            if(veiculo.getPlaca().equals(documento)) {
                this.socorristaCarro.socorrer((Carro) veiculo, documento);
            }
        });
    }

    public void socorrerMoto(String documento) {
        listaVeiculos.forEach((patente, veiculo) -> {
            if(veiculo.getPlaca().equals(documento)) {
                this.socorristaMoto.socorrer((Moto) veiculo, documento);
            }
        });
    }
}

