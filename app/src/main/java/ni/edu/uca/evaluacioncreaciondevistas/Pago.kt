package ni.edu.uca.evaluacioncreaciondevistas

class Pago(val nombre:String, val precio:Double, val cantidad :Int) {
    public fun evaluarPago():Double{
        return  cantidad * precio
    }
    public fun evaluarDescuento(): Double{
        if (evaluarPago() > 200){
            return evaluarPago() * 0.10
        }else{
            return 0.00
        }
    }
}