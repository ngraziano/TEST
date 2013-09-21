/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test3.controller;

import com.mycompany.test3.entity.Utilisateur;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author bjk187
 */
@Controller("testController")
@RequestMapping("/aa")
public class TestConstroller {
     
    @PersistenceContext( unitName = "test3_PU" )
    private EntityManager       em;
    
    private static final Logger logger = LoggerFactory.getLogger(TestConstroller.class);
    
    /**
    * Handler de la méthode Get pour l'URL /helloSpringMVC.html. 
    * 
    * @param name le nom que l'on doit afficher dans la vue.
    * @param model une map de toutes les données qui seront utilisables dans la vue 
    * @return le nom de la vue qu'il faudra utiliser.
    */  //method =method=RequestMethod.GET 
  @RequestMapping("/toto.html")
  public  String sayHelloWithSpringMVC(
    @RequestParam(value="name",required=false) String name, 
    ModelMap model) 
  {
      logger.debug("Appel de hello");
    model.addAttribute("name",name);
    // on utilisera donc le fichier /WEB-INF/jsp/hello.jsp
    //au regard de la stratégie de résolution des vues 
    //utilisée dans cette application.
    Utilisateur toto = new Utilisateur();
    toto.setId(Long.MIN_VALUE);
    toto.setNom(name);
    em.persist(toto);
    toto.setNom(name +"a");
        em.persist(toto);

//em.refresh(toto);
   Query req =em.createQuery("SELECT u FROM Utilisateur u");
    req.getResultList();
    return "hello";
  }
  
  
}
