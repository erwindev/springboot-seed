package com.erwindev.nameofproject.service

import org.springframework.transaction.annotation.Transactional
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
class ServiceTest {
	public void "magic"() {
		given:
			boolean davidCopperfield = true

		when:
			boolean magic = true

		then:
			davidCopperfield == magic
	}
}
