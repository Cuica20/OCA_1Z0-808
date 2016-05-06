package com.axcessfin;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageApplication {
   private static SessionFactory factory; 
   public static void main(String[] args) {
 /*     try{
         factory = new AnnotationConfiguration().
                   configure().
                   //addPackage("com.xyz") //add package if used.
                   addAnnotatedClass(Application.class).
                   buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }*/
      ManageApplication ME = new ManageApplication();

      List<Application> lista = ME.getListApplications();
      for (Application application : lista) {
		System.out.println(application.getLoanCode());
	}
      /* List down all the employees */
//      ME.listEmployees();

////      /* Add few employee records in database */
//      ME.addEmployee(121212, 1212, 153.0, "PENDING");
//      ME.addEmployee(121213, 1212, 154.0, "PENDING");
//      ME.addEmployee(121214, 1212, 155.0, "PENDING");
////
////      /* Update employee's records */
//      ME.updateEmployee(121213, 5000);
////
////      /* Delete an employee from the database */
      //ME.deleteEmployee(121214);
////
////      /* List down new list of the employees */
//      ME.listEmployees();
   }
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(int loanCode, int boCode,double loanAmt, String processingStatus){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Application application = new Application();
         application.setLoanCode(loanCode);
         application.setBoCode(boCode);
         application.setLoanAmt(loanAmt);
         application.setProcessingStatus(processingStatus);
         session.save(application);
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employeeID;
   }
   
   public List<Application> getListApplications( ){
	      Session session = HibernateUtil.getSessionFactory().openSession();
	      Transaction tx = null;
	      List applications = null;
	      try{
	         tx = session.beginTransaction();
	         applications = session.createQuery("FROM Application ").list();	        
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return applications;
	   }
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List applications = session.createQuery("FROM Application ").list(); 
         for (Iterator iterator = 
        		 applications.iterator(); iterator.hasNext();){
        	 Application application = (Application) iterator.next(); 
            System.out.print("First Name: " + application.getLoanCode()); 
            System.out.print("  Last Name: " + application.getBoCode()); 
            System.out.println("  Salary: " + application.getLoanAmt());
            System.out.println("  Salary: " + application.getLoanAmt());
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to UPDATE salary for an employee */
   public void updateEmployee(Integer loanCode, double loanAmt){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Application application = 
                    (Application)session.get(Application.class, loanCode); 
         application.setLoanAmt( loanAmt );
		 session.update(application); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public void deleteEmployee(Integer applicationId){
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Application employee = 
                   (Application)session.get(Application.class, applicationId); 
         session.delete(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}