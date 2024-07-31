package com.example.Pratica20240730EISG.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "productos")
public class ProductoEISG {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("nombre")
    @Column(name = "nombre")
    @NotBlank(message = "El nombre es requerido")
    private String nombreEISG;

    @JsonProperty("descripcion")
    @Column(name = "descripcion")
    private String descripcionEISG;

    @JsonProperty("precio")
    @Column(name = "precio")
    @NotNull(message = "El precio es requerido")
    @Positive(message = "El precio debe ser positivo")
    private Double precioEISG;

    @JsonProperty("fecha_de_vencimiento")
    @Column(name = "fecha_de_vencimiento")
    @NotNull(message = "La fecha de vencimiento es requerida")
    @Future(message = "La fecha de vencimiento debe ser una fecha futura")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaVencimientoEISG;


    @JsonProperty("estatus")
    @Column(name = "estatus")
    @NotNull(message = "El estatus es requerido")
    private Byte estatusEISG;

    @JsonProperty("existencia")
    @Column(name = "existencia")
    @NotNull(message = "La existencia es requerida")
    @PositiveOrZero(message = "La existencia no puede ser negativa")
    private Integer existenciaEISG;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEISG() {
        return nombreEISG;
    }

    public void setNombreEISG(String nombreEISG) {
        this.nombreEISG = nombreEISG;
    }

    public String getDescripcionEISG() {
        return descripcionEISG;
    }

    public void setDescripcionEISG(String descripcionEISG) {
        this.descripcionEISG = descripcionEISG;
    }

    public Double getPrecioEISG() {
        return precioEISG;
    }

    public void setPrecioEISG(Double precioEISG) {
        this.precioEISG = precioEISG;
    }

    public LocalDate getFechaVencimientoEISG() {
        return fechaVencimientoEISG;
    }

    public void setFechaVencimientoEISG(LocalDate fechaVencimientoEISG) {
        this.fechaVencimientoEISG = fechaVencimientoEISG;
    }

    public Byte getEstatusEISG() {
        return estatusEISG;
    }

    public void setEstatusEISG(Byte estatusEISG) {
        this.estatusEISG = estatusEISG;
    }

    public Integer getExistenciaEISG() {
        return existenciaEISG;
    }

    public void setExistenciaEISG(Integer existenciaEISG) {
        this.existenciaEISG = existenciaEISG;
    }
    private String formattedFechaVencimientoEISG;

    public String getFormattedFechaVencimientoEISG() {
        return formattedFechaVencimientoEISG;
    }

    public void setFormattedFechaVencimientoEISG(String formattedFechaVencimientoEISG) {
        this.formattedFechaVencimientoEISG = formattedFechaVencimientoEISG;
    }
}
