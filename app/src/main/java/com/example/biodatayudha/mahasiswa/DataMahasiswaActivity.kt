package com.example.biodatayudha.mahasiswa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.biodatayudha.R
import com.example.biodatayudha.databinding.ActivityProductsBinding

class DataMahasiswaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityProductsBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Mengatur layout manager untuk recycler view, menggunakan LinearLayoutManager
        binding.recView.layoutManager = GridLayoutManager(this, 2)

        // Membuat list data
        val datas = mutableListOf<DcMahasiswa>()
        datas.add(DcMahasiswa(R.drawable.satu,"Yudha", 233307095, "2D", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.dua,"Dimas", 233307102, "2C", "Magetan"))
        datas.add(DcMahasiswa(R.drawable.tiga,"Tyo", 233307090, "2A", "Takeran"))
        datas.add(DcMahasiswa(R.drawable.empat,"Gading", 233307075, "2B", "Ponorogo"))
        datas.add(DcMahasiswa(R.drawable.lima,"Ilham", 233307105, "2D", "Takera"))
        datas.add(DcMahasiswa(R.drawable.enam,"Ardian", 233307125, "2C", "Madiun"))
        datas.add(DcMahasiswa(R.drawable.tujuh,"Putra", 233307115, "2B", "Bojonegoro"))
        datas.add(DcMahasiswa(R.drawable.lapan,"Wahyu", 233307055, "2A", "Ponorogo"))
        datas.add(DcMahasiswa(R.drawable.mbilan,"Anggit", 233307075, "2D", "Gelung, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))
        datas.add(DcMahasiswa(R.drawable.cepuyuh,"Bagas", 233307045, "2A", "Paron, Ngawi"))

        // Mengatur adapter untuk recycler view
        binding.recView.adapter = DcMahasiswaAdapter(datas)
    }
}