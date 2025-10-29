Percobaan 1: Review Perulangan 1
Pertanyaan dan Jawaban:

1. Jika pada perulangan for, inisialisasi i = 1 diubah menjadi i = 0, apa akibatnya? Mengapa bisa demikian?
Jawaban:
Program akan mencetak N+1 buah bintang.
Karena perulangan dimulai dari 0, maka iterasi akan berjalan dari 0 sampai N (total N+1 kali).
Contoh: Jika N=5, maka bintang dicetak 6 kali (i = 0, 1, 2, 3, 4, 5).

2. Jika kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa bisa demikian?
Jawaban:
Program tidak akan mencetak apa pun.
Karena pada awal perulangan i = 1, kondisi 1 > N (misal 1 > 5) bernilai false, sehingga perulangan tidak dijalankan.

3. Jika step i++ diubah menjadi i--, apa akibatnya? Mengapa bisa demikian?
Jawaban:
Program akan berjalan tanpa henti (infinite loop).
Karena i akan terus berkurang dari 1 menjadi 0, -1, -2, dan seterusnya, tidak pernah memenuhi kondisi i <= N untuk berhenti.

Percobaan 2: Bintang Persegi
Pertanyaan dan Jawaban:

1. Jika pada perulangan luar (iOuter=1) diubah menjadi iOuter=0, apa akibatnya?
Jawaban:
Hasilnya akan menjadi 6 baris bintang (jika N=5).
Karena perulangan berjalan dari 0 hingga 5, totalnya 6 kali.

2. Jika pada perulangan dalam (i=1) diubah menjadi i=0, apa akibatnya?
Jawaban:
Setiap baris akan berisi 6 bintang, karena perulangan berjalan dari 0 sampai 5.

3. Apa perbedaan kegunaan antara perulangan luar dengan perulangan dalam?
Jawaban:

Perulangan luar mengatur jumlah baris (vertikal).

Perulangan dalam mengatur jumlah kolom atau isi dalam tiap baris (horizontal).

4. Mengapa perlu ditambahkan System.out.println(); di bawah perulangan dalam? Apa akibatnya jika dihilangkan?
Jawaban:
Baris System.out.println(); berfungsi untuk pindah ke baris baru setelah mencetak satu baris bintang.
Jika dihapus, semua bintang akan tercetak dalam satu baris panjang tanpa baris baru.

Percobaan 3: Bintang Segitiga

Kode awal di jobsheet memiliki kesalahan pada perulangan, karena belum ada println() untuk pindah baris.

Pertanyaan dan Jawaban:

1. Apakah output dengan nilai N=5 sesuai dengan tampilan segitiga?
Jawaban:
Tidak, outputnya tidak sesuai karena bintang tidak berpindah ke baris baru.

2. Bagian mana yang perlu diperbaiki dan ditambahkan? Jelaskan.
Jawaban:
Perlu menambahkan System.out.println(); di dalam perulangan luar (setelah perulangan dalam) agar setiap baris selesai, kursor pindah ke baris berikutnya.
Selain itu, perulangan while(i <= N) sebaiknya diganti menjadi while(i < N) agar tinggi segitiga sesuai nilai N