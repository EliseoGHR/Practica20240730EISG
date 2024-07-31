package com.example.Pratica20240730EISG.servicios.interfaces;
import com.example.Pratica20240730EISG.modelos.ProductoEISG;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    Page<ProductoEISG> buscarTodosPaginados(Pageable pageable);

    List<ProductoEISG> obtenerTodos();

    Optional<ProductoEISG> buscarPorId(Integer id);

    ProductoEISG crearOEditar(ProductoEISG productoEISG);

    void eliminarPorId(Integer id);
}
