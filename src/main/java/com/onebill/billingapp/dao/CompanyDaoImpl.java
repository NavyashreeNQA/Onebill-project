package com.onebill.billingapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Company;
import com.onebill.billingapp.entities.Plan;
import com.onebill.billingapp.entities.PlanDetails;
import com.onebill.billingapp.entities.Services;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Transactional
	public Services addService(Services service) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(service);
		manager.getTransaction().commit();

		return service;
	}

	public Services deleteService(int serviceId) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Services service = manager.find(Services.class, serviceId);
		manager.remove(service);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return service;
	}

	public Plan addPlan(Plan plan) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(plan);
		manager.getTransaction().commit();
		manager.close();
		return plan;
	}

	public Plan updatePlan(Plan plan) {
		EntityManager manager = factory.createEntityManager();
		Plan plan1 = manager.find(Plan.class, plan.getPlanId());

		if (plan1 != null) {
			BeanUtils.copyProperties(plan, plan1);
			manager.getTransaction().begin();
			manager.close();
			return plan1;
		} else {
			manager.close();
			return null;
		}
	}

	public Charges updateCharges(Charges charges) {
		EntityManager manager = factory.createEntityManager();
		Charges charge1 = manager.find(Charges.class, charges.getChargeId());

		if (charge1 != null) {
			BeanUtils.copyProperties(charges, charge1);
			manager.getTransaction().begin();
			manager.close();
			return charge1;
		} else {
			manager.close();
			return null;
		}

	}

	public List<Plan> getAllPlan() {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Plan> query = manager.createQuery("FROM Plan", Plan.class);
		return query.getResultList();
	}

	public Plan removePlan(int planId) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Plan plan = manager.find(Plan.class, planId);
		manager.remove(plan);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return plan;
	}

	public PlanDetails createBundle(PlanDetails details) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(details);
		manager.getTransaction().commit();
		manager.close();
		return details;
	}

	public Charges addCharges(Charges charges) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(charges);
		manager.getTransaction().commit();
		manager.close();
		return charges;
	}

	public Company addCompany(Company company) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(company);
		manager.getTransaction().commit();
		manager.close();
		return company;

	}

	public List<PlanDetails> getAllBundles() {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<PlanDetails> query = manager.createQuery("FROM PlanDetails", PlanDetails.class);
		return query.getResultList();

	}

	public PlanDetails updateBundles(PlanDetails details) {
		EntityManager manager = factory.createEntityManager();
		PlanDetails details1 = manager.find(PlanDetails.class, details.getPlanDetailId());

		if (details1 != null) {
			BeanUtils.copyProperties(details, details1);
			manager.getTransaction().begin();
			manager.close();
			return details1;
		} else {
			manager.close();
			return null;
		}

	}

	public PlanDetails deleteBundle(int planDetailId) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		PlanDetails details = manager.find(PlanDetails.class, planDetailId);
		manager.remove(details);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return details;

	}

}
