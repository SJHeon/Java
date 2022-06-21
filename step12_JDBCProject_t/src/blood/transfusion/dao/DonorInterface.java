package blood.transfusion.dao;

import java.util.ArrayList;

import blood.transfusion.dto.DonorDTO;

public interface DonorInterface {
	public void notExistDonor(String donorId);

	public boolean addDonor(DonorDTO donor);

	public boolean updateDonor(String donorId, String purposeDonation);

	public boolean deleteDonor(String donorId);

	public DonorDTO getDonor(String donorId);

	public ArrayList<DonorDTO> getAllDonors();

}
