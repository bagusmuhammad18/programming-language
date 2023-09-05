package com.example.programminglanguage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languageList = listOf<Language>(
            Language(
                R.drawable.python,
                "Python",
                "\n" +
                        "Python adalah bahasa pemrograman tingkat tinggi yang populer dan serbaguna. Bahasa ini dirancang oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991. Sejak itu, Python telah menjadi salah satu bahasa pemrograman paling digunakan di dunia.\n" +
                        "\n" +
                        "Salah satu alasan utama kepopuleran Python adalah kemudahan penggunaannya. Bahasa ini memiliki sintaksis yang mudah dipahami, sehingga cocok untuk pemula dalam pemrograman. Python juga memiliki banyak perpustakaan dan modul yang tersedia, yang memungkinkan pengembang untuk dengan cepat membangun aplikasi dengan fitur yang beragam.\n" +
                        "\n" +
                        "Jumlah pengguna Python terus bertumbuh seiring waktu. Banyak organisasi besar seperti Google, Facebook, Dropbox, dan NASA menggunakan Python dalam pengembangan berbagai jenis proyek. Bahkan di luar dunia teknologi, Python digunakan dalam berbagai bidang seperti ilmu data, kecerdasan buatan, pengembangan web, dan pengembangan permainan.\n" +
                        "\n" +
                        "Python didukung oleh berbagai platform, termasuk Windows, macOS, Linux, dan bahkan platform mobile seperti Android. Ini membuatnya menjadi pilihan yang sangat fleksibel untuk pengembang yang ingin bekerja di berbagai lingkungan.\n" +
                        "\n" +
                        "Alasan utama mengapa Python termasuk dalam daftar bahasa pemrograman teratas adalah karena kombinasi dari kemudahan penggunaan, fleksibilitas, dan ekosistem yang kuat. Bahasa ini memiliki komunitas yang besar dan aktif, yang terus berkontribusi pada pengembangan dan pemeliharaan perpustakaan dan alat-alat Python. Selain itu, Python sangat populer dalam bidang ilmu data dan kecerdasan buatan karena perpustakaan seperti NumPy, pandas, scikit-learn, dan TensorFlow yang kuat, yang memungkinkan pengembang untuk melakukan analisis data dan pembelajaran mesin dengan mudah.\n" +
                        "\n" +
                        "Penggunaan Python tersebar luas, termasuk dalam pengembangan perangkat lunak desktop, web, perangkat seluler, perangkat keras, serta dalam penelitian dan analisis data. Dengan segala kelebihannya, Python tetap menjadi salah satu bahasa pemrograman yang paling diminati oleh pengembang di seluruh dunia."
            ),
            Language(
                R.drawable.java,
                "Java",
                "Java adalah sebuah bahasa pemrograman yang populer digunakan dalam pengembangan perangkat lunak. Bahasa ini pertama kali dirilis oleh Sun Microsystems pada tahun 1995 dan sejak itu telah menjadi salah satu bahasa pemrograman yang paling banyak digunakan di seluruh dunia.\n" +
                        "\n" +
                        "Java memiliki sejumlah pengguna yang sangat besar, dengan jutaan pengembang yang menggunakan bahasa ini untuk membuat berbagai jenis aplikasi, mulai dari perangkat lunak desktop hingga aplikasi web dan perangkat mobile. Keberhasilan Java dapat dilihat dari fakta bahwa banyak perusahaan besar dan situs web terkemuka menggunakan teknologi Java dalam infrastruktur mereka.\n" +
                        "\n" +
                        "Salah satu keunggulan utama Java adalah kemampuannya untuk berjalan di berbagai platform. Hal ini dimungkinkan berkat penggunaan mesin virtual Java (Java Virtual Machine atau JVM), yang memungkinkan kode Java untuk dieksekusi di berbagai sistem operasi tanpa perlu mengubah kode sumbernya. Platform yang didukung oleh Java termasuk Windows, macOS, Linux, dan banyak sistem operasi lainnya.\n" +
                        "\n" +
                        "Java termasuk dalam kategori bahasa pemrograman teratas karena sejumlah alasan. Pertama, Java memiliki sintaksis yang mudah dipahami, sehingga cocok untuk pemula. Kedua, Java menawarkan keamanan tinggi, yang sangat penting dalam pengembangan aplikasi yang memproses data sensitif. Selain itu, Java juga memiliki dukungan komunitas yang besar, banyaknya library dan framework yang tersedia, serta performa yang baik.\n" +
                        "\n" +
                        "Pengaplikasian Java sangat luas. Anda dapat menemukan aplikasi Java di berbagai tempat, seperti perangkat lunak perbankan, perangkat lunak manufaktur, permainan video, aplikasi web, perangkat mobile, sistem keamanan, dan banyak lagi. Bahkan, platform Android juga menggunakan Java sebagai salah satu bahasa pemrograman utama, menjadikannya pilihan yang sangat relevan dalam pengembangan aplikasi mobile."
            ),
            Language(
                R.drawable.cpp,
                "C++",
                "C++ adalah salah satu bahasa pemrograman yang sangat populer dan memiliki sejarah yang kaya. Bahasa ini pertama kali dirilis pada tahun 1983 oleh Bjarne Stroustrup sebagai perluasan dari bahasa pemrograman C. Dengan tambahan fitur-fitur baru seperti pemrograman berorientasi objek, C++ menjadi salah satu bahasa yang sangat kuat dan serbaguna dalam pengembangan perangkat lunak.\n" +
                        "\n" +
                        "C++ telah menjadi salah satu bahasa pemrograman yang banyak digunakan di seluruh dunia. Meskipun tidak ada statistik yang pasti mengenai jumlah pengguna, tetapi sejak pertama kali dirilis, C++ telah menjadi salah satu bahasa yang paling banyak digunakan dalam pengembangan perangkat lunak dan memiliki komunitas pengembang yang besar.\n" +
                        "\n" +
                        "Salah satu kekuatan utama C++ adalah kemampuannya untuk digunakan di berbagai platform. Bahasa ini dapat digunakan untuk mengembangkan perangkat lunak untuk sistem operasi Windows, Linux, macOS, dan banyak platform lainnya. Selain itu, C++ juga mendukung pengembangan perangkat lunak berbasis perangkat embedded, seperti sistem operasi untuk mikrokontroler.\n" +
                        "\n" +
                        "C++ termasuk dalam daftar top programming language karena berbagai alasan. Pertama, C++ memiliki performa yang sangat tinggi dan memungkinkan pengembang untuk mengoptimalkan kode mereka hingga tingkat yang sangat detail. Kedua, C++ mendukung pemrograman berorientasi objek, yang memungkinkan pengembangan perangkat lunak yang lebih terstruktur dan mudah dipelihara. Ketiga, C++ memiliki berbagai pustaka standar yang kaya, seperti STL (Standard Template Library), yang menyediakan berbagai alat untuk pengembangan perangkat lunak.\n" +
                        "\n" +
                        "Pengaplikasian C++ sangat luas. Bahasa ini digunakan dalam pengembangan perangkat lunak desktop, aplikasi mobile, permainan komputer, sistem embedded, perangkat keras, dan bahkan dalam pengembangan perangkat lunak tingkat rendah seperti driver perangkat keras. Banyak perusahaan besar juga menggunakan C++ untuk mengembangkan perangkat lunak mereka, sehingga membuat C++ tetap menjadi salah satu bahasa yang paling penting dalam dunia pemrograman."
            ),
            Language(
                R.drawable.c,
                "C",
                "Bahasa pemrograman C adalah salah satu bahasa pemrograman yang sangat penting dan telah memiliki sejarah panjang dalam dunia teknologi. Bahasa ini pertama kali dikembangkan pada awal tahun 1970-an oleh Dennis Ritchie di laboratorium Bell Telephone Laboratories. C adalah bahasa pemrograman yang tingkatannya rendah (low-level), artinya, ia memberikan kontrol yang tinggi terhadap perangkat keras komputer. Keunikan C terletak pada sintaksisnya yang sederhana dan kemampuannya untuk melakukan pemrograman yang efisien.\n" +
                        "\n" +
                        "C dirilis pada tahun 1972, dan sejak itu telah menjadi salah satu bahasa pemrograman paling populer di dunia. Meskipun telah ada berbagai versi dan bahasa pemrograman lain yang muncul seiring waktu, C tetap menjadi salah satu bahasa yang paling banyak digunakan.\n" +
                        "\n" +
                        "Jumlah pengguna C sangat besar dan tersebar di seluruh dunia. Para pengembang perangkat lunak, insinyur, dan ilmuwan komputer sering menggunakan bahasa ini dalam pengembangan sistem operasi, perangkat embedded, dan aplikasi yang memerlukan kecepatan dan efisiensi tinggi.\n" +
                        "\n" +
                        "C mendukung berbagai platform, termasuk sistem operasi seperti Windows, Linux, dan macOS. Keberagaman platform yang didukung oleh C membuatnya sangat fleksibel dan sesuai digunakan dalam berbagai lingkungan pengembangan.\n" +
                        "\n" +
                        "Salah satu alasan mengapa C termasuk dalam daftar bahasa pemrograman teratas adalah karena efisiensinya. Bahasa ini memberikan kontrol yang lebih besar kepada pengembang dalam mengelola sumber daya perangkat keras dan memungkinkan mereka untuk mengoptimalkan kinerja program. C juga memiliki komunitas yang besar, banyak buku, tutorial, dan sumber daya lain yang dapat membantu pemula untuk mahir dalam bahasa ini.\n" +
                        "\n" +
                        "Pengaplikasian C sangat luas. Selain digunakan dalam pengembangan sistem operasi seperti Linux dan Windows, bahasa ini juga digunakan dalam perangkat embedded seperti mikrokontroler, perangkat keras (hardware) seperti driver perangkat, aplikasi yang memerlukan kecepatan tinggi seperti game, serta dalam pemrograman jaringan dan keamanan komputer. Bahasa C menjadi fondasi bagi bahasa pemrograman lain seperti C++ dan C#, sehingga pemahaman yang baik tentang C dapat menjadi dasar yang kuat dalam karir pemrograman."
            ),
            Language(
                R.drawable.javascript,
                "Javascript",
                "JavaScript adalah bahasa pemrograman yang sering digunakan untuk mengembangkan aplikasi web interaktif. Ini adalah salah satu dari tiga teknologi utama yang digunakan untuk membangun situs web, bersama dengan HTML (Hypertext Markup Language) untuk struktur dan CSS (Cascading Style Sheets) untuk tampilan. JavaScript memungkinkan pengembang untuk menambahkan fungsi interaktif, responsif, dan dinamis ke halaman web, sehingga pengguna dapat berinteraksi dengan situs tersebut.\n" +
                        "\n" +
                        "JavaScript pertama kali dirilis oleh Netscape Communications Corporation pada tahun 1995. Ini telah mengalami sejumlah perubahan dan pembaruan selama bertahun-tahun, dengan versi terbaru yang dirilis secara berkala untuk meningkatkan kinerja dan fungsionalitasnya.\n" +
                        "\n" +
                        "Jumlah pengguna JavaScript sangat besar dan terus bertumbuh. Ini adalah salah satu bahasa pemrograman paling populer di dunia, digunakan oleh jutaan pengembang web di seluruh dunia. Kehadirannya yang kuat dalam pengembangan web modern membuatnya menjadi salah satu bahasa yang paling dicari oleh pengembang.\n" +
                        "\n" +
                        "JavaScript didukung oleh berbagai platform dan browser web utama seperti Chrome, Firefox, Safari, dan Edge. Ini membuatnya sangat fleksibel dan dapat digunakan di berbagai lingkungan pengembangan.\n" +
                        "\n" +
                        "Salah satu alasan mengapa JavaScript termasuk dalam daftar bahasa pemrograman paling populer adalah karena fleksibilitasnya dan berbagai pustaka dan kerangka kerja yang tersedia untuk pengembangan. Ini juga memiliki komunitas yang besar dan aktif yang terus berkontribusi pada ekosistemnya.\n" +
                        "\n" +
                        "Pengaplikasian JavaScript sangat beragam. Ini digunakan untuk mengembangkan berbagai jenis aplikasi, termasuk aplikasi web, aplikasi seluler, permainan, aplikasi server, dan banyak lagi. JavaScript juga digunakan untuk mengembangkan berbagai teknologi baru seperti Internet of Things (IoT) dan Augmented Reality (AR). Dengan kemampuan lintas platformnya, JavaScript menjadi bahasa yang sangat relevan dan penting dalam dunia pengembangan perangkat lunak modern."
            ),
            Language(
                R.drawable.csharp,
                "C#",
                "C# (dibaca \"C sharp\") adalah sebuah bahasa pemrograman yang dikembangkan oleh Microsoft. Bahasa ini pertama kali diperkenalkan pada tahun 2000 sebagai bagian dari platform pengembangan perangkat lunak .NET. Sejak itu, C# telah menjadi salah satu bahasa pemrograman yang paling populer di dunia.\n" +
                        "\n" +
                        "C# pertama kali dirilis pada tahun 2000 sebagai bagian dari Microsoft Visual Studio.NET. Sejak itu, bahasa ini telah mengalami beberapa pembaruan signifikan, dengan versi terbaru pada saat pengetikan ini adalah C# 9.0, yang dirilis pada tahun 2020.\n" +
                        "\n" +
                        "Jumlah pengguna C# terus meningkat seiring dengan popularitas platform .NET. Saat ini, C# digunakan oleh ribuan perusahaan di seluruh dunia, termasuk banyak perusahaan teknologi terkemuka seperti Microsoft, Amazon, dan Adobe. Bahasa ini juga digunakan oleh banyak pengembang independen dan komunitas open source.\n" +
                        "\n" +
                        "C# dapat digunakan untuk mengembangkan berbagai jenis perangkat lunak, mulai dari aplikasi desktop hingga aplikasi web dan perangkat lunak berbasis cloud. Bahasa ini juga sangat populer dalam pengembangan permainan dengan menggunakan platform seperti Unity. Keberhasilan C# sebagai bahasa pemrograman terkemuka disebabkan oleh berbagai faktor, termasuk dukungan yang kuat dari Microsoft, kemampuan bahasa yang kuat dan modern, serta komunitas pengembang yang besar dan aktif.\n" +
                        "\n" +
                        "Pengaplikasian C# dapat ditemukan di berbagai sektor industri, termasuk pengembangan perangkat lunak perusahaan, permainan, aplikasi seluler, aplikasi web, aplikasi desktop, dan bahkan dalam pengembangan Internet of Things (IoT). Karena fleksibilitasnya, C# menjadi pilihan yang kuat untuk banyak proyek pengembangan perangkat lunak yang beragam dan menuntut."
            ),
            Language(
                R.drawable.sql,
                "SQL",
                "SQL, singkatan dari Structured Query Language, adalah bahasa pemrograman yang digunakan untuk mengelola dan mengakses basis data relasional. SQL dirancang untuk melakukan berbagai tugas terkait basis data, seperti pengambilan data, pembaruan, penghapusan, dan pengelolaan skema basis data. Bahasa ini memungkinkan pengguna untuk berinteraksi dengan sistem basis data secara efisien dengan menggunakan perintah-perintah yang terstruktur.\n" +
                        "\n" +
                        "SQL pertama kali dirilis pada tahun 1974 oleh IBM. Sejak itu, telah ada beberapa revisi dan perbaikan dalam bahasa ini. Salah satu versi yang paling umum digunakan adalah SQL-92, yang menjadi dasar bagi banyak implementasi SQL saat ini.\n" +
                        "\n" +
                        "Jumlah pengguna SQL sangat besar dan tersebar di seluruh dunia. Setiap organisasi yang menggunakan basis data relasional, mulai dari perusahaan besar hingga startup kecil, umumnya memanfaatkan SQL untuk mengelola dan mengakses data mereka. Ini mencakup sektor-sektor seperti keuangan, manufaktur, perbankan, kesehatan, pemerintahan, dan banyak lagi.\n" +
                        "\n" +
                        "SQL mendukung berbagai platform dan sistem basis data relasional. Beberapa sistem basis data populer yang mendukung SQL termasuk MySQL, PostgreSQL, Microsoft SQL Server, Oracle Database, dan SQLite. Ini membuat SQL menjadi bahasa universal yang dapat digunakan oleh berbagai platform, memungkinkan portabilitas aplikasi antara sistem basis data yang berbeda.\n" +
                        "\n" +
                        "SQL termasuk dalam daftar bahasa pemrograman teratas karena perannya yang krusial dalam pengelolaan dan akses data. Data adalah aset berharga dalam bisnis modern, dan SQL menyediakan alat yang kuat untuk mengelola, menganalisis, dan memanfaatkan data tersebut. Kemampuan SQL untuk menjalankan operasi kompleks terhadap basis data dengan cepat dan efisien membuatnya sangat diminati oleh pengembang perangkat lunak dan profesional IT.\n" +
                        "\n" +
                        "Pengaplikasian SQL sangat luas, dan ini digunakan di berbagai bidang. Contohnya termasuk:\n" +
                        "\n" +
                        "1. Aplikasi Bisnis: SQL digunakan dalam sistem manajemen penjualan, sistem manajemen inventaris, dan aplikasi bisnis lainnya untuk mengelola data transaksi dan operasional.\n" +
                        "\n" +
                        "2. Analisis Data: SQL memungkinkan para analis data untuk mengekstrak, memanipulasi, dan menganalisis data dari basis data untuk mendapatkan wawasan bisnis yang berharga.\n" +
                        "\n" +
                        "3. Aplikasi Web: Banyak situs web dan aplikasi web menggunakan SQL untuk menyimpan dan mengambil informasi pengguna, seperti profil, pesanan, dan komentar.\n" +
                        "\n" +
                        "4. Sistem Pemerintahan: SQL digunakan dalam sistem pemerintahan untuk mengelola data terkait pajak, pendidikan, kesehatan, dan lainnya.\n" +
                        "\n" +
                        "5. Sistem Keuangan: Industri keuangan menggunakan SQL untuk mengelola data perbankan, transaksi kartu kredit, dan analisis risiko.\n" +
                        "\n" +
                        "Dalam semua konteks ini, SQL adalah alat yang kuat untuk mengelola dan mengakses data, dan kontribusinya terhadap dunia teknologi informasi sangat signifikan."
            ),
            Language(
                R.drawable.go,
                "GO",
                "Go, yang juga dikenal sebagai Golang, adalah bahasa pemrograman yang relatif baru yang dikembangkan oleh Google. Bahasa ini pertama kali diperkenalkan pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Meskipun Go belum memiliki jumlah pengguna sebanyak bahasa pemrograman yang lebih mapan seperti Python atau Java, ia telah menarik perhatian dan mendapatkan popularitas yang cukup signifikan dalam komunitas pengembangan perangkat lunak.\n" +
                        "\n" +
                        "Salah satu alasan utama mengapa Go termasuk dalam daftar top programming language adalah karena desainnya yang fokus pada efisiensi, keamanan, dan kesederhanaan. Bahasa ini didesain untuk memudahkan pengembangan perangkat lunak yang bersih, cepat, dan skalabel. Go juga menawarkan fitur-fitur seperti manajemen memori otomatis dan dukungan untuk konkurensi yang memungkinkan pengembang untuk membuat program yang dapat mengatasi tugas-tugas paralel dengan mudah.\n" +
                        "\n" +
                        "Pengaplikasian Go sangat beragam. Bahasa ini sering digunakan dalam pengembangan perangkat lunak infrastruktur, seperti server web, database, dan alat-alat pengelolaan kontainer seperti Docker dan Kubernetes. Go juga menjadi pilihan populer untuk pengembangan perangkat lunak berkinerja tinggi, serta dalam pembuatan aplikasi cloud-native yang skalabel. Dengan berbagai keunggulannya, Go semakin mendapatkan perhatian di berbagai industri, termasuk teknologi, finansial, dan e-commerce, di mana kecepatan, skalabilitas, dan keamanan sangat penting. Platform yang didukung oleh Go termasuk Windows, macOS, Linux, dan berbagai arsitektur lainnya, sehingga memungkinkan pengembang untuk mengeksekusi kode Go di berbagai lingkungan."
            ),
            Language(
                R.drawable.typescript,
                "Typescript",
                "TypeScript adalah sebuah bahasa pemrograman yang memperluas JavaScript dengan menambahkan dukungan untuk tipe data statis. Ini berarti bahwa TypeScript memungkinkan pengembang untuk mendeklarasikan tipe data variabel, parameter fungsi, properti objek, dan banyak lagi sebelum kode dieksekusi. Dengan kata lain, TypeScript membantu mencegah kesalahan tipe data dan meningkatkan keamanan dan kualitas kode.\n" +
                        "\n" +
                        "TypeScript pertama kali dirilis oleh Microsoft pada tahun 2012. Sejak itu, bahasa ini telah mengalami pertumbuhan yang pesat dan menjadi sangat populer di kalangan pengembang perangkat lunak. Saat ini, TypeScript memiliki jutaan pengguna aktif di seluruh dunia.\n" +
                        "\n" +
                        "TypeScript mendukung berbagai platform, termasuk Windows, macOS, dan Linux. Ini juga kompatibel dengan berbagai lingkungan pengembangan seperti Visual Studio Code, WebStorm, dan banyak lagi. Dengan dukungan komunitas yang kuat, TypeScript dapat digunakan untuk mengembangkan aplikasi web, aplikasi seluler, perangkat lunak server, dan bahkan aplikasi desktop.\n" +
                        "\n" +
                        "TypeScript termasuk dalam daftar bahasa pemrograman teratas karena beberapa alasan. Pertama, ia memberikan keamanan tambahan dan kualitas kode yang lebih baik berkat tipe data statisnya. Kedua, TypeScript mengintegrasikan fitur-fitur terbaru JavaScript, sehingga pengembang dapat memanfaatkan kemajuan terbaru dalam bahasa tersebut. Terakhir, komunitas pengguna TypeScript yang besar terus mengembangkan ekosistem alat dan pustaka, membuatnya semakin mudah digunakan dalam proyek-proyek besar dan kecil.\n" +
                        "\n" +
                        "Pengaplikasian TypeScript sangat luas. Ini dapat digunakan untuk mengembangkan berbagai jenis aplikasi, termasuk aplikasi web dengan bantuan kerangka kerja seperti Angular, React, atau Vue.js. TypeScript juga cocok untuk pengembangan aplikasi seluler menggunakan platform seperti React Native. Selain itu, TypeScript juga dapat digunakan untuk mengembangkan perangkat lunak server dengan Node.js atau bahkan untuk pengembangan aplikasi desktop dengan Electron. Dengan kata lain, TypeScript adalah alat yang serbaguna dan dapat digunakan dalam berbagai proyek pengembangan perangkat lunak."
            ),
            Language(
                R.drawable.html,
                "HTML",
                "HTML, singkatan dari HyperText Markup Language, adalah bahasa markah yang digunakan untuk membuat dan merancang halaman web. HTML memungkinkan pengembang web untuk menentukan struktur dan konten sebuah halaman web dengan menggunakan elemen-elemen markup seperti tag, atribut, dan teks. Ini adalah bahasa yang mendasari untuk membangun hampir semua situs web yang ada di internet saat ini.\n" +
                        "\n" +
                        "HTML pertama kali diperkenalkan pada tahun 1993 oleh Tim Berners-Lee, pendiri World Wide Web. Versi pertama HTML, HTML 1.0, sangat sederhana dan terbatas. Namun, seiring berjalannya waktu, HTML telah mengalami sejumlah pembaruan dan pengembangan, yang menghasilkan versi-versi yang lebih canggih seperti HTML5, yang diperkenalkan pada tahun 2014.\n" +
                        "\n" +
                        "HTML adalah salah satu bahasa pemrograman paling populer di dunia. Jutaan pengembang web di seluruh dunia menggunakannya secara aktif untuk membuat dan mengelola situs web. Keunggulan utama HTML adalah kemampuannya yang inklusif, karena dapat digunakan dengan mudah dengan bahasa pemrograman dan teknologi web lainnya seperti CSS (Cascading Style Sheets) dan JavaScript. Selain itu, HTML didukung oleh hampir semua platform web modern, termasuk berbagai jenis peramban web seperti Google Chrome, Mozilla Firefox, Microsoft Edge, dan lain-lain.\n" +
                        "\n" +
                        "Alasan mengapa HTML termasuk dalam bahasa pemrograman teratas adalah karena perannya yang krusial dalam pengembangan web. Tanpa HTML, tidak mungkin untuk membuat halaman web yang dapat diakses dan diinterpretasikan oleh peramban web. Selain itu, HTML terus berkembang dengan adanya spesifikasi terbaru, seperti HTML5, yang memperkenalkan banyak fitur canggih untuk membuat pengalaman web yang lebih interaktif dan kaya.\n" +
                        "\n" +
                        "Pengaplikasian HTML sangat luas dan umumnya digunakan di seluruh dunia. Hal ini digunakan untuk membuat berbagai jenis situs web, mulai dari blog pribadi, situs web bisnis, hingga situs web e-commerce yang kompleks. Selain itu, HTML juga digunakan dalam pengembangan aplikasi web berbasis seluler dan responsif yang dapat diakses dari berbagai perangkat, termasuk komputer desktop, tablet, dan ponsel cerdas. Dengan demikian, HTML tetap menjadi bahasa yang sangat penting dan relevan dalam dunia pengembangan web modern."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_language)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LanguageAdapter(this, languageList){
            val intent = Intent (this,DetailLanguageActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_page -> {
                val Intent = Intent(this, AboutActivity::class.java)
                startActivity(Intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}