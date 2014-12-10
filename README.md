# Persiapan NFC Development #

* Tag Reader : ACS ACR-122U
* Ubuntu Package : `sudo apt-get install -y libnfc-bin libccid pcscd libpcsclite-dev libpcsclite1`


# Sample Code #

Cara menjalankan aplikasi : 

* Maven

        mvn clean package exec:java -Dexec.mainClass=<nama-class>


* Gradle

        gradle execute -PmainClass=<nama-class>
        
* Contoh : bila ingin menjalankan nama class `com.muhardin.endy.belajar.nfc.App`

        mvn clean package exec:java -Dexec.mainClass=com.muhardin.endy.belajar.nfc.App
        gradle execute -PmainClass=com.muhardin.endy.belajar.nfc.App

## App.java ##

* nama class : `com.muhardin.endy.belajar.nfc.App`
* fitur : 

    * mendeteksi tag reader
    * menunggu tag ditempelkan
    * membaca UID tag


# Referensi #

## Serba-serbi tag ##
* [Berbagai jenis tag](http://www.radio-electronics.com/info/wireless/nfc/near-field-communications-tags-types.php)
* [Kompatibilitas tag](http://www.andytags.com/nfc-tags-compatibility-issues.html#.VIgCLd_vanY)

## Contoh kode program ##
* [PC/SC Sample Java](http://ludovicrousseau.blogspot.com/2010/06/pcsc-sample-in-java.html)
* [Cara membaca Mifare Classic 1K](http://ieatbinary.com/2009/02/11/reading-mifare-1k-card-using-java-in-linux/)
* [Cara menulis NDEF](http://www.framentos.com/en/android-tutorial/2012/07/31/write-hello-world-into-a-nfc-tag-with-a/)

## Format Data ##

* [NDEF](http://developer.nokia.com/community/wiki/Understanding_NFC_Data_Exchange_Format_(NDEF)_messages)

# Debugging Apps #
* [NFC TagInfo](https://play.google.com/store/apps/details?id=at.mroland.android.apps.nfctaginfo&hl=en)
* [NFC Tools](https://github.com/grundid/nfctools-examples)
* [NFC TagWriter by NXP](https://play.google.com/store/apps/details?id=com.nxp.nfc.tagwriter&hl=en)
* [NFC TagInfo by NXP](https://play.google.com/store/apps/details?id=com.nxp.taginfolite&hl=en)

