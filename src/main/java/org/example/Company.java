package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro değeri negatif olamaz!");
        }
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro değeri negatif olamaz!");
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // Add employee method
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index.");
        } else if (developerNames[index] != null) {
            System.out.println("Bu index zaten dolu.");
        } else {
            developerNames[index] = name;
            System.out.println("Developer " + name + " index " + index + " konuldu.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company{id=").append(id)
                .append(", name='").append(name)
                .append("', giro=").append(giro)
                .append(", developerNames=[");
        for (String developer : developerNames) {
            sb.append(developer).append(" ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
