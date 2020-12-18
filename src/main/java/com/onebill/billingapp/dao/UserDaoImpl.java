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

import com.onebill.billingapp.entities.Addon;
import com.onebill.billingapp.entities.Charges;
import com.onebill.billingapp.entities.Plan;
@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Transactional
	public Plan buyPlan(Plan plan) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(plan);
		manager.getTransaction().commit();
		manager.close();
		return plan;
	}

	public Plan renewPlan(Plan plan) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Plan renew = manager.find(Plan.class, plan.getPlanId());
		BeanUtils.copyProperties(plan, renew);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return renew;

	}

	public List<Plan> getAllPlans() {
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Plan> query = manager.createQuery("FROM Plan", Plan.class);
		return query.getResultList();
	}

	public Addon fillAddon(Addon addon) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(addon);
		manager.getTransaction().commit();
		manager.close();
		return addon;
	}

	public List<Charges> viewAllCharge(Charges charges) {
		EntityManager manager=factory.createEntityManager();
		TypedQuery<Charges> query = manager.createQuery("FROM Charges", Charges.class);
		return query.getResultList();
	}

}
