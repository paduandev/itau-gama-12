package exercicios.exercicio04;

import java.time.LocalDate;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public Data() {
        LocalDate dataAtual = LocalDate.now();
        dia = dataAtual.getDayOfMonth();
        mes = dataAtual.getMonthValue();
        ano = dataAtual.getYear();
    }


    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if( ano > 0 ) {
            this.ano = ano;
        }
    }

    public String getData() {
        return dia + "/" + mes + "/" + ano;
    }

}
