package com.example.Pratica20240730EISG.servicios.implementaciones;

import com.example.Pratica20240730EISG.modelos.ProductoEISG;
import com.example.Pratica20240730EISG.repositorios.IProductoRepository;
import com.example.Pratica20240730EISG.servicios.interfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoService implements IProductoService {
    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public Page<ProductoEISG> buscarTodosPaginados(Pageable pageable) {
        return productoRepository.findAll(pageable);
    }

    @Override
    public List<ProductoEISG> obtenerTodos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<ProductoEISG> buscarPorId(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public ProductoEISG crearOEditar(ProductoEISG productoEISG) {
        return productoRepository.save(productoEISG);
    }

    @Override
    public void eliminarPorId(Integer id) {
        productoRepository.deleteById(id);
    }
}
