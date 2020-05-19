package no4;

/*
Nama      : Siti Nursahida Imlan_13020180104
Kelas     : B2
hari/tgl  : Senin, 18 Mei 2020
 */
import java.sql.SQLException;
	import java.util.List;
	public interface InterfaceMahasiswa{
	    Mahasiswa insert(Mahasiswa o) throws SQLException;
	    void update(Mahasiswa o) throws SQLException;
	    void delete(String nim) throws SQLException;
	    List getAll() throws SQLException;
	}
