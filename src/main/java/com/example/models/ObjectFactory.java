//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.06 at 11:26:52 PM CET 
//


package com.example.models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.models package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdKnt_QNAME = new QName("http://www.kedi", "id-knt");
    private final static QName _Opis_QNAME = new QName("http://www.kedi", "opis");
    private final static QName _Seria_QNAME = new QName("http://www.kedi", "seria");
    private final static QName _CzyDuplikat_QNAME = new QName("http://www.kedi", "czy-duplikat");
    private final static QName _WartoscVat_QNAME = new QName("http://www.kedi", "wartosc-vat");
    private final static QName _IdZamowienia_QNAME = new QName("http://www.kedi", "id-zamowienia");
    private final static QName _NrFaktury_QNAME = new QName("http://www.kedi", "nr-faktury");
    private final static QName _WytworcaNazwa_QNAME = new QName("http://www.kedi", "wytworca-nazwa");
    private final static QName _WartoscBruttoSlownie_QNAME = new QName("http://www.kedi", "wartosc-brutto-slownie");
    private final static QName _Zezwolenie_QNAME = new QName("http://www.kedi", "zezwolenie");
    private final static QName _PodmiotOdpowiedzialnyKraj_QNAME = new QName("http://www.kedi", "podmiot-odpowiedzialny-kraj");
    private final static QName _TypFaktury_QNAME = new QName("http://www.kedi", "typ-faktury");
    private final static QName _IdKntKs_QNAME = new QName("http://www.kedi", "id-knt-ks");
    private final static QName _KodKreskowy_QNAME = new QName("http://www.kedi", "kod-kreskowy");
    private final static QName _BankNazwa_QNAME = new QName("http://www.kedi", "bank-nazwa");
    private final static QName _Kraj_QNAME = new QName("http://www.kedi", "kraj");
    private final static QName _Konta_QNAME = new QName("http://www.kedi", "konta");
    private final static QName _IdKntSprzedawcy_QNAME = new QName("http://www.kedi", "id-knt-sprzedawcy");
    private final static QName _DataUtworzenia_QNAME = new QName("http://www.kedi", "data-utworzenia");
    private final static QName _NrRezerwacji_QNAME = new QName("http://www.kedi", "nr-rezerwacji");
    private final static QName _Email_QNAME = new QName("http://www.kedi", "email");
    private final static QName _RodzajCeny_QNAME = new QName("http://www.kedi", "rodzaj-ceny");
    private final static QName _DataWaznosci_QNAME = new QName("http://www.kedi", "data-waznosci");
    private final static QName _Dawka_QNAME = new QName("http://www.kedi", "dawka");
    private final static QName _JednostkaMiary_QNAME = new QName("http://www.kedi", "jednostka-miary");
    private final static QName _IdTowaruKs_QNAME = new QName("http://www.kedi", "id-towaru-ks");
    private final static QName _Wersja_QNAME = new QName("http://www.kedi", "wersja");
    private final static QName _IdPozZamowienia_QNAME = new QName("http://www.kedi", "id-poz-zamowienia");
    private final static QName _KodPocztowy_QNAME = new QName("http://www.kedi", "kod-pocztowy");
    private final static QName _Pkwiu_QNAME = new QName("http://www.kedi", "pkwiu");
    private final static QName _PodmiotOdpowiedzialnyNazwa_QNAME = new QName("http://www.kedi", "podmiot-odpowiedzialny-nazwa");
    private final static QName _NrPozFaktury_QNAME = new QName("http://www.kedi", "nr-poz-faktury");
    private final static QName _CzyKorekta_QNAME = new QName("http://www.kedi", "czy-korekta");
    private final static QName _CenaNetto_QNAME = new QName("http://www.kedi", "cena-netto");
    private final static QName _Gid_QNAME = new QName("http://www.kedi", "gid");
    private final static QName _NrDomu_QNAME = new QName("http://www.kedi", "nr-domu");
    private final static QName _WartoscNetto_QNAME = new QName("http://www.kedi", "wartosc-netto");
    private final static QName _IdKntNabywcy_QNAME = new QName("http://www.kedi", "id-knt-nabywcy");
    private final static QName _Upust_QNAME = new QName("http://www.kedi", "upust");
    private final static QName _IdTowaru_QNAME = new QName("http://www.kedi", "id-towaru");
    private final static QName _BankNrKonta_QNAME = new QName("http://www.kedi", "bank-nr-konta");
    private final static QName _FormaPlatnosci_QNAME = new QName("http://www.kedi", "forma-platnosci");
    private final static QName _Postac_QNAME = new QName("http://www.kedi", "postac");
    private final static QName _UpustKwota_QNAME = new QName("http://www.kedi", "upust-kwota");
    private final static QName _Ulica_QNAME = new QName("http://www.kedi", "ulica");
    private final static QName _CenaBrutto_QNAME = new QName("http://www.kedi", "cena-brutto");
    private final static QName _DataSprzedazy_QNAME = new QName("http://www.kedi", "data-sprzedazy");
    private final static QName _NrLokalu_QNAME = new QName("http://www.kedi", "nr-lokalu");
    private final static QName _IdFaktury_QNAME = new QName("http://www.kedi", "id-faktury");
    private final static QName _DataWystawienia_QNAME = new QName("http://www.kedi", "data-wystawienia");
    private final static QName _IdPozFaktury_QNAME = new QName("http://www.kedi", "id-poz-faktury");
    private final static QName _CenaNettoBu_QNAME = new QName("http://www.kedi", "cena-netto-bu");
    private final static QName _Fax_QNAME = new QName("http://www.kedi", "fax");
    private final static QName _StawkaVat_QNAME = new QName("http://www.kedi", "stawka-vat");
    private final static QName _WartoscBrutto_QNAME = new QName("http://www.kedi", "wartosc-brutto");
    private final static QName _Telefon_QNAME = new QName("http://www.kedi", "telefon");
    private final static QName _WartoscVatBu_QNAME = new QName("http://www.kedi", "wartosc-vat-bu");
    private final static QName _Nip_QNAME = new QName("http://www.kedi", "nip");
    private final static QName _Miejscowosc_QNAME = new QName("http://www.kedi", "miejscowosc");
    private final static QName _CenaBruttoBu_QNAME = new QName("http://www.kedi", "cena-brutto-bu");
    private final static QName _CenaDetalBrutto_QNAME = new QName("http://www.kedi", "cena-detal-brutto");
    private final static QName _Uwagi_QNAME = new QName("http://www.kedi", "uwagi");
    private final static QName _TerminPlatnosci_QNAME = new QName("http://www.kedi", "termin-platnosci");
    private final static QName _Nazwa_QNAME = new QName("http://www.kedi", "nazwa");
    private final static QName _Copyright_QNAME = new QName("http://www.kedi", "copyright");
    private final static QName _LiczbaPoz_QNAME = new QName("http://www.kedi", "liczba-poz");
    private final static QName _Regon_QNAME = new QName("http://www.kedi", "regon");
    private final static QName _Ilosc_QNAME = new QName("http://www.kedi", "ilosc");
    private final static QName _WytworcaKraj_QNAME = new QName("http://www.kedi", "wytworca-kraj");
    private final static QName _Opakowanie_QNAME = new QName("http://www.kedi", "opakowanie");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Naglowek }
     * 
     */
    public Naglowek createNaglowek() {
        return new Naglowek();
    }

    /**
     * Create an instance of {@link ZrodloPozFaktury }
     * 
     */
    public ZrodloPozFaktury createZrodloPozFaktury() {
        return new ZrodloPozFaktury();
    }

    /**
     * Create an instance of {@link Pozycja }
     * 
     */
    public Pozycja createPozycja() {
        return new Pozycja();
    }

    /**
     * Create an instance of {@link ZrodlaPozFaktury }
     * 
     */
    public ZrodlaPozFaktury createZrodlaPozFaktury() {
        return new ZrodlaPozFaktury();
    }

    /**
     * Create an instance of {@link Towar }
     * 
     */
    public Towar createTowar() {
        return new Towar();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link Stawka }
     * 
     */
    public Stawka createStawka() {
        return new Stawka();
    }

    /**
     * Create an instance of {@link Dokumenty }
     * 
     */
    public Dokumenty createDokumenty() {
        return new Dokumenty();
    }

    /**
     * Create an instance of {@link Kontrahenci }
     * 
     */
    public Kontrahenci createKontrahenci() {
        return new Kontrahenci();
    }

    /**
     * Create an instance of {@link Kontrahent }
     * 
     */
    public Kontrahent createKontrahent() {
        return new Kontrahent();
    }

    /**
     * Create an instance of {@link Towary }
     * 
     */
    public Towary createTowary() {
        return new Towary();
    }

    /**
     * Create an instance of {@link Faktury }
     * 
     */
    public Faktury createFaktury() {
        return new Faktury();
    }

    /**
     * Create an instance of {@link Faktura }
     * 
     */
    public Faktura createFaktura() {
        return new Faktura();
    }

    /**
     * Create an instance of {@link Pozycje }
     * 
     */
    public Pozycje createPozycje() {
        return new Pozycje();
    }

    /**
     * Create an instance of {@link Podsumowanie }
     * 
     */
    public Podsumowanie createPodsumowanie() {
        return new Podsumowanie();
    }

    /**
     * Create an instance of {@link Stawki }
     * 
     */
    public Stawki createStawki() {
        return new Stawki();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-knt")
    public JAXBElement<Short> createIdKnt(Short value) {
        return new JAXBElement<Short>(_IdKnt_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "opis")
    public JAXBElement<String> createOpis(String value) {
        return new JAXBElement<String>(_Opis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "seria")
    public JAXBElement<String> createSeria(String value) {
        return new JAXBElement<String>(_Seria_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "czy-duplikat")
    public JAXBElement<String> createCzyDuplikat(String value) {
        return new JAXBElement<String>(_CzyDuplikat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wartosc-vat")
    public JAXBElement<Float> createWartoscVat(Float value) {
        return new JAXBElement<Float>(_WartoscVat_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-zamowienia")
    public JAXBElement<Long> createIdZamowienia(Long value) {
        return new JAXBElement<Long>(_IdZamowienia_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nr-faktury")
    public JAXBElement<String> createNrFaktury(String value) {
        return new JAXBElement<String>(_NrFaktury_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wytworca-nazwa")
    public JAXBElement<String> createWytworcaNazwa(String value) {
        return new JAXBElement<String>(_WytworcaNazwa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wartosc-brutto-slownie")
    public JAXBElement<String> createWartoscBruttoSlownie(String value) {
        return new JAXBElement<String>(_WartoscBruttoSlownie_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "zezwolenie")
    public JAXBElement<String> createZezwolenie(String value) {
        return new JAXBElement<String>(_Zezwolenie_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "podmiot-odpowiedzialny-kraj")
    public JAXBElement<String> createPodmiotOdpowiedzialnyKraj(String value) {
        return new JAXBElement<String>(_PodmiotOdpowiedzialnyKraj_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "typ-faktury")
    public JAXBElement<String> createTypFaktury(String value) {
        return new JAXBElement<String>(_TypFaktury_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-knt-ks")
    public JAXBElement<Integer> createIdKntKs(Integer value) {
        return new JAXBElement<Integer>(_IdKntKs_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "kod-kreskowy")
    public JAXBElement<Long> createKodKreskowy(Long value) {
        return new JAXBElement<Long>(_KodKreskowy_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "bank-nazwa")
    public JAXBElement<String> createBankNazwa(String value) {
        return new JAXBElement<String>(_BankNazwa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "kraj")
    public JAXBElement<String> createKraj(String value) {
        return new JAXBElement<String>(_Kraj_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "konta")
    public JAXBElement<String> createKonta(String value) {
        return new JAXBElement<String>(_Konta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-knt-sprzedawcy")
    public JAXBElement<Short> createIdKntSprzedawcy(Short value) {
        return new JAXBElement<Short>(_IdKntSprzedawcy_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "data-utworzenia")
    public JAXBElement<XMLGregorianCalendar> createDataUtworzenia(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataUtworzenia_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nr-rezerwacji")
    public JAXBElement<String> createNrRezerwacji(String value) {
        return new JAXBElement<String>(_NrRezerwacji_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "rodzaj-ceny")
    public JAXBElement<String> createRodzajCeny(String value) {
        return new JAXBElement<String>(_RodzajCeny_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "data-waznosci")
    public JAXBElement<XMLGregorianCalendar> createDataWaznosci(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWaznosci_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "dawka")
    public JAXBElement<String> createDawka(String value) {
        return new JAXBElement<String>(_Dawka_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "jednostka-miary")
    public JAXBElement<String> createJednostkaMiary(String value) {
        return new JAXBElement<String>(_JednostkaMiary_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-towaru-ks")
    public JAXBElement<Integer> createIdTowaruKs(Integer value) {
        return new JAXBElement<Integer>(_IdTowaruKs_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wersja")
    public JAXBElement<String> createWersja(String value) {
        return new JAXBElement<String>(_Wersja_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-poz-zamowienia")
    public JAXBElement<Integer> createIdPozZamowienia(Integer value) {
        return new JAXBElement<Integer>(_IdPozZamowienia_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "kod-pocztowy")
    public JAXBElement<String> createKodPocztowy(String value) {
        return new JAXBElement<String>(_KodPocztowy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "pkwiu")
    public JAXBElement<String> createPkwiu(String value) {
        return new JAXBElement<String>(_Pkwiu_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "podmiot-odpowiedzialny-nazwa")
    public JAXBElement<String> createPodmiotOdpowiedzialnyNazwa(String value) {
        return new JAXBElement<String>(_PodmiotOdpowiedzialnyNazwa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nr-poz-faktury")
    public JAXBElement<Byte> createNrPozFaktury(Byte value) {
        return new JAXBElement<Byte>(_NrPozFaktury_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "czy-korekta")
    public JAXBElement<String> createCzyKorekta(String value) {
        return new JAXBElement<String>(_CzyKorekta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "cena-netto")
    public JAXBElement<Float> createCenaNetto(Float value) {
        return new JAXBElement<Float>(_CenaNetto_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "gid")
    public JAXBElement<String> createGid(String value) {
        return new JAXBElement<String>(_Gid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nr-domu")
    public JAXBElement<String> createNrDomu(String value) {
        return new JAXBElement<String>(_NrDomu_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wartosc-netto")
    public JAXBElement<Float> createWartoscNetto(Float value) {
        return new JAXBElement<Float>(_WartoscNetto_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-knt-nabywcy")
    public JAXBElement<Short> createIdKntNabywcy(Short value) {
        return new JAXBElement<Short>(_IdKntNabywcy_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "upust")
    public JAXBElement<Float> createUpust(Float value) {
        return new JAXBElement<Float>(_Upust_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-towaru")
    public JAXBElement<Integer> createIdTowaru(Integer value) {
        return new JAXBElement<Integer>(_IdTowaru_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "bank-nr-konta")
    public JAXBElement<String> createBankNrKonta(String value) {
        return new JAXBElement<String>(_BankNrKonta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "forma-platnosci")
    public JAXBElement<String> createFormaPlatnosci(String value) {
        return new JAXBElement<String>(_FormaPlatnosci_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "postac")
    public JAXBElement<String> createPostac(String value) {
        return new JAXBElement<String>(_Postac_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "upust-kwota")
    public JAXBElement<Float> createUpustKwota(Float value) {
        return new JAXBElement<Float>(_UpustKwota_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "ulica")
    public JAXBElement<String> createUlica(String value) {
        return new JAXBElement<String>(_Ulica_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "cena-brutto")
    public JAXBElement<Float> createCenaBrutto(Float value) {
        return new JAXBElement<Float>(_CenaBrutto_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "data-sprzedazy")
    public JAXBElement<XMLGregorianCalendar> createDataSprzedazy(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataSprzedazy_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nr-lokalu")
    public JAXBElement<String> createNrLokalu(String value) {
        return new JAXBElement<String>(_NrLokalu_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-faktury")
    public JAXBElement<Integer> createIdFaktury(Integer value) {
        return new JAXBElement<Integer>(_IdFaktury_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "data-wystawienia")
    public JAXBElement<XMLGregorianCalendar> createDataWystawienia(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DataWystawienia_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "id-poz-faktury")
    public JAXBElement<Integer> createIdPozFaktury(Integer value) {
        return new JAXBElement<Integer>(_IdPozFaktury_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "cena-netto-bu")
    public JAXBElement<Float> createCenaNettoBu(Float value) {
        return new JAXBElement<Float>(_CenaNettoBu_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "stawka-vat")
    public JAXBElement<Float> createStawkaVat(Float value) {
        return new JAXBElement<Float>(_StawkaVat_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wartosc-brutto")
    public JAXBElement<Float> createWartoscBrutto(Float value) {
        return new JAXBElement<Float>(_WartoscBrutto_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "telefon")
    public JAXBElement<String> createTelefon(String value) {
        return new JAXBElement<String>(_Telefon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wartosc-vat-bu")
    public JAXBElement<Float> createWartoscVatBu(Float value) {
        return new JAXBElement<Float>(_WartoscVatBu_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nip")
    public JAXBElement<String> createNip(String value) {
        return new JAXBElement<String>(_Nip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "miejscowosc")
    public JAXBElement<String> createMiejscowosc(String value) {
        return new JAXBElement<String>(_Miejscowosc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "cena-brutto-bu")
    public JAXBElement<Float> createCenaBruttoBu(Float value) {
        return new JAXBElement<Float>(_CenaBruttoBu_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "cena-detal-brutto")
    public JAXBElement<Float> createCenaDetalBrutto(Float value) {
        return new JAXBElement<Float>(_CenaDetalBrutto_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "uwagi")
    public JAXBElement<String> createUwagi(String value) {
        return new JAXBElement<String>(_Uwagi_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "termin-platnosci")
    public JAXBElement<XMLGregorianCalendar> createTerminPlatnosci(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TerminPlatnosci_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "nazwa")
    public JAXBElement<String> createNazwa(String value) {
        return new JAXBElement<String>(_Nazwa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "liczba-poz")
    public JAXBElement<Byte> createLiczbaPoz(Byte value) {
        return new JAXBElement<Byte>(_LiczbaPoz_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "regon")
    public JAXBElement<String> createRegon(String value) {
        return new JAXBElement<String>(_Regon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "ilosc")
    public JAXBElement<Float> createIlosc(Float value) {
        return new JAXBElement<Float>(_Ilosc_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "wytworca-kraj")
    public JAXBElement<String> createWytworcaKraj(String value) {
        return new JAXBElement<String>(_WytworcaKraj_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.kedi", name = "opakowanie")
    public JAXBElement<String> createOpakowanie(String value) {
        return new JAXBElement<String>(_Opakowanie_QNAME, String.class, null, value);
    }

}
