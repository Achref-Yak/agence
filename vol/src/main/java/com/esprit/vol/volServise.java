package com.esprit.vol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class volServise {

	@Autowired
	private volRepository volRepository;

	public vol addvol(vol vol) {
		return volRepository.save(vol);
	}
	public vol updatevol(int id, vol newVol) {
		if (volRepository.findById(id).isPresent()) {
			vol existingvol = volRepository.findById(id).get();
			existingvol.setdepart(newVol.getdepart());
			existingvol.setdestination(newVol.getdestination());
			existingvol.setdateVol(newVol.getdateVol());

			return volRepository.save(existingvol);
		} else
			return null;
	}
	public String deletevol(int id) {
		if (volRepository.findById(id).isPresent()) {
			volRepository.deleteById(id);
			return "vol supprimé";
		} else
			return "vol non supprimé";
	}
}
