package org.ssglobal.training.codes.itemB;

public enum ChemicalElements {
	H("Hydrogenium", "H", 1),
	O("Oxygenium", "O", 8),
	K("Potassium", "k", 19),
	Rb("Rubidium", "Rb", 37),
	Zn("Zinc", "Zn", 30),
	Ga("Gallium", "Ga", 31),
	Ti("Titanium", "Ti", 22),
	Sn("Tin", "Sn", 50);
	
	
	private String name;
	private String symbolicName;
	private Integer atomicNo;
	private String description;
	
	private ChemicalElements(String name, String symbolicName, Integer atomicNo) {
		this.name = name;
		this.symbolicName = symbolicName;
		this.atomicNo = atomicNo;
		categorizeChem();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbolicName() {
		return symbolicName;
	}

	public void setSymbolicName(String symbolicName) {
		this.symbolicName = symbolicName;
	}

	public Integer getAtomicNo() {
		return atomicNo;
	}

	public void setAtomicNo(Integer atomicNo) {
		this.atomicNo = atomicNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	private void categorizeChem() {
		switch(atomicNo) {
			case 3, 11, 19, 37, 55:
				description = "it is an alkali metal.";
				break;
			case 21, 22, 31, 39, 48, 72:
				description = "it is a transition metal.";
				break;
			case 13, 49, 50, 81, 83:
				description = "it is a metal.";
				break;
			default:
				description = "non-metal";
		}
	}
	
	@Override
	public String toString() {
		return "%s: %s with atomic number %d. %s".formatted(symbolicName, name, atomicNo, description);
	}
	
}
