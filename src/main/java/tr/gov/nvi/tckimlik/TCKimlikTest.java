/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.nvi.tckimlik;

/**
 *
 * @author bamasyali
 */
public class TCKimlikTest {

    public static void main(String[] args) {
        Boolean result = TCKimlikService.validate(0l, "", "", 1999);
        System.out.println(result);
    }
}
