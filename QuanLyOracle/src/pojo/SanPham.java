/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author aabbb
 */
public class SanPham
{
    private String maSanPham;
    private String tenSanPham;
    private String donViTinh;
    private int soLuong;
    private int donGiaBan;
    private int donGiaMua;
    private String maNhaCungCap;
    private String loaiSanPham;

    public SanPham(){
    }

    public SanPham(String maSanPham, String tenSanPham, String donViTinh, int soLuong, int donGiaBan, int donGiaMua, String maNhaCungCap, String loaiSanPham){
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGiaBan = donGiaBan;
        this.donGiaMua = donGiaMua;
        this.maNhaCungCap = maNhaCungCap;
        this.loaiSanPham = loaiSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGiaBan() {
        return donGiaBan;
    }

    public void setDonGiaBan(int donGiaBan) {
        this.donGiaBan = donGiaBan;
    }

    public int getDonGiaMua() {
        return donGiaMua;
    }

    public void setDonGiaMua(int donGiaMua) {
        this.donGiaMua = donGiaMua;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }
    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
}
