package service;

import entities.Author;

public interface AuthorService {
	public abstract Author getauthorById(int id);
    public abstract void addauthor(Author author);
    public abstract void updateauthor(Author author);
    public abstract void removeauthor(Author author);
}