package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO  {

	public List<User> list() {
		
		
		return null;
	}
	@Autowired

	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}
@Transactional
	public User get(String id) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().get(User.class,id);
				String hql = "from User where userId=" + "'" + id + "'";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				@SuppressWarnings("unchecked")
				List<User> listUser = query.list();
				if (listUser != null && !listUser.isEmpty()) {
					return listUser.get(0);
				}
				return null;
	}
	
@Transactional
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);

		
	}
@Transactional
	public void delete(String Id) {
		// TODO Auto-generated method stub
		User UserToDelete = new User();
		UserToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(UserToDelete);
		
	}
@Transactional
	public List<User> listUser() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<User> listUser = sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
		
	}
	
		
}
