package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {
        String printName;
        if (this.name == null) {
            printName = "Data not available";
        } else {
            printName = this.name;
        }
        String printEmployer;
        if (this.employer == null || this.employer.getValue() == null || this.employer.getValue().length()== 0) {
            printEmployer = "Data not available";
        } else {
            printEmployer = this.employer.toString();
        }
        String printLocation;
        if (this.location == null || this.location.getValue() == null || this.location.getValue().length() == 0) {
            printLocation = "Data not available";
        } else {
            printLocation = this.location.toString();
        }
        String printPositionType;
        if (this.positionType == null || this.positionType.getValue() == null || this.positionType.getValue().length() == 0) {
            printPositionType = "Data not available";
        } else {
            printPositionType = this.positionType.toString();
        }
        String printCoreCompetency;
        if (this.coreCompetency == null || this.coreCompetency.getValue() == null || this.coreCompetency.getValue().length() == 0) {
            printCoreCompetency = "Data not available";
        } else {
            printCoreCompetency = this.coreCompetency.toString();
        }

        if (this.name != null || this.employer != null || this.location != null || this.positionType != null || this.coreCompetency != null) {
            return "\nID: "+this.id+"\nName: "+printName+"\nEmployer: "+printEmployer+"\nLocation: "+printLocation+"\nPosition Type: "+printPositionType+"\nCore Competency: "+printCoreCompetency+"\n";
        } else {
            return "\nOOPS! This job does not seem to exist.\n";
        }
    }
}
