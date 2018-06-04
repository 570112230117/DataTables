<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Spring Boot + JPA + Datatables</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
		<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
		<script src="/js/datatable.js"></script>
	</head>

	<body>

		<div style="margin-top: 1cm; margin-left: 1cm; margin-right: 1cm; ">
			<h1>รายการซ่อมเครื่องใช้ไฟฟ้า</h1>
			<table id="employeesTable" class="table table-bordered">

				<!-- Header Table -->
				<thead>
					<tr style="background: #787878;; color: white;">
						<th>วันที่แจ้งซ่อม</th>
						<th>ชื่อลูกค้า</th>
						<th>การประกัน</th>
						<th>หมวดสินค้า</th>
						<th>อาการเสีย</th>
						<th>นัดวันซ่อม</th>


						<th>สาเหตุ / วิธีแก้ไข</th>
						<th>ผู้รับแจ้ง</th>
						<th>ช่างผู้รับผิดชอบ</th>
						<th>สถานะ</th>
						<th>รายละเอียด</th>
					</tr>
				</thead>
				<!-- Footer Table -->
				<!-- <tfoot>
					<tr>
						<th>วันที่แจ้งซ่อม</th>
						<th>ชื่อลูกค้า</th>
						<th>การประกัน</th>
						<th>หมวดสินค้า</th>
						<th>อาการเสีย</th>
						<th>นัดวันซ่อม</th>

						<th>สาเหตุ / วิธีแก้ไข</th>
						<th>ผู้รับแจ้ง</th>
						<th>ช่างผู้รับผิดชอบ</th>
						<th>สถานะ</th>
						<th>รายละเอียด</th>
					</tr>
				</tfoot> -->
			</table>
		</div>
	</body>

	</html>