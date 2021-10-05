package ni.edu.uca.evaluacioncreaciondevistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import ni.edu.uca.evaluacioncreaciondevistas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        compra()
    }

    private fun compra() {
            val btn = binding.btnMontoP.setOnClickListener(View.OnClickListener {
            val nombProd: String = binding.etNombre.text.toString()
            val precio: Double = binding.etPrecio.text.toString().toDouble()
            val cantidad: Int = binding.etCantidad.text.toString().toInt()


            val fact = Pago(nombProd, precio, cantidad)
            val pago = fact.evaluarPago()
            val desc = fact.evaluarDescuento()
            val netoP = (pago - desc) * 1.15
            binding.tvPago.setText("Pago: ${pago.toString()}")
            binding.tvDesc.setText("Descuento ${desc.toString()}")
            binding.tvNetoP.setText("Neto Pago ${netoP.toString()}")

        })
    }
}


