package logica;



import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "nickname")
public class Turista extends Usuario implements Serializable {
    private String nacionalidad;
    @OneToMany(mappedBy="turista")
    private List<Compra> listaCompras;
    @OneToMany(mappedBy="turista")
    private List<Inscripcion> listaInscripcion;
    @ElementCollection
    private List<String> listaActividadesFavoritas;

    
    public Turista(){
    super();
    }
    public Turista(String nickname, String contrasenia, String nombre, String apellido, String correo, Date fNacimiento) {
        super(nickname, nombre, apellido, contrasenia, correo, fNacimiento);
    }
    

    public Turista(String nacionalidad, List<Compra> listaCompras, List<Inscripcion> listaInscripcion, List<String> listaActividadesFavoritas, String nickname, String contrasenia, String nombre, String apellido, String correo, Date fNacimiento, List<String> listaUsuariosFavoritos) {
        super(nickname, contrasenia, nombre, apellido, correo, fNacimiento, listaUsuariosFavoritos);
        this.nacionalidad = nacionalidad;
        this.listaCompras = listaCompras;
        this.listaInscripcion = listaInscripcion;
        this.listaActividadesFavoritas = listaActividadesFavoritas;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Inscripcion> getListaInscripcion() {
        return listaInscripcion;
    }

    public void setListaInscripcion(List<Inscripcion> listaInscripcion) {
        this.listaInscripcion = listaInscripcion;
    }
    
    public List<String> getListaActividadesFavoritas() {
        return listaActividadesFavoritas;
    }

    public void setListaActividadesFavoritas(List<String> listaActividadesFavoritas) {
        this.listaActividadesFavoritas = listaActividadesFavoritas;
    }
    


}

