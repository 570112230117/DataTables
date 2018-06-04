$(document).ready(function () {
	var table = $('#employeesTable').DataTable({
		"sAjaxSource": "/all",
		"sAjaxDataProp": "",
		"order": [[0, "asc"]],
		"aoColumns": [
			{ "mData": "repairDateStr" },
			{ "mData": "repairname" },
			{ "mData": "repairWarranty" },
			{ "mData": "repairProduct" },
			{ "mData": "repairWaste" },
			{ "mData": "repairAppointment" },
		
			{ "mData": "" },
			{ "mData": "" },
			{ "mData": "" },
			{ "mData": "" },
			{ "mData": "" },
		]
	})
});