package com.example.demo.jobs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jobs.job;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.example.demo.jobs.JobRepo;

@CrossOrigin
@RequestMapping("/api/v1")
@Tag(name = "jobs")
@RestController
public class jobctrl {

	@Autowired
	private JobRepo joRe;
	
	@GetMapping("/jobs")
	public List <job> getAlljobs()
	{
		return joRe.findAll();
	}
	
	@GetMapping("/jobs/{id}")
	public Optional<job> getjobsbyid(@PathVariable String id)
	{
		return joRe.findById(id);
	}
	
	@PostMapping("/jobs")
	public job saveJob( @RequestBody job jobs)
	{
		return joRe.save(jobs);
	}
	
	@PutMapping("/jobs/{id}")
	public job updateJob( @RequestBody job job, @PathVariable String id)
	
	{
		job currentJob;
		currentJob = joRe.findById(id).get();
		currentJob.setJobID(job.getJobID());
		currentJob.setJobTitle(job.getJobTitle());
		currentJob.setMinsalary(job.getMinsalary());
		currentJob.setMaxsalary(job.getMaxsalary());
		return joRe.save(currentJob);
		
	}
	
	@DeleteMapping("/jobs/{id}")
	public void deletejobsbyid(@PathVariable String id)
	{
		joRe.deleteById(id);
	}
	
}
