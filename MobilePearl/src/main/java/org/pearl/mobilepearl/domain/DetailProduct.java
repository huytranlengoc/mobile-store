package org.pearl.mobilepearl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detail_product")
public class DetailProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Integer id;

	@Column(name = "resolution")
	String resolution;
	
	@Column(name = "gprs")
	Boolean gprs;
	
	@Column(name = "edge")
	Boolean edge;
	
	@Column(name = "network_3g")
	Boolean network3g;
	
	@Column(name = "wifi")
	Boolean wifi;
	
	@Column(name = "usb")
	Boolean usb;
	
	@Column(name = "gps")
	Boolean gps;
	
	@Column(name = "bluetooth")
	Boolean bluetooth;
	
	@Column(name = "connectivity_other")
	String connectivityOther;
	
	@Column(name = "jack_phone")
	String jackPhone;
	
	@Column(name = "dimension_size")
	String dimensionSize;
	
	@Column(name = "dimension_weight")
	String dimensionWeight;
	
	@Column(name = "video")
	String video;
	
	@Column(name = "music")
	String music;
	
	@Column(name = "record")
	String record;
	
	@Column(name = "other_feature")
	String otherFeature;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Boolean getGprs() {
		return gprs;
	}

	public void setGprs(Boolean gprs) {
		this.gprs = gprs;
	}

	public Boolean getEdge() {
		return edge;
	}

	public void setEdge(Boolean edge) {
		this.edge = edge;
	}

	public Boolean getNetwork3g() {
		return network3g;
	}

	public void setNetwork3g(Boolean network3g) {
		this.network3g = network3g;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Boolean getUsb() {
		return usb;
	}

	public void setUsb(Boolean usb) {
		this.usb = usb;
	}

	public Boolean getGps() {
		return gps;
	}

	public void setGps(Boolean gps) {
		this.gps = gps;
	}

	public Boolean getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(Boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getConnectivityOther() {
		return connectivityOther;
	}

	public void setConnectivityOther(String connectivityOther) {
		this.connectivityOther = connectivityOther;
	}

	public String getJackPhone() {
		return jackPhone;
	}

	public void setJackPhone(String jackPhone) {
		this.jackPhone = jackPhone;
	}

	public String getDimensionSize() {
		return dimensionSize;
	}

	public void setDimensionSize(String dimensionSize) {
		this.dimensionSize = dimensionSize;
	}

	public String getDimensionWeight() {
		return dimensionWeight;
	}

	public void setDimensionWeight(String dimensionWeight) {
		this.dimensionWeight = dimensionWeight;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getOtherFeature() {
		return otherFeature;
	}

	public void setOtherFeature(String otherFeature) {
		this.otherFeature = otherFeature;
	}
}
