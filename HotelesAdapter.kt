package com.example.nuevorecicler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.nuevorecicler.databinding.HotelesItemBinding
import com.squareup.picasso.Picasso

class HotelesAdapter(val hoteles: List<Hoteles>):RecyclerView.Adapter<HotelesAdapter.HotelesHolder>() {
    class HotelesHolder(val view: View):RecyclerView.ViewHolder(view){
        val binding=HotelesItemBinding.bind(view)
        fun render(hoteles: Hoteles){
            binding.tvnombre.setText(hoteles.nombre)
            binding.tvubicacion.setText(hoteles.ubicacion)
            binding.tvprecio.setText(hoteles.precio)
            Picasso.get().load(hoteles.image).into(binding.ivhoteles)
            view.setOnClickListener {
                Toast.makeText(view.context,"Ocupado",Toast.LENGTH_LONG).show()
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelesHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return HotelesHolder(layoutInflater.inflate(R.layout.hoteles_item,parent,false))
    }

    override fun onBindViewHolder(holder: HotelesHolder, position: Int) {
        holder.render(hoteles[position])
    }

    override fun getItemCount(): Int {
      return  hoteles.size
    }

}