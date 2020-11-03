package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;

public interface IContratService {

	Contrat ajouterContrat(Contrat contrat);

	Contrat getContratByRef(int contratRef);

	void affecterContratAEmploye(int contratId, int employeId);

	Contrat updateContrat(Contrat contrat);

	List<Contrat> getAllContrats();

	void deleteContratByRef(int i);

}
