package com.example.API.ProductController;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.API.product.phone;
@RestController

@EnableWebMvc
public class API_Controller {
 
  private ArrayList<phone> phoneList = new ArrayList<>();
  
  public API_Controller(){

	  	phoneList.add(new phone("Arpit", 200));

	  	phoneList.add(new phone("Sanjeev", 300));

	  	phoneList.add(new phone("Ben", 400));
	  }

	 @GetMapping(value = "/phone")

	    public ArrayList<phone> get() {

	        return phoneList;

	    }
	   @GetMapping("/phone/{id}")

	    public phone retrieveOneEmployee(@PathVariable("id") int id){

	       return phoneList.get(id);

	    }
	   @PostMapping(value = "/phone")

	   public void addOneEmployee(@RequestBody phone phone) {

	     phoneList.add(phone);

	   }
}