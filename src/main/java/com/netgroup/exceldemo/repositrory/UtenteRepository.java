package com.netgroup.exceldemo.repositrory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.netgroup.exceldemo.data.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

	@Query(value = "SELECT * FROM utenti WHERE username = ?1", nativeQuery = true)
	Optional<Utente> findByUsername(String user);
}
 