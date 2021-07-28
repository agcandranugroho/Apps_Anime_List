package com.example.empty_player

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnime: RecyclerView
    private var list: ArrayList<Anime> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnime = findViewById(R.id.rv_main)
        rvAnime.setHasFixedSize(true)

        list.addAll(AnimeData.listDataAnime)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode){
            R.id.action_about -> {
                val moveToAbout = Intent(this@MainActivity, About::class.java)
                startActivity(moveToAbout)
            }
        }
    }

    private fun showRecyclerList() {
        rvAnime.layoutManager = LinearLayoutManager(this)
        val listAnimeAdapter = ListAnimeAdapter(list)
        rvAnime.adapter = listAnimeAdapter

        listAnimeAdapter.setOnItemClickCallback(object : ListAnimeAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Anime) {
                showSelectedAnime(data)
            }
        })
    }

    private fun showSelectedAnime(anime: Anime){
        //Toast.makeText(this, "Kamu memilih " + anime.name, Toast.LENGTH_SHORT).show()
        val moveToDetail = Intent(this@MainActivity,Detail::class.java)
            .putExtra(Detail.EXTRA_NAME,anime.name)
            .putExtra(Detail.EXTRA_DETAIL,anime.detail)
            .putExtra(Detail.EXTRA_PIC,anime.picture)
            .putExtra(Detail.EXTRA_CIRI,anime.ciri)
            .putExtra(Detail.EXTRA_UMUR,anime.umur)
        startActivity(moveToDetail)
    }
}
