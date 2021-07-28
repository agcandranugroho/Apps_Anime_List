package com.example.empty_player

object AnimeData {
    private val animeNames = arrayOf("Isaac Netero - Hunter x Hunter",
        "Eren Yeager - Attack on Titan",
        "Mob - Mob Psycho 100",
        "Jotaro Kujo - Jojo's Bizarre Adventure",
        "Simon - Gurren Lagann",
        "Son Goku - Dragon Ball Super",
        "Tetsuo Shima - Akira",
        "Kyubey - Madoka Magica",
        "Zeno - Dragon Ball Super",
        "Saitama - One Punch Man"
        )
    private val animeDetails = arrayOf("Mantan ketua Hunter Association,Isaac Netero adalah salah satu karakter bela diri terkuat di anime. ",
        "Eren Yeager punya kemampuan berubah menjadi titan setinggi 15 meter dan kemampuan regenerasi yang luar biasa.",
        "Kageyama Shigo, atau lebih dikenal sebagai Mob, adalah seseorang dengan kemampuan telepati ultra-kuat yang dapat menghancurkan siapa pun atau benda apa pun dengan pemikiran sederhana.",
        "Jotaro Kujo adalah protagonis utama dari JoJo's Bizarre Adventure: Stardust Crusaders. Dengan kemampuan Star Platinum miliknya, ia mampu menghentikan waktu dan menyerang musuhnya dengan pukulan yang sangat kuat, baik di dalam maupun di luar waktu yang berhenti.",
        "Simon adalah penduduk bumi biasa yang menggabungkan kekuatan spiral menjadi serangan dahsyat bagi robot raksasanya.",
        "Karakter bela diri terkuat dalam seluruh anime, Goku adalah petarung terkuat di dunianya dan di seluruh alam semesta lain di Dragon Ball.",
        "Tetsuo Shima bisa dianggap sebagai karakter antagonis di anime Akira. Ia membangkitkan kekuatan psikisnya yang tak terbatas setelah bertemu dengan pemilik kekuatan psikis lainnya.",
        "Kyubey adalah perwujudan dari suhu terpanas di alam semesta. Dia tak terkalahkan, abadi, dan hidup hanya untuk membawa semua kehidupan ke kehancuran.",
        "Zeno adalah penguasa setiap realitas dalam Dragon Ball Super yang dapat menciptakan dan menghancurkan semua eksistensi dalam sekejap.",
        "Saitama nggak diragukan lagi adalah karakter anime terkuat. Dalam animenya, ia diceritakan memang telah menjadi karakter utama terkuat yang bisa mengalahkan musuh-musuhnya hanya dengan sekali pukulan."
    )

    private val animeCiri = arrayOf("- rambut putih dan diikat\n- telinga lebar\n- mata sipit",
    "- rambut pendek dan lurus\n- warna mata hijau\n- kulit putih",
    "- rambut pendek dan lurus\n- mata lebar polos\n- kulit putih",
    "- rambut pendek dan bergelombang\n- mata sipit\n- kulit sawo matang",
    "- rambut panjang\n- mata lebar\n- kulit putih",
    "- rambut panjang\n- berotot\n- mata lebar",
    "- rambut pendek\n- mata sipit\n- kulit sawo matang",
    "- bentuk mirip kelinci\n- warna mata ungu\n- kulit putih",
    "- botak\n- mata bulat\n- warna kulit pelangi",
    "- botak\n- mata sipit\n- kulit putih")

    private val animeUmur = arrayOf("121 tahun",
    "12 tahun",
    "15 tahun",
    "43 tahun",
    "20 tahun",
    "30 tahun",
    "12 tahun",
    "201 tahun",
    "504 tahun",
    "25 tahun")

    private val animePictures = intArrayOf(R.drawable.isaac_netero,
    R.drawable.eren_yeager,
    R.drawable.mob,
    R.drawable.jotaro_kujo,
    R.drawable.simon,
    R.drawable.son_goku,
    R.drawable.tetsuo_shima,
    R.drawable.kyubey,
    R.drawable.zeno,
    R.drawable.saitama)

    val listDataAnime : ArrayList<Anime>
    get() {
        val list = arrayListOf<Anime>()
        for (position in animeNames.indices){
            val anime = Anime()
            anime.name = animeNames[position]
            anime.detail = animeDetails[position]
            anime.ciri = animeCiri[position]
            anime.umur = animeUmur[position]
            anime.picture = animePictures[position]
            list.add(anime)
        }
        return list
    }
}