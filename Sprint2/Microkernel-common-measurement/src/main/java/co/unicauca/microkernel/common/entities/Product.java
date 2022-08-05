package co.unicauca.microkernel.common.entities;

public class Product {

    /**
     * ID del producto.
     *
     */
    private int productId;

    /**
     * Peso del producto, en kilogramos.
     *
     */
    private double weight;
    /**
     * Diametro del producto, en centímetros.
     *
     */
    private double diameter;
    /**
     * Alto del producto, en centímetros.
     *
     */
    private double height;

    public Product() {

    }

    public Product(int productId, double weight, double diameter, double height) {
        this.productId = productId;
        this.weight = weight;
        this.diameter = diameter;
        this.height = height;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
