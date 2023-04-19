package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView : RecyclerView? = null
    private var motorAdapter : MotorAdaper? = null
    private var motor = mutableListOf<Motor>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        motor = ArrayList()
        motor()
        list()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.layout_grid -> {
                grid()
                return true
            }
            R.id.layout_list -> {
               list()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun list(){
        recyclerView = findViewById<View>(R.id.rvMotor) as RecyclerView
        motorAdapter = MotorAdaper(this, motor as ArrayList<Motor>)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = motorAdapter
    }
    private fun grid(){
        recyclerView = findViewById<View>(R.id.rvMotor) as RecyclerView
        motorAdapter = MotorAdaper(this, motor as ArrayList<Motor>)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = motorAdapter
    }

    private fun motor(){
        var motor1 = Motor("Aerox","Motor Matic","155 CC",R.drawable.aerox)
        motor.add(motor1)
        motor1 = Motor("Beat","Motor Matic","110 CC",R.drawable.beat)
        motor.add(motor1)
        motor1 = Motor("CB 150 R","Motor Sport","150 CC",R.drawable.cb_150_r)
        motor.add(motor1)
        motor1 = Motor("CRF 150 L","Motor Off Road","150 CC",R.drawable.crf150l)
        motor.add(motor1)
        motor1 = Motor("Fino","Motor Matic","125 CC",R.drawable.fino)
        motor.add(motor1)
        motor1 = Motor("GSX 150","Motor Sport","150 CC",R.drawable.gsx150)
        motor.add(motor1)
        motor1 = Motor("KLX 150 L","Motor Off Road","150 CC",R.drawable.klx150l)
        motor.add(motor1)
        motor1 = Motor("Lexi","Motor Matic","125 CC",R.drawable.lexi)
        motor.add(motor1)
        motor1 = Motor("Mx King","Motor Sport","150 CC",R.drawable.mx_king)
        motor.add(motor1)
        motor1 = Motor("Nmax","Motor Matic","150 CC",R.drawable.nmax)
        motor.add(motor1)
        motor1 = Motor("Pcx","Motor Matic","150 CC",R.drawable.pcx)
        motor.add(motor1)
        motor1 = Motor("R15","Motor Sport","150 CC",R.drawable.r15)
        motor.add(motor1)
        motor1 = Motor("Revo","Motor Bebek","110 CC",R.drawable.revo)
        motor.add(motor1)
        motor1 = Motor("Scoppy","Motor Matic","110 CC",R.drawable.scoppy)
        motor.add(motor1)
        motor1 = Motor("Supra x 125","Motor Bebek","125 CC",R.drawable.supra_x_125)
        motor.add(motor1)
        motor1 = Motor("Vixion","Motor Sport","150 CC",R.drawable.vixion)
        motor.add(motor1)
        motor1 = Motor("WR 155","Motor Off Road","155 CC",R.drawable.wr155)
        motor.add(motor1)
        motor1 = Motor("Xmax","Motor Matic","250 CC",R.drawable.xmax)
        motor.add(motor1)

    }
}