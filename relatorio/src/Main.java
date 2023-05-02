import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Gasto> gastos = new ArrayList<>();
        gastos.add(new Gasto("Telefone", new Date(), 90.0, "Boleto"));
        gastos.add(new Gasto("Restaurante", new Date(), 200.0, "Vale-refeição"));
        gastos.add(new Gasto("Compras", new Date(), 300.0, "PIX"));
        gastos.add(new Gasto("Aluguel", new Date(), 1200.0, "Transferência"));

        List<Ganho> ganhos = new ArrayList<>();
        ganhos.add(new Ganho("Salário", new Date(), 6000.0));

        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorioDespesas(gastos);
        relatorio.gerarRelatorioReceitas(ganhos);
        relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
    }
}