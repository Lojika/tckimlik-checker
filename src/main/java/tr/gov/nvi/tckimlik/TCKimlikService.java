/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.nvi.tckimlik;

import java.util.Locale;
import tr.gov.nvi.tckimlik.KPSPublic;
import tr.gov.nvi.tckimlik.KPSPublicSoap;

/**
 *
 * @author bamasyali
 */
public final class TCKimlikService {

    private TCKimlikService() {
    }

    public static Boolean validate(long tcKimlikNo, String ad, String soyad, int dogumYili) {

        KPSPublic service = new KPSPublic();
        KPSPublicSoap port = service.getKPSPublicSoap();

        // TODO process result here
        Locale locale = new Locale("tr", "TR");

        boolean result = port.tcKimlikNoDogrula(tcKimlikNo, ad.toUpperCase(locale), soyad.toUpperCase(locale), dogumYili);
        return result;
    }
}
