package tech.coderonin.simple;

public class Simple{
	String version;
	
	private Simple(){}

	public Simple( String v ){
		this.version = v;
	}

	public String getVersion(){
		return this.version;
	}
}
