package Problema2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CentrocomercialServiceimpl {
    ;


        private List<CentroComercialDTO> veterinarias;

        public CentrocomercialServiceimpl() throws IOException, ClassNotFoundException {
            veterinarias = new ArrayList<>();
        }

        @Override
        public CentroComercialDTO findById(int id) {
            return veterinarias.stream()
                    .filter(producto -> producto.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<CentroComercialDTO> findAll() throws IOException, ClassNotFoundException {
            veterinarias = (List<CentroComercialDTO>) ServiceCentrocomercial.readObjectFromFile("productos.ax");
            return veterinarias;
        }

        @Override
        public void save(CentroComercialDTO Centrocomercial) throws IOException {
            veterinarias.add(Centrocomercial);
            ServiceCentrocomercial.writeObjectToFile(veterinarias, "productos.ax");
        }

        @Override
        public void update(CentroComercialDTO Centrocomercial) throws IOException {
            CentroComercialDTO oldveterinaria = findById(Centrocomercial.getId());
            if (oldveterinaria != null) {
                Centrocomercial.remove(oldveterinaria);
                Centrocomercial.add(Centrocomercial);
                ServiceCentrocomercial.writeObjectToFile(veterinarias, "productos.ax");
            }
        }

        @Override
        public void delete(CentrocomercialServiceimpl Centrocomercial) throws IOException {
            veterinarias.remove(Centrocomercial);
            ServiceCentrocomercial.writeObjectToFile(Centrocomercial, "productos.ax");
        }
    }


