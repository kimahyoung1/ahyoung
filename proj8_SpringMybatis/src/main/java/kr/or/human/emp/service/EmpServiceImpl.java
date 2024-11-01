package kr.or.human.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.emp.dao.EmpDAO;
import kr.or.human.emp.dto.EmpDTO;


@Service
public class EmpServiceImpl implements Empservice {

   @Autowired
   EmpDAO empDAO;

   @Override
   public List<EmpDTO> listEmp(){
      List<EmpDTO> list = empDAO.selectEmp();
      return list;
   }

}
