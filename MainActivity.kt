package com.example.nuevorecicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nuevorecicler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val Hoteles= listOf(Hoteles("gran hotel melia Almuñecar","Almuñecar","120 euros","https://d500.epimg.net/cincodias/imagenes/2019/09/23/companias/1569232392_954737_1569233531_noticia_normal_recorte1.jpg"),
        Hoteles("gran hotel melia Almuñecar","Almuñecar","120 euros","https://casadelpoeta.es/wp-content/uploads/2019/09/Hoteles-con-encanto-en-Espa%C3%B1a.jpg"),
        Hoteles("gran hotel Costa Luz","Malaga","118 euros","https://media-cdn.tripadvisor.com/media/photo-s/0b/ac/b1/20/terrace-meeting-rooms.jpg"),
        Hoteles("gran hotel Almericost","Nijar","100 euros","https://www.bookerclub.com/cache/images/1413.jpg"),
        Hoteles("gran hotel melia Malaga resort","Malaga","128 euros","https://imagenes.20minutos.es/files/image_656_370/uploads/imagenes/2020/02/06/hotel-delamar-finalista-premio-caixabank-hotels-tourism-a-mejor-reposicionamiento-o-reforma.jpeg"),
        Hoteles("gran hotel melia Benidorm","Benidorm","110 euros","https://static3.abc.es/media/summum/2018/11/06/hotel-kSNH--620x349@abc.JPG"),
        Hoteles("gran hotel Ambrano","Roquetas de mar","95 euros","https://www.hotelescenter.es/wp-content/blogs.dir/1601/files/home//home-corporativa-cordoba-hotel-corboba-center-1.jpg"),
        Hoteles("gran hotel San Martín","Nijar","100 euros","https://www.vinccihoteles.com/sites/default/files/styles/portlets_destacados/public/cinco-estrellas-lujo-tenerife.jpg?itok=qLiDNdEY"))

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inicializarRecycler()


    }
    fun inicializarRecycler(){
        val adapter=HotelesAdapter(Hoteles)
        binding.rvhoteles.layoutManager= LinearLayoutManager(this)
        binding.rvhoteles.adapter=adapter
    }

}