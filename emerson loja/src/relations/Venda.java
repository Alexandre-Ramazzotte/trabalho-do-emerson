package relations;
import java.util.Date;
import entities.*;


public class Venda {
	
	Date date;
	Integer peca_qunt;
	Double total_val;
	String vendor_cpf;
	Double comission;
	String cliente_cpf;
	
	public Venda(Date date, Integer peca_qunt, Peça peca, Cliente cliente, Vendedor vendor) {
		this.date = date;
		this.peca_qunt = peca_qunt;
		total_val = peca.getVal() * peca_qunt;
		vendor_cpf = vendor.getCPF();
		comission = total_val * (vendor.getComissao()/100);
		cliente_cpf = cliente.getCpf();
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPeca_qunt() {
		return peca_qunt;
	}
	public void setPeca_qunt(Integer peca_qunt) {
		this.peca_qunt = peca_qunt;
	}
	public Double getTotal_val() {
		return total_val;
	}
	public void setTotal_val(Double total_val) {
		this.total_val = total_val;
	}
	public String getVendor_cpf() {
		return vendor_cpf;
	}
	public void setVendor_cpf(String vendor_cpf) {
		this.vendor_cpf = vendor_cpf;
	}
	public Double getComission() {
		return comission;
	}
	public void setComission(Double comission) {
		this.comission = comission;
	}
	public String getCliente_cpf() {
		return cliente_cpf;
	}
	public void setCliente_cpf(String cliente_cpf) {
		this.cliente_cpf = cliente_cpf;
	}
}
