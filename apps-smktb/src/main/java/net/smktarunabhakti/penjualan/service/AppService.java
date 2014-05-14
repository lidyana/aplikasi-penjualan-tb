/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.service;

import java.awt.print.Pageable;
import java.util.List;
import net.smktarunabhakti.penjualan.domain.barang;
import org.springframework.data.domain.Page;

/**
 *
 * @author Chiva (RPL)
 */
public interface AppService {
    void simpanBarang(barang b);
    
    void hapusBarang(barang b);
    
    Page<barang> cariSemuaBarang (Pageable p);
    
    barang cariBarangById(String id);
    
    Long CountSemuaBarang();
    
}
