package com.dicoding.picodiploma.infoplanet.model;

import com.dicoding.picodiploma.infoplanet.R;

import java.util.ArrayList;

public class PlanetsData {
    private static String[] planetNames = {
            "Matahari",
            "Merkurius",
            "Venus",
            "Bumi",
            "Mars",
            "Juptier",
            "Saturnus",
            "Uranus",
            "Neptunus",
            "Pluto"
    };

    private static String[] planetDetails = {
            "Matahari atau Surya adalah bintang di pusat Tata Surya. Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet.",
            "Merkurius adalah planet terkecil di dalam tata surya dan juga yang terdekat dengan Matahari dengan kala revolusi 88 hari dan kala rotasi 59 hari. Kecerahan planet ini berkisar di antara -2 sampai 5,5 dalam magnitudo tampak namun tidak mudah terlihat karena sudut pandangnya dengan Matahari kecil (dengan rentangan paling jauh sebesar 28,3 derajat. Merkurius hanya bisa terlihat pada saat subuh atau maghrib.",
            "Venus adalah planet terdekat kedua dari Matahari setelah Merkurius. Planet ini mengorbit Matahari selama 224,7 hari Bumi. Venus tidak memiliki satelit alami dan dinamai dari dewi cinta dan kecantikan dalam mitologi Romawi. Setelah Bulan, planet ini merupakan objek alami tercerah di langit malam, dengan magnitudo tampak Sebesar −4,6 yang cukup cerah untuk menghasilkan bayangan.",
            "Bumi adalah planet ketiga dari Matahari yang merupakan planet terpadat dan terbesar kelima dari delapan planet dalam Tata Surya. Bumi juga merupakan planet terbesar dari empat planet kebumian Tata Surya. Bumi terkadang disebut dengan dunia atau Planet Biru.",
            "Mars adalah planet terdekat keempat dari Matahari. Namanya diambil dari dewa perang Romawi, Mars. Planet ini sering dijuluki sebagai \"planet merah\" karena tampak dari jauh berwarna kemerah-kemerahan. Ini disebabkan oleh keberadaan besi(III) oksida di permukaan planet Mars.",
            "Jupiter adalah planet terdekat kelima dari Matahari setelah Merkurius, Venus, Bumi, dan Mars. Planet ini juga merupakan planet terbesar di Tata Surya. Jupiter merupakan raksasa gas dengan massa seperseribu massa Matahari dan dua setengah kali jumlah massa semua planet lain di Tata Surya. Planet ini dan raksasa gas lain di Tata Surya (yaitu Saturnus, Uranus, dan Neptunus) kadang-kadang disebut planet Jovian atau planet luar.",
            "Saturnus adalah sebuah planet di tata surya yang dikenal juga sebagai planet bercincin, dan merupakan planet terbesar kedua di tata surya setelah Jupiter. Jarak Saturnus sangat jauh dari Matahari, karena itulah Saturnus tampak tidak terlalu jelas dari Bumi. Saturnus berevolusi dalam waktu 29,46 tahun. Setiap 378 hari, Bumi, Saturnus dan Matahari akan berada dalam satu garis lurus. Selain berevolusi, Saturnus juga berotasi dalam waktu yang sangat singkat, yaitu 10 jam 40 menit 24 detik.",
            "Uranus (berasal dari nama Latin Ūranus untuk nama dewa Yunani Οὐρανός) adalah planet ketujuh dari Matahari. Uranus merupakan planet yang memiliki jari-jari terbesar ketiga sekaligus massa terbesar keempat di Tata Surya. Uranus juga merupakan satu-satunya planet yang namanya berasal dari tokoh dalam mitologi Yunani, dari versi Latinisasi nama dewa langit Yunani Ouranos. Komposisi Uranus serupa dengan Neptunus, dan keduanya mempunyai komposisi kimiawi yang berbeda dari raksasa gas yang lebih besar, Jupiter dan Saturnus. Karenanya, para astronom sering menempatkan Uranus dan Neptunus dalam kategori \"raksasa es\" untuk membedakan keduanya dari raksasa gas. ",
            "Neptunus merupakan planet terjauh (kedelapan) jika ditinjau dari Matahari. Planet ini dinamai dari dewa lautan Romawi. Neptunus merupakan planet terbesar keempat berdasarkan diameter (49.530 km) dan terbesar ketiga berdasarkan massa. Massa Neptunus tercatat 17 kali lebih besar daripada Bumi, dan sedikit lebih besar daripada Uranus.",
            "Pluto adalah planet katai di sabuk Kuiper dan objek trans-Neptunus pertama yang ditemukan. Pluto merupakan planet katai terbesar dan bermassa terbesar kedua di Tata Surya dan benda terbesar kesembilan dan bermassa terbesar kesepuluh yang mengorbit Matahari secara langsung. Pluto merupakan objek trans-Neptunus dengan volume terbesar dan massa yang sedikit lebih kecil daripada Eris, planet katai di piringan tersebar. Layaknya objek lain di sabuk Kuiper, Pluto terdiri dari batu dan es dan relatif kecil—kurang lebih seperenam massa Bulan dan sepertiga volume Bulan."
    };

    private static int[] planetImages = {
            R.drawable.matahari,
            R.drawable.merkurius,
            R.drawable.venus,
            R.drawable.bumi,
            R.drawable.mars,
            R.drawable.jupiter,
            R.drawable.saturnus,
            R.drawable.uranus,
            R.drawable.neptunus,
            R.drawable.pluto
    };

   public static ArrayList<Planet> getListData() {
        ArrayList<Planet> list = new ArrayList<>();
        for (int position = 0; position < planetNames.length; position++) {
            Planet planet = new Planet();
            planet.setName(planetNames[position]);
            planet.setDetail(planetDetails[position]);
            planet.setPhoto(planetImages[position]);
            list.add(planet);
        }
        return list;
    }
}
