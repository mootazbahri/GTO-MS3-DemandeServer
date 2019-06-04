package com.talan.gto.demandeserver.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="DEMANDE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demande implements Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "demande_Sequence")
    @SequenceGenerator(name = "demande_Sequence", sequenceName = "SEQ_DEMANDES")
    private Long id;
	
    @Column(name = "idClient")
    private Long idClient;
    
    @Column(name = "idBureau")
    private Long idBureau;
    
    @Column(name = "idDocument")
    private Long idDocument;
    
    @Column(name = "idTache")
    @Nullable
    private Long idTache;
    
	@JsonFormat(pattern="dd/MM/yyyy")
	@Column(name = "creationDate")
	private Date creationDate;
}
