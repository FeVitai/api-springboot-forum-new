package br.com.alura.forum.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@Profile(value = {"test", "prod"})
class CursoRepositoryTest {
	
	@Autowired
	private CursoRepository repository;
	
	@Autowired
	private TestEntityManager em;

//	@Test
//	public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
//		String nomeCurso = "HTML 5";
//		
//		Curso html5 = new Curso();
//		html5.setNome(nomeCurso);
//		html5.setCategoria("Programacao");
//		em.persist(html5);
//		
//		Curso curso = repository.findByNome(nomeCurso);
//		Assert.assertNotNull(curso);
//		Assert.assertEquals(nomeCurso, curso.getNome());
//	}
//	
//	@Test
//	public void naoDeveriaCarregarUmCursoCujoMomeNaoEstejaCadastrado() {
//		String nomeCurso = "JPA";
//		Curso curso = repository.findByNome(nomeCurso);
//		Assert.assertNull(curso);
//	}

}
