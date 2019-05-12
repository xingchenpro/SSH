package com.javahly.test;


import com.javahly.entity.Users;
import com.javahly.entity.UsersType;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class Operation {

	public void One1Save(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		UsersType t1 = new UsersType();
		t1.setTypeName("普通会员");

		UsersType t2 = new UsersType();
		t2.setTypeName("VIP会员");

		session.save(t1);
		session.save(t2);

		session.getTransaction().commit();

		session.close();
	}

	public void One1Update(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		UsersType t1 = (UsersType)session.get(UsersType.class,1);
		t1.setTypeName("普通会员1");
		session.update(t1);

		session.getTransaction().commit();

		session.close();
	}

	public void One3Delete(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		UsersType t1 = (UsersType)session.get(UsersType.class,1);
		session.delete(t1);

		session.getTransaction().commit();

		session.close();
	}

	public void Many1Save(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		Users u1 = new Users();
		u1.setUname("张三");

		Users u2 = new Users();
		u2.setUname("李四");

		session.save(u1);
		session.save(u2);

		session.getTransaction().commit();

		session.close();
	}

	public void Many1Update(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		Users t1 = (Users)session.get(Users.class,1);
		t1.setUname("张思");
		session.update(t1);

		session.getTransaction().commit();

		session.close();
	}

	public void Many3Delete(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		Users u1 = (Users)session.get(Users.class,1);
		session.delete(u1);

		session.getTransaction().commit();

		session.close();
	}

	public void OneMany1Save(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		UsersType t1 = new UsersType();
		t1.setTypeName("普通会员");

		UsersType t2 = new UsersType();
		t2.setTypeName("VIP会员");

		Users u1 = new Users();
		u1.setUname("张三");

		Users u2 = new Users();
		u2.setUname("李四");

		Users u3 = new Users();
		u3.setUname("王五");

		Users u4 = new Users();
		u4.setUname("赵六");

		Users u5 = new Users();
		u5.setUname("马奇");


		t1.getUserSet().add(u1);
		t1.getUserSet().add(u2);
		t1.getUserSet().add(u3);
		t2.getUserSet().add(u4);
		t2.getUserSet().add(u5);

		session.save(t1);
		session.save(t2);

		session.save(u1);
		session.save(u2);
		session.save(u3);
		session.save(u4);
		session.save(u5);

		session.getTransaction().commit();

		session.close();
	}

	public void OneMany2Update(){

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		session.beginTransaction();

		//把UsersType里面id=1的类型(普通会员)改为2(vip会员)
		//UsersType
		//typeId     typeNname
		// 1                              普通会员
		// 2          VIP会员

		//Users
		//uid     uname     tid
		// 1                    张三                     1	--改为-->  2
		// 2                    李四                     1
		// 3                    王五                     1
		// 4                    赵六                     2
		// 5                    马奇                     2
		Users u = (Users)session.get(Users.class,1);

		UsersType t1 = (UsersType)session.get(UsersType.class,1);
		UsersType t2 = (UsersType)session.get(UsersType.class,1);

		System.out.println("bef: t1.size = " + t1.getUserSet().size());
		System.out.println("bef: t2.size = " + t2.getUserSet().size());

		t1.getUserSet().remove(u);
		t2.getUserSet().add(u);

		session.update(t2);

		session.getTransaction().commit();

		session.close();

		System.out.println("after: t1.size = " + t1.getUserSet().size());
		System.out.println("after: t2.size = " + t2.getUserSet().size());
	}

	public void OneMany3Delete(){
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();

		//删除UsersTypeid=1的值,结果UsersType id=1  的值删除,Users tid的值为null

		UsersType t1 = (UsersType)session.get(UsersType.class, 1); //推荐

//		UsersType t1 = new UsersType();
//		t1.setTypeId(2);

		session.delete(t1);

		session.getTransaction().commit();
		session.close();

	}

	public void OneMany4Select(){
		Session session = new Configuration().configure().buildSessionFactory().openSession();

		//把UsersType id=1对应的Users值查出来，即 张三,李四,王五
		UsersType t1 = (UsersType)session.get(UsersType.class, 1);

		System.out.println(t1.getTypeName());
		System.out.println("该分类的用户：");

		for (Users u: t1.getUserSet()) {
			System.out.println("\t"+u.getUid()+"\t"+ u.getUname());
		}

		session.close();
	}

	public static void main(String[] args){

		Operation op = new Operation();
		op.One1Save();
		op.One1Update();
		//op.One3Delete();
		op.Many1Save();
		//op.Many1Update();
		//op.Many3Delete();
		//op.OneMany1Save();
		//op.OneMany2Update();
		//op.OneMany3Delete();
		//op.OneMany4Select();






	}
}
