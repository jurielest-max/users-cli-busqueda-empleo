package com.jcaa.udec.collections.domain.port.out;

import com.jcaa.udec.collections.domain.core.model.Cliente;

import java.util.Optional;

public interface ObtenerClientePort {
    Optional<Cliente> obtenerPorId(String id);
}
