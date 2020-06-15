package br.ead.caraoucoroa;

enum CaraCoroa {

    CARA(0,"Cara"),
    COROA(1,"Coroa");

    private Integer cod;
    private String descricao;

    private CaraCoroa(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

}
