package com.tns.module;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class CollegeController
{
	@Autowired
    private CollegeServiceImpl service;
 
     //get the all college details
	@GetMapping ("/Colleges")
	public List<College> list()
	{
		return service.listAll();
	
	}
	 //get the particular college id details
	@GetMapping ("/Colleges/{id}")
    public ResponseEntity<College> get(@PathVariable Integer id)
{
		try
		{
		College college=service.get(id);
		return new ResponseEntity<College>(college,HttpStatus.OK);
		}catch (NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
}
		// Add the college data
		@PostMapping("/Colleges")
		public void add(@RequestBody College college)
		{
	       service.save(college);
	       
		}
		//update the data
		@PutMapping("/Colleges/{id}")
		public ResponseEntity<?> update(@RequestBody College college,@PathVariable Integer id)
		{
			try 
		{
				College existCollege = service.get(id);
				service.save(college);
				return new ResponseEntity<>(HttpStatus.OK);
		}
			catch (NoSuchElementException e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
}
		//delete the college data
		@DeleteMapping("/Colleges/{id}")
		public void delete(@PathVariable Integer id)
		{
			service.delete(id);
		}
 }


 