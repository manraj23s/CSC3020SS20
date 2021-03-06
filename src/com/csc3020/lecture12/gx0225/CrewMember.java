package com.csc3020.lecture12.gx0225;

public class CrewMember {
    private FlightCrewJob job;

    public CrewMember(FlightCrewJob job) {
        this.job = job;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "job=" + job +
                '}';
    }
}
