package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MotorAdaper (
    private val getActivity2: MainActivity,
    private val motorList: ArrayList<Motor>
        ): RecyclerView.Adapter<MotorAdaper.ViewHolder>(){
            class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
                val namaMotor : TextView = itemView.findViewById(R.id.dcNama)
                val jenisMotor : TextView = itemView.findViewById(R.id.dcJenis)
                val ccMotor : TextView = itemView.findViewById(R.id.dcCc)
                val GambarMotor : ImageView = itemView.findViewById(R.id.dcGambar)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorAdaper.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.adapter_motor, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return motorList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaMotor.text = motorList[position].nama
        holder.jenisMotor.text = motorList[position].jenis
        holder.ccMotor.text = motorList[position].cc
        holder.GambarMotor.setImageResource(motorList[position].gambar)
        val pesan = motorList[position].nama + " adalah "+ motorList[position].jenis + " dengan kapasitas mesin  " + motorList[position].cc
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, pesan, Toast.LENGTH_SHORT).show()
        }
    }
}


