/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.dao;

import java.io.Serializable;
import net.smktarunabhakti.penjualan.domain.barang;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Chiva (RPL)
 */
public interface BarangDao extends PagingAndSortingRepository<barang, String> {

    
    
}

