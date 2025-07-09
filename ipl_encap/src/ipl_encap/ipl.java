package ipl_encap;
//pojo class (plain old object class)

public class ipl {
	private int runs = 5000;
	private int jno = 07;
	private int wic = 100;
	private String name = "Raina";
	private String t_name = "Australia";

	ipl() {
	}

	public ipl(int r, int j, int w, String s, String t) {

		runs = r;
		jno = j;
		wic = w;
		name = s;
		t_name = t;
	}

	public void setruns(int r, int pin) {
		if (pin == 123) {
			runs = r;
		} else {
			System.out.println("enter valid pin");
		}
	}

	public void setjno(int j, int pin) {
		if (pin == 123) {
			jno = j;
		} else {
			System.out.println("enter valid pin");
		}

	}

	public void setwic(int s, int pin) {
		if (pin == 123) {
			wic = s;
		} else {
			System.out.println("enter valid pin");
		}
	}

	public void setname(String s, int pin) {
		if (pin == 123) {
			name = s;
		} else {
			System.out.println("enter valid pin");
		}
	}

	public void sett_name(String t, int pin) {
		if (pin == 123) {
			t_name = t;
		} else {
			System.out.println("enter valid pin");
		}
	}

	public int getruns(int pin) {

		return runs;

	}

	public int getjno() {
		return jno;
	}

	public int getwic() {
		return wic;
	}

	public String getname() {
		return name;

	}

	public String gett_name() {
		return t_name;
	}

	@Override
	public String toString() {
		return "ipl [runs=" + runs + ", name=" + name + ", t_name=" + t_name + "]";
	}

}
