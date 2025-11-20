package dam.saruman.entity;

import jakarta.persistence.*;

@Entity
@Table(name="enemigos")
public class Enemigo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String genero;

    @Column
    private String pais_origen;

    @Column
    private Integer nivel_amenaza;

    @Column
    private boolean activo;

    public Enemigo() {
    }

    public Enemigo(Long id, String nombre, String genero, String pais_origen, Integer nivel_amenaza, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pais_origen = pais_origen;
        this.nivel_amenaza = nivel_amenaza;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public Integer getNivel_amenaza() {
        return nivel_amenaza;
    }

    public void setNivel_amenaza(Integer nivel_amenaza) {
        this.nivel_amenaza = nivel_amenaza;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
