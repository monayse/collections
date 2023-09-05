package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
private static String descricao;
	//atributo
	private List<Tarefa> tarefalist;

public ListaTarefa() {
	super();
	this.tarefalist = new ArrayList<>();
}
	
public void adicionarTarefa(String descricao) {
	tarefalist.add(new Tarefa(descricao));
	
}
public void removerTarefa(String descricao) {
	List<Tarefa> tarefasParaRemover = new ArrayList<>();
	for(Tarefa t : tarefalist) {
		if(t.getDescricao().equalsIgnoreCase(descricao)) {
			tarefasParaRemover.add(t);
		}
		
	}
	tarefalist.removeAll(tarefasParaRemover);
}

public int obterNumeroTotalTarefas() {
	return tarefalist.size();
}

public void obterDescricaoTarefas() {
	System.out.println(tarefalist);
}
public static void main(String[] args) {
	ListaTarefa listaTarefa = new ListaTarefa();
	
	System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

}


}