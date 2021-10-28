package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("service")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO dao; 
	
	@Override
	public List<EmpVO> getEmpList() {
		return dao.emplist();
	}

	@Override
	public EmpVO getEmpOne(int id) {
		return dao.empone(id);
	}

	@Override
	public void insertEmp(EmpVO vo) {
		EmpVO result = dao.empone(vo.getEmployee_id());
		if(result == null) {
			dao.insertemp(vo);
		}
	}

	@Override
	public void updateEmp(EmpVO vo) {
		dao.updateemp(vo);
	}

	@Override
	public void deleteEmp(String name) {
		name = "%"+name+"%";
		dao.deleteemp(name);
	}

	@Override
	public int countEmp() {
		return dao.cnt();
	}

	@Override
	public List<EmpVO> empDeptlist(int[] a) {
		return dao.empdeptlist(a);
	}

}
