package com.huake.edu.repository;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import com.huake.edu.entity.Knowledge;
import com.huake.edu.entity.Outline;
import com.huake.edu.repository.OutlineDao;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
public class OutLineTest extends SpringTransactionalTestCase {

	@Autowired
	private OutlineDao outlineDao;

	@PersistenceContext
	private EntityManager em;

	@Test
	public void testOutLine() {

		Outline outline = new Outline();

		Knowledge knowledge1 = new Knowledge();

		knowledge1.setTitle("111");
		knowledge1.setDescription("学习唐诗");
		knowledge1.setOutline(outline);

		Knowledge knowledge2 = new Knowledge();

		knowledge2.setTitle("1222222");
		knowledge2.setDescription("学习编程");
		knowledge2.setOutline(outline);

		List<Knowledge> knowledges = new ArrayList<Knowledge>();
		knowledges.add(knowledge1);
		knowledges.add(knowledge2);

		outline.setKnowledges(knowledges);
		outline.setLesson("111888");

		outlineDao.save(outline);


		System.out.println(outline.getClass().getName());

	}

	@Test
	public void deleteByLesson() {

		outlineDao.deleteOutlineByLesson("111888");
		System.out.println("ok");

	}

	@Test
	public void findKnow() {

		List<Knowledge> knowledges = outlineDao.findKnowledgeByLesson("111888");
		for (Knowledge knowledge : knowledges) {

			System.out.println(knowledge.getDescription());
		}

	}

}
