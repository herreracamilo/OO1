package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
	private String strategy;
	private List<JobDescription> jobs;
	
	
	
	public List<JobDescription> getJobs() {
		return jobs;
	}


	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public JobScheduler() {
		this.jobs = new ArrayList<JobDescription>();
	}

	public void schedule(JobDescription job) {
		this.jobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
		if(job != null) {
			this.jobs.remove(job);
		}
	}
	
	public JobDescription next() {
		JobDescription nextJob = null;
		
		switch(strategy) {// uso la estrategia para elegir la prioridad
			case "FIFO":
				nextJob = jobs.get(0);
				this.unschedule(nextJob);
				return nextJob;
			
			case "LIFO":
				nextJob = jobs.get(jobs.size()-1); //Saco el ultimo
				this.unschedule(nextJob);
				return nextJob;
			
			case "HighestPriority":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.priority(), j2.priority()))
                    .orElse(null);
                this.unschedule(nextJob);
                return nextJob;
                
			case "MostEffort":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.effort(), j2.effort()))
                    .orElse(null);
                this.unschedule(nextJob);
                return nextJob;
					
		}
		return nextJob;
	}
	
}
