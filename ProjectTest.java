class ProjectTest{
	public static void main(String[] args){
		Project creation = new Project("carbana", "electric vehicles");
		creation.setName("Tesla");
		System.out.println("project name: " + creation.getName() + " project description: " + creation.getDescription());
		System.out.println(creation.elevatorPitch());
	}
}