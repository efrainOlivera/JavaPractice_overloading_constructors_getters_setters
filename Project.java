class Project{
	private String name;
	private String description;

	public String elevatorPitch(){
		return this.getName() +":"+ this.getDescription();
	}

	// Constructors 
	public Project(){
		this.name = "";
		this.description = "";
	}
	public Project(String name){
		this.name = name;
		this.description = "";
	}
	public Project(String name, String description){
		this.name = name;
		this.description = description;
	}

	// setters
	public void setName(String updatedName){
		name = updatedName;
	}
	public void setDescription(String updatedDescription){
		description = updatedDescription;
	}

	// getters
	public String getName(){
		return  name;
	}
	public String getDescription(){
		return description;
	}
}