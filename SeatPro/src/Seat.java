import java.io.Serializable;


public class Seat implements Serializable{

	private int s_id;
	private Integer u_id;
	private int rowN;
	private int colN;
	private String state;
	public int getS_id() {
		return s_id;
	}
	
	public void setS_id(int s_id){
		this.s_id=s_id;
	}
	public Integer getU_id() {
		return u_id;
	}
	
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public int getRowN() {
		return rowN;
	}
	public void setRowN(int rowN) {
		this.rowN = rowN;
	}
	public int getColN() {
		return colN;
	}
	public void setColN(int colN) {
		this.colN = colN;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Seat [s_id=" + s_id + ", u_id=" + u_id + ", rowN=" + rowN + ", colN=" + colN + ", state=" + state + "]";
	}
	
	

}
