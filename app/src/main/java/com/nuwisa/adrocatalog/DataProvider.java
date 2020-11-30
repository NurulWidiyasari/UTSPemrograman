package com.nuwisa.adrocatalog;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.nuwisa.adrocatalog.model.Oppo;
import com.nuwisa.adrocatalog.model.Vivo;
import com.nuwisa.adrocatalog.model.Hp;
import com.nuwisa.adrocatalog.model.Samsung;

public class DataProvider {
    private static List<Hp> hps = new ArrayList<>();

    private static List<Samsung> initDataSamsung(Context ctx) {
        List<Samsung> samsungs = new ArrayList<>();
        samsungs.add(new Samsung("Galaxi A11", "Android 10",
                "HP Samsung Galaxy A11 termasuk HP Samsung terbaru dan terbaik 2020 yang dirilis pada bulan Maret 2020. Harganya juga yang terbilang sangatlah terjangkau.HP Samsung Galaxy M11yang merupakan HP Samsung terbaru dan terbaik 2020 ini juga memiliki RAM yang cukup besar yaitu 3GB.", R.drawable.galaxi_a));
        samsungs.add(new Samsung("Galaxi S20 Series", "Android 11",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.galaxi_s));
        samsungs.add(new Samsung("Galaxi M21", "Android 10",
                "HP Samsung Galaxy M21 hadir pada bulan Maret 2020 dengan harga 2 jutaan dan Kapasitas baterai yang sangat besar.  Galaxy M21 menawarkan kualitas foto yang luar biasa baik, baterai yang besar, layar yang nyaman serta dapur pacu yang handal.", R.drawable.galaxi_m));
        samsungs.add(new Samsung("Galaxi Note 10", "Android Pie (9.0)",
                "Diluncurkan bersamaan dengan Galaxy Note 10, Galaxy Note 10+ menghadirkan sebuah ponsel dengan desain mewah dan dilengkapi kemampuan mumpuni. Mereka yang tak melupakan kesenangan mengambil foto di tengah kesibukan membaca bermacam email, mereka yang selalu menyempatkan menonton tayangan hiburan di sela-sela menyiapkan presentasi, akan senang sekali menggunakan Galaxy Note 10 Plus.", R.drawable.galaxi_note));
        samsungs.add(new Samsung("Galaxi Z flip", "Android 10",
                "Layarnya menggunakan kapasitif AMOLED yang memiliki ukuran yang cukup lebar yakni 6.7 inci. Chipsetnya juga menggunakan Snapdragon 855+ dan CPU octa core dengan kecepatan 2.95 Ghz.", R.drawable.galaxi_z));

        return samsungs;
    }

    private static List<Oppo> initDataOppo(Context ctx) {
        List<Oppo> oppos = new ArrayList<>();
        oppos.add(new Oppo("A9X", "Android 9.0 Pie",
                "Oppo A9X hadir dengan menyasar harga kelas menengah dengan tampilan bodi cantik yang tampak elegan. Meski ponsel ini dibuat untuk kelas menengah, tapi Oppo A9X menawarkan tampilan premium dan performa tahan banting untuk semua jenis tugas harian.", R.drawable.oppo_a));
        oppos.add(new Oppo("K3", "Android 9.0 Pie",
                "OPPO menawarkan smartphone K3 pada mereka yang masuk ke dalam pangsa pasar tersebut. OPPO memang membuat K3 untuk memiliki desain yang cantik, layar yang besar, dan menggunakan prosesor kencang dengan harga yang cukup terjangkau.", R.drawable.oppo_k));
        oppos.add(new Oppo("Find X", "Android Oreo 8.1 ColorOS 5.1",
                "OPPO Find X merupakan handphone HP dengan kapasitas 3730mAh dan layar 6.4\" yang dilengkapi dengan kamera belakang 16 + 20MP dengan tingkat densitas piksel sebesar 403ppi dan tampilan resolusi sebesar 1080 x 2340pixels. Dengan berat sebesar 186g, handphone HP ini memiliki prosesor Octa Core", R.drawable.oppo_find));
        oppos.add(new Oppo("Reno Z", "Android 9.0 Pie",
                "Oppo Reno Z datang dengan serangkaian fitur mumpuni. Smartphone Oppo terbaru ini sudah didukung fitur pengisian daya cepat, kamera canggih, ruang penyimpanan jumbo, baterai yang bisa diandalkan, layar cerah, dan desain keseluruhan yang cukup menggoda.", R.drawable.oppo_reno));
        oppos.add(new Oppo("OPPO A5s", "Android 8.1 Oreo",
                "OPPO A5s merupakan handphone HP dengan kapasitas 4230mAh dan layar 6.2\" yang dilengkapi dengan kamera belakang 13 + 2MP dengan tingkat densitas piksel sebesar 271ppi dan tampilan resolusi sebesar 720 x 1520pixels.", R.drawable.oppo_as));

        return oppos;
    }
    private static List<Vivo> initDataVivo(Context ctx) {
        List<Vivo> vivos = new ArrayList<>();
        vivos.add(new Vivo("S1 Pro", "Android 9 Pie",
                "S1 Pro. Ponsel dengan layar 6,38 inci ini sudah membawa spesifikasi yang cukup prima. Sebagai contohnya, ponsel ini menggunakan chipset Qualcomm SDM665 Snapdragon 665 (11 nm). Selain itu, vivo S1 Pro juga didukung dengan RAM 8 GB.", R.drawable.vivo_s));
        vivos.add(new Vivo("V20", "Android 10",
                "vivo V20 adalah salah satu ponsel mid-range terbaru vivo yang dirilis pada Oktober 2020. HP ini membawa sejumlah parameter yang bersaing, utamanya di sektor kamera. HP ini menawarkan kamera utama 64 MP dengan dua sensor tambahan 8 MP dan 2 MP. vivo membenamkan sensor besar di bagian depan yang hebat untuk swafoto maupun video selfie.", R.drawable.vivo_v));
        vivos.add(new Vivo("X50", "Android 10",
                "vivo X50 yang telah masuk secara resmi ke Indonesia. HP ini tersedia dalam satu varian, yaitu RAM 8 GB dengan ROM 256 GB serta satu pilihan warna, yaitu Alpha Grey.", R.drawable.vivo_x));
        vivos.add(new Vivo("Y50", "Android 10",
                "Vivo Y50 yang merupakan HP keluaran tahun 2020 tentu sudah mengusung beberapa fitur serta teknologi canggih. Berikut adalah beberapa kelebihan Vivo Y50 yang patut Anda pertimbangkan.", R.drawable.vivo_y));
        vivos.add(new Vivo("Z1 pro", "Android 9.0 Pie",
                "vivo Z1 Pro yang tidak kalah keren. Dilihat dari desainnya, HP ini memang tidak se-gonjreng vivo V17 Pro, tapi performanya bisa dibilang lebih baik.", R.drawable.z1_pro));

        return vivos;
    }

    private static void initAllHps(Context ctx) {
        hps.addAll(initDataSamsung(ctx));
        hps.addAll(initDataOppo(ctx));
        hps.addAll(initDataVivo(ctx));
    }

    public static List<Hp> getAllHewan(Context ctx) {
        if (hps.size() == 0) {
            initAllHps(ctx);
        }
        return  hps;
    }

    public static List<Hp> getHpsByTipe(Context ctx, String jenis) {
        List<Hp> hpsByType = new ArrayList<>();
        if (hps.size() == 0) {
            initAllHps(ctx);
        }
        for (Hp h : hps) {
            if (h.getJenis().equals(jenis)) {
                hpsByType.add(h);
            }
        }
        return hpsByType;
    }

}