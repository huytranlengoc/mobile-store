
<fieldset>
	<legend>
		<strong>Technical Specifications</strong>
	</legend>
	<table border = "1">
		<tr>
			<td>Screen</td>
			<td>${product.screenSize}</td>
		</tr>
		<tr>
			<td>Operating System</td>
			<td>${product.os}</td>
		</tr>
		<tr>
			<td>Camera</td>
			<td>${product.camera}</td>
		</tr>
		<tr>
			<td>Pin</td>
			<td>${product.pin}</td>
		</tr>
		<tr>
			<td>Resolution</td>
			<td>${detail.resolution}</td>
		</tr>
	</table>
</fieldset>
<hr />
<fieldset>
	<legend>
		<strong>Connectivity</strong>
	</legend>
	<table border = "1">
		<tr>
			<td>GPRS</td>
			<td>${detail.gprs}</td>
		</tr>
		<tr>
			<td>EDGE</td>
			<td>${detail.edge}</td>
		</tr>
		<tr>
			<td>GPRS</td>
			<td>${detail.gprs}</td>
		</tr>
		<tr>
			<td>3G</td>
			<td>${detail.network3g}</td>
		</tr>
		<tr>
			<td>WIFI</td>
			<td>${detail.wifi}</td>
		</tr>
		<tr>
			<td>USB</td>
			<td>${detail.usb}</td>
		</tr>
		<tr>
			<td>GPS</td>
			<td>${detail.gps}</td>
		</tr>
		<tr>
			<td>Bluetooth</td>
			<td>${detail.bluetooth}</td>
		</tr>
		<tr>
			<td>Jack Phone</td>
			<td>${detail.jackPhone}</td>
		</tr>
		<tr>
			<td>Other</td>
			<td>${detail.connectivityOther}</td>
		</tr>
	</table>
</fieldset>
<hr/>
<fieldset>
	<legend>
		<strong>Dimension</strong>
	</legend>
	<table border = "1">
		<tr>
			<td>Size</td>
			<td>${detail.dimensionSize}</td>
		</tr>
		<tr>
			<td>Weight</td>
			<td>${detail.dimensionWeight}</td>
		</tr>
	</table>
</fieldset>
<hr />
<fieldset>
	<legend>
		<strong>Multimedia</strong>
	</legend>
	<table border = "1">
		<tr>
			<td>Video</td>
			<td>${detail.video}</td>
		</tr>
		<tr>
			<td>Music</td>
			<td>${detail.music}</td>
		</tr>
		<tr>
			<td>Record</td>
			<td>${detail.record}</td>
		</tr>
		<tr>
			<td>Others</td>
			<td>${detail.otherFeature}</td>
		</tr>
	</table>
</fieldset>
<h3><a href="<c:url value="/cart/add/${product.id}"/>">Add to Cart</a></h3>