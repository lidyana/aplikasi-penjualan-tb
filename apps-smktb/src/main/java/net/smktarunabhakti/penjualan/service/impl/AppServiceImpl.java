/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.service.impl;

import net.smktarunabhakti.penjualan.dao.BarangDao;
import net.smktarunabhakti.penjualan.domain.barang;
import net.smktarunabhakti.penjualan.service.AppService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 *
 * @author Chiva (RPL)
 */
//imp itu implement


@SuppressWarnings("unchecked")
@Service("AppService")
@Transactional
public class AppServiceImpl implements AppService{

    public BarangDao barangDao;
    
    @Override
    public void simpanBarang(barang b) {
        barangDao.save(b);
    }

    @Override
    public void hapusBarang(barang b) {
        if (b == null || b.getId() == null) {
            return;
        }
        barangDao.delete(b);
        
    }

    @Override
    public Page<barang> cariSemuaBarang(Pageable p) {
        if (p == null) {
            p = new PageRequest(0,20);            
        }        
        return barangDao.findAll(p);
        
    }

    @Override
    public barang cariBarangById(String id) {
        if (!StringUtils.hasText(id)) {
            return null;
        }
        return barangDao.findOne(id);
    }

    @Override
    public Long CountSemuaBarang() {
        return barangDao.count();
    }
    
}
