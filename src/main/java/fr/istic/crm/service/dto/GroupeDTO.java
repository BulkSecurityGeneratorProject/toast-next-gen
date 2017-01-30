package fr.istic.crm.service.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;


/**
 * A DTO for the Groupe entity.
 */
public class GroupeDTO implements Serializable {

    private Long id;

    private String nom;

    private Long dateCreation;

    private Long dateModification;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Long dateCreation) {
        this.dateCreation = dateCreation;
    }
    public Long getDateModification() {
        return dateModification;
    }

    public void setDateModification(Long dateModification) {
        this.dateModification = dateModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GroupeDTO groupeDTO = (GroupeDTO) o;

        if ( ! Objects.equals(id, groupeDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GroupeDTO{" +
            "id=" + id +
            ", nom='" + nom + "'" +
            ", dateCreation='" + dateCreation + "'" +
            ", dateModification='" + dateModification + "'" +
            '}';
    }
}
