package com.rev.pubhub.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rev.pubhub.model.Book;
import com.rev.pubhub.service.BookService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	BookService bookService;
	@GetMapping("/order")
	public String ordering(ModelMap modelMap){
			System.out.println("BookController -> list");
			List<Book> booksList = bookService.findAll();
			modelMap.addAttribute("ORDER_LIST",booksList);
			System.out.println(booksList);

			return "Order";
		
	}
	@GetMapping("/addtocart/{id}")
	public String addToCart(@PathVariable("id")Integer id,ModelMap modelMap,HttpSession session){
		System.out.println("ShowBook:" + id);
		Book book = bookService.findOne(id);
		modelMap.addAttribute("SELECTED_BOOK", book);
		return "bookordered";
		
	}

	

	

}
