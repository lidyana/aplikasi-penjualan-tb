package net.smktarunabhakti.penjualan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


import net.smktarunabhakti.penjualan.dao.BarangDao;
import net.smktarunabhakti.penjualan.domain.Barang;
import net.smktarunabhakti.penjualan.service.AppService;

@SuppressWarnings("unchecked")
@Service("appService")
@Transactional
public class AppServiceImpl implements AppService {
	@Autowired 
	public BarangDao barangDao;
	
	@Override
	public void simpanBarang(Barang b) {
		barangDao.save(b);
	}

	@Override
	public void hapusBarang(Barang b) {
		if (b==null || b.getId()==null){
			return;
		}
		barangDao.delete(b);
	}

	@Override
	public Barang cariBarangId(String id) {
		if (!StringUtils.hasText(id)){
			return null;
		}
		return barangDao.findOne(id);
	}

	@Override
	public Long countSemuaBarang() {
		return barangDao.count();
	}

	@Override
	public Page<Barang> cariSemuaBarang(Pageable p) {
		if(p==null){
			p = new PageRequest(0, 20);
		}
		return barangDao.findAll(p);
	}


}
