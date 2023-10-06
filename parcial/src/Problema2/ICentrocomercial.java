package Problema2;

import java.io.IOException;
import java.util.List;

public interface ICentrocomercial {
    CentroComercialDTO findById(int id);
    List<CentroComercialDTO> findAll() throws IOException, ClassNotFoundException;
    void save(CentroComercialDTO CentroComercial) throws IOException, ClassNotFoundException;
    void update(CentroComercialDTO CentroComercial) throws IOException, ClassNotFoundException;
    void delete(CentroComercialDTO CentroComercial) throws IOException, ClassNotFoundException;
}
