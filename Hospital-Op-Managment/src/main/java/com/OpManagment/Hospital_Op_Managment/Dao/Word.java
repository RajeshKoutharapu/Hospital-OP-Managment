package com.OpManagment.Hospital_Op_Managment.Dao;

import jakarta.persistence.*;

@Entity
@Table(name = "ward")
public class Word {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String wardName;
    private Integer totalBeds;
    private Integer occupiedBeds;

    public Word() {}

    public Word(Integer id, String wardName, Integer totalBeds, Integer occupiedBeds) {
        this.id = id;
        this.wardName = wardName;
        this.totalBeds = totalBeds;
        this.occupiedBeds = occupiedBeds;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getWardName() { return wardName; }
    public void setWardName(String wardName) { this.wardName = wardName; }

    public Integer getTotalBeds() { return totalBeds; }
    public void setTotalBeds(Integer totalBeds) { this.totalBeds = totalBeds; }

    public Integer getOccupiedBeds() { return occupiedBeds; }
    public void setOccupiedBeds(Integer occupiedBeds) { this.occupiedBeds = occupiedBeds; }

    public int getAvailableBeds() {
        return totalBeds - occupiedBeds;
    }

    @Override
    public String toString() {
        return "Ward [id=" + id + ", wardName=" + wardName + ", totalBeds=" + totalBeds + ", occupiedBeds=" + occupiedBeds + "]";
    }
}
