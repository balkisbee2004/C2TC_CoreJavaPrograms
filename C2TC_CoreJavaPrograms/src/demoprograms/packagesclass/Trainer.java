package demoprograms.packagesclass;

public class Trainer extends Person{
	private String session;
	private String desig;
	private int batchno;
	
	public Trainer(int pid, String name, String city, String session, String desig, int batchno) {
		super(pid, name, city);
		this.session = session;
		this.desig = desig;
		this.batchno = batchno;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	@Override
	public String toString() {
		return "Trainer [Trainer id:"+super.getPid()+"Trainer name:"+super.getName()+"Trainer City:"+super.getCity()+"Session=" + session + ", desig=" + desig + ", batchno=" + batchno + "]";
	}
	

}
