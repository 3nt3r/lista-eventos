package com.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventoapp.models.Evento;
import com.eventoapp.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;

	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form(){
		return "evento/formEvento";
	}

	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String form(Evento evento){
		eventoRepository.save(evento);
		
		return "redirect:/cadastrarEvento";
	}
	
	@RequestMapping("/eventos")
	public ModelAndView listaEventos(){
		ModelAndView modelAndView = new ModelAndView("index");
		Iterable<Evento> eventos = eventoRepository.findAll();
		modelAndView.addObject("eventos", eventos);
		return modelAndView;
	}
	
}
