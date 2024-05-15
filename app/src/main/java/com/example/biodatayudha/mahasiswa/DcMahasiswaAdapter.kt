package com.example.biodatayudha.mahasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.biodatayudha.R

class DcMahasiswaAdapter(private val dataMhs: List<DcMahasiswa>):
    RecyclerView.Adapter<DcMahasiswaAdapter.DcMahasiswaViewHolder>() {

        // View Holder untuk menampung dan mengatur tampilan setiap item dalam recycle view
    class DcMahasiswaViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
            val imageIv : ImageView = row.findViewById(R.id.ivGambar)
            val namaTv : TextView = row.findViewById(R.id.tvNama)
            val nimTv : TextView = row.findViewById(R.id.tvNim)
            val kelasTv : TextView = row.findViewById(R.id.tvKelas)
            val alamatTv : TextView = row.findViewById(R.id.tvAlamat)
        }

    // Membuat ViewHolder baru saat recycler view memerlukan item baru untuk ditampilkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcMahasiswaViewHolder {
        // Menginflasi layout untuk item data dan membuat ViewHolder
        val layoutData = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return DcMahasiswaViewHolder(layoutData)
    }


    override fun getItemCount(): Int {
        //mengembalikan jumlah item pada list products
        return(dataMhs.size)
    }

    // Mengikat data data ke ViewHolder untuk ditampilkan dalam recycler view
    override fun onBindViewHolder(holder: DcMahasiswaViewHolder, position: Int) {
        // Mengambil data pada posisi tertentu dalam list
        val data = dataMhs[position]

        // Mengatur data variabel data pada tampilan yang sesuai dalam ViewHolder
        holder.imageIv.setImageResource(data.image)
        holder.namaTv.text = data.nama
        holder.nimTv.text = data.nim.toString()
        holder.kelasTv.text = data.kelas
        holder.alamatTv.text = data.alamat
    }

}