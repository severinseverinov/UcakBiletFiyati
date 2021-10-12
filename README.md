# Uçak Bilet Fiyatı Hesaplama

## Java Kodları ile girilen bilgilere göre bilet fiyatı hesaplayan program.

Kullanıcıdan Mesafe (KM), yaşı ve 
yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alınır, 
mesafe başına ücret 0,10 TL / km olarak alınır. 
İlk olarak uçuşun toplam fiyatını hesaplanır ve 
sonrasında ki koşullara göre müşteriye aşağıdaki 
indirimleri uygulanır ;

* Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilir.

* Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

* Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

* Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

* Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.