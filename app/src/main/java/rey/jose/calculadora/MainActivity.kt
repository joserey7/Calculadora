package rey.jose.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cero: Button = findViewById(R.id.cero) as Button
        val uno: Button = findViewById(R.id.uno) as Button
        val dos: Button = findViewById(R.id.dos) as Button
        val tres: Button = findViewById(R.id.tres) as Button
        val cuatro: Button = findViewById(R.id.cuatro) as Button
        val cinco: Button = findViewById(R.id.cinco) as Button
        val seis: Button = findViewById(R.id.seis) as Button
        val siete: Button = findViewById(R.id.siete) as Button
        val ocho: Button = findViewById(R.id.ocho) as Button
        val nueve: Button = findViewById(R.id.nueve) as Button
        val suma: Button = findViewById(R.id.suma) as Button
        val resta: Button = findViewById(R.id.resta) as Button
        val multi: Button = findViewById(R.id.multi) as Button
        val div: Button = findViewById(R.id.div) as Button
        val result: Button = findViewById(R.id.result) as Button
        val erase: Button = findViewById(R.id.erase) as Button

        var operador: String = ""
        var valor:String = ""
        var total = 0.0

        cero.setOnClickListener {
            valor +="0"
            txtNum.setText(valor)
        }
        uno.setOnClickListener {
            valor +="1"
            txtNum.setText(valor)
        }
        dos.setOnClickListener {
            valor +="2"
            txtNum.setText(valor)
        }
        tres.setOnClickListener {
            valor +="3"
            txtNum.setText(valor)
        }
        cuatro.setOnClickListener {
            valor +="4"
            txtNum.setText(valor)
        }
        cinco.setOnClickListener {
            valor +="5"
            txtNum.setText(valor)
        }
        seis.setOnClickListener {
            valor +="6"
            txtNum.setText(valor)
        }
        siete.setOnClickListener {
            valor +="7"
            txtNum.setText(valor)
        }
        ocho.setOnClickListener {
            valor +="8"
            txtNum.setText(valor)
        }
        nueve.setOnClickListener {
            valor +="9"
            txtNum.setText(valor)
        }
        suma.setOnClickListener {
            operador = "+"
            txtResult.setText(txtNum.text.toString())
            total = txtResult.text.toString().toDouble()
            txtNum.setText("0")
            txtOperador.setText("+")
            valor = ""
        }
        resta.setOnClickListener {
            operador = "-"
            txtResult.setText(txtNum.text.toString())
            total = txtResult.text.toString().toDouble()
            txtNum.setText("0")
            txtOperador.setText("-")
            valor = ""
        }
        multi.setOnClickListener {
            operador = "*"
            txtResult.setText(txtNum.text.toString())
            total = txtResult.text.toString().toDouble()
            txtNum.setText("0")
            txtOperador.setText("*")
            valor = ""
        }
        div.setOnClickListener {
            operador = "/"
            txtResult.setText(txtNum.text.toString())
            total = txtResult.text.toString().toDouble()
            txtNum.setText("0")
            txtOperador.setText("/")
            valor = ""
        }
        result.setOnClickListener {
            when(operador) {
                "+" -> {
                    total = total + txtNum.text.toString().toDouble()
                    txtResult.setText(total.toString())
                    txtOperador.setText("")
                    txtNum.setText("0")
                    valor = ""
                }
                "-" -> {
                    total = total - txtNum.text.toString().toDouble()
                    txtResult.setText(total.toString())
                    txtOperador.setText("")
                    txtNum.setText("0")
                    valor = ""

                }
                "*" -> {
                    total = total * txtNum.text.toString().toDouble()
                    txtResult.setText(total.toString())
                    txtOperador.setText("")
                    txtNum.setText("0")
                    valor = ""
                }
                "/" -> {
                    if(txtNum.text.toString().toDouble() != 0.0){
                        total = total / txtNum.text.toString().toDouble()
                        txtResult.setText(total.toString())
                    }else{
                        txtResult.setText("No se puede dividir entre 0")
                    }
                    txtOperador.setText("")
                    txtNum.setText("0")
                    valor = ""
                }
            }
            //total = 0.0
        }

        erase.setOnClickListener {
            txtNum.setText("0")
            txtResult.setText("")
            txtOperador.setText("")
            total = 0.0
            valor = ""
        }



    }
}
