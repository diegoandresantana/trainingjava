package dao;

import java.util.List;

public interface InterCrudDAO<E,ID> {
	public E inserir(E entidade) ;
	public E alterar(E entidade) ;
	public E buscarPorID(ID id) ;
	public Integer deletar(ID id) ;
	public List<E> listar() ;
}
