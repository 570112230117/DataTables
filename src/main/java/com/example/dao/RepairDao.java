package com.example.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.RepairBean;
import com.example.util.ConnectDB;

@Repository
public class RepairDao {
	// table
	public List<RepairBean> findAll() {
		List<RepairBean> list = new ArrayList<>();
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();

		try {
			sql.append(" SELECT * FROM repair ");
			prepared = con.openConnect().prepareStatement(sql.toString());
			ResultSet rs = prepared.executeQuery();

			while (rs.next()) {
				RepairBean bean = new RepairBean();
				bean.setRepairId(rs.getInt("repair_id"));
				bean.setRepairDateStr(rs.getString("repair_date"));
				bean.setRepairname(rs.getString("repair_name"));
				bean.setRepairAddress(rs.getString("repair_address"));
				bean.setRepairPhone(rs.getString("repair_phone"));
				bean.setRepairEmail(rs.getString("repair_email"));
				bean.setRepairWarranty(rs.getString("repair_warranty"));
				bean.setRepairSerialnumber(rs.getString("repair_serialnumber"));
				bean.setRepairType(rs.getString("repair_type"));
				bean.setRepairProduct(rs.getString("repair_product"));
				bean.setRepairWaste(rs.getString("repair_waste"));
				bean.setRepairDetail(rs.getString("repair_detail"));
				bean.setRepairAppointment(rs.getDate("repair_appointment"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
