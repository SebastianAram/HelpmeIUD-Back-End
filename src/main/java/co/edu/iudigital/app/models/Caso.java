package co.edu.iudigital.app.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Table(name = "casos")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Caso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_hora")
    LocalDateTime fechaHora;

    @Column(name = "latitud")
    Float latitud;

    @Column(name = "longitud")
    Float longitud;

    @Column(name = "altitud")
    Float altitud;

    @Column(name = "is_visible")
    Boolean isVisible;

    @Column(name = "detalle")
    String detalle;

    @Column(name = "url_map")
    String urlMap;

    @Column(name = "rmi_url")
    String rmiUrl;

    @ManyToOne
    @JoinColumn(name = "delitos_id")
    Delito delito;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    Usuario usuario;
}
