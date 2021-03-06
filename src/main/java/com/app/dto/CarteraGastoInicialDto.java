package com.app.dto;

import com.app.entidades.Cartera;
import com.app.entidades.Formato;
import com.app.entidades.GastoInicial;
import lombok.Data;

@Data
public class CarteraGastoInicialDto {
    private Long id;
    private Cartera cartera;
    private GastoInicial gastoinicial;
    private Formato formato;
    private Double MGastoInicial;
}
