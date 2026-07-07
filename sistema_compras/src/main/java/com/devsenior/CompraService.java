package com.devsenior;

public class CompraService {
    public ResultCompra realizarCompra(CarShopping carShopping) {
        if (carShopping.isVacio()) {
            throw  new RuntimeException("El carrito de compras está vacío. No se puede realizar la compra.");
        }
        // Aquí podrías agregar lógica adicional, como verificar el stock, procesar el pago, etc.
        carShopping.clear(); // Limpiar el carrito después de realizar la compra
        return new CompraExitosa();
    }

    public String getMessageCompraExitosa() {
        return "¡Compra realizada con éxito! Gracias por tu compra.";
    }
}
