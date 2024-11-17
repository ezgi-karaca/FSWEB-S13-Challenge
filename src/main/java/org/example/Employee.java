package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Geçersiz index.");
        } else if (healthPlans[index] != null) {
            System.out.println("Bu index zaten dolu.");
        } else {
            healthPlans[index] = name;
            System.out.println("Sağlık planı " + name + " index " + index + " konuldu.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{id=").append(id)
                .append(", fullName='").append(fullName)
                .append("', email='").append(email)
                .append("', password='").append(password)
                .append("', healthplans=[");
        for (String plan : healthPlans) {
            sb.append(plan).append(" ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
