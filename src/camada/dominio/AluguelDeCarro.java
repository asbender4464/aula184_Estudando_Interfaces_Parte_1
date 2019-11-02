package camada.dominio;

import java.util.Date;

public class AluguelDeCarro {

	//Atributos
	private Date inicio;
	private Date fim;
	
	//Estabelecendo as associações
	private Veiculo veiculo;
	private NotaFiscal notaFiscal;
	
	//Construtor padrão.
	public AluguelDeCarro() {
	}

	//Construtor com argumentos.
	//Neste construtor 'não há' o argumento 'notaFiscal' pois, de acordo com o diagrama UML,
	//a NF poderá ou não ter sido gerada.
	public AluguelDeCarro(Date inicio, Date fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	//GETs e SETs
	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
}
