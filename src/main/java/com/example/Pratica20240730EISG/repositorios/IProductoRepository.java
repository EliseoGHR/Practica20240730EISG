package com.example.Pratica20240730EISG.repositorios;

import com.example.Pratica20240730EISG.modelos.ProductoEISG;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository  extends JpaRepository <ProductoEISG, Integer>{
}
