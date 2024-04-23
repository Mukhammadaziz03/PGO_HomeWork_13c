public class Studies {
    private String programName;
    private String description;
    private int numberOfSemesters;
    private int maxITNs;

    public Studies(String programName, String description, int numberOfSemesters, int maxITNs) {
        this.programName = programName;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNs = maxITNs;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

}
