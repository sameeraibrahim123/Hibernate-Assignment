package dao;

import javax.persistence.EntityManager;

import entities.Author;

public class AuthorDaoImpl implements AuthorDao 
{
    private EntityManager em;
    public AuthorDaoImpl()
    {
    	em=JPAUtil.getEntityManager();
    }
    
    @Override
	public void beginTransaction() {
		em.getTransaction().begin();

	}
    
	@Override
	public Author getAuthorById(int id) {
		return em.find(Author.class, id);
	}

	@Override
	public void addAuthor(Author author) {
		em.persist(author);
	}

	@Override
	public void updateAuthor(Author author) {
		em.merge(author);
	}

	@Override
	public void removeAuthor(Author author) {
		em.remove(author);
	}

	

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

	}

}