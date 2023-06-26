
public abstract class Monster {
	private String name;
	private int hp;
	private double atc;
	private double def;
	private double spd;
	private double mp;
	abstract void action(Hero h,int number);
	abstract double atc(Hero h);
	//abstract void def(Hero h);


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public double getAtc() {
		return atc;
	}
	public void setAtc(double atc) {
		this.atc = atc;
	}
	public double getDef() {
		return def;
	}
	public void setDef(double def) {
		this.def = def;
	}
	public double getSpd() {
		return spd;
	}
	public void setSpd(double spd) {
		this.spd = spd;
	}
	public double getMp() {
		return mp;
	}
	public void setMp(double mp) {
		this.mp = mp;
	}
	public Monster() {
		this.name="???";
		this.hp=10;
		this.atc=0.0;
		this.def=0.0;
		this.spd=0.0;
		this.mp=0.0;
	}
}
