package com.github.bobbylough.characterdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;




import com.github.bobbylough.characterdemo.dao.FictionalCharacterDaoImpl;
import com.github.bobbylough.characterdemo.model.FictionalCharacter;

@Controller
public class CharacterController  {
	
	private static List<FictionalCharacter> characterList = new ArrayList<FictionalCharacter>();
	
	static {
		ClassPathXmlApplicationContext context = new 
                ClassPathXmlApplicationContext("applicationContext.xml");
		FictionalCharacterDaoImpl dao = (FictionalCharacterDaoImpl) context.getBean("fictionCharacterDao");
		FictionalCharacter vader = new FictionalCharacter("Vader");
		FictionalCharacter luke = new FictionalCharacter("Luke");
		dao.save(vader);
		dao.save(luke);
		
		characterList = dao.getAll();
		context.close();
		
		//characterList.add(vader);
		
		
		
	}

	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("characterList", characterList);
		return mav;
	}

	

}
