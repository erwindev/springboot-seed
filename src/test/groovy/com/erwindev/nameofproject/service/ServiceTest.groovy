package com.erwindev.nameofproject.service

import static org.assertj.core.api.Assertions.assertThat

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.boot.test.mock.mockito.MockBean

import com.erwindev.nameofproject.service.ClassroomService

@RunWith(SpringRunner.class)
@SpringBootTest
class ServiceTest {

	@TestConfiguration
	static class ClassroomServiceImplTestContextConfiguration {

			@Bean
			public ClassroomService classroomService() {
					return new ClassroomService()
			}
	}

	@Autowired
	ClassroomService classroomService

	@Test
	public void whoAmIShouldReturnMessageFromService() throws Exception{
		assertThat(classroomService.whoAmI(), is('ClassroomService'))
	}
}
