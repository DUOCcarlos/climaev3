package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.beam.examples.TiempoValparaiso;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JsonUrlReader2 {

    public JsonUrlReader2() {

    }

    public static void main(String[] args) throws DatabindException, MalformedURLException, IOException {
        JsonUrlReader2 j = new JsonUrlReader2();
        ArrayList<TiempoValparaiso> Atp = j.cargarURLx();

        for (TiempoValparaiso tp : Atp) {
            System.out.println(tp);
        }
    }

    public ArrayList<TiempoValparaiso> cargarURLx() throws StreamReadException, DatabindException, MalformedURLException, IOException {
        String url = "http://api.meteored.cl/index.php?api_lang=cl&localidad=18577&affiliate_id=slcauwgr8469&v=3.0";
        ArrayList<TiempoValparaiso> tpa = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode elementos = mapper.readTree(new URL(url));
        JsonNode dia = elementos.get("day");
        Integer id = 1;
        for (int i = 1; i <= 5; i++) {
            String almacen_dia = Integer.toString(i);
            JsonNode almacen_dia_datos = dia.get(almacen_dia);
            JsonNode horas = almacen_dia_datos.get("hour");
            if (horas.isArray()) {
                for (JsonNode hora : horas) {
                    JsonNode viento = hora.get("wind");
                    TiempoValparaiso tp = new TiempoValparaiso();//aqui hay que crear una clase tiempo concepcion
                    tp.setId(Integer.toString(id));
                    tp.setLocation(elementos.get("location").asText());
                    tp.setDay(almacen_dia_datos.get("date").asText());
                    tp.setNombre_dia(almacen_dia_datos.get("name").asText());
                    tp.setDia_descripcion(hora.get("symbol_description").asText());
                    tp.setMaxtemp(almacen_dia_datos.get("tempmax").asText());
                    tp.setMintemp(almacen_dia_datos.get("tempmin").asText());
                    tp.setHumedad(hora.get("humidity").asText());
                    tp.setPresion_atm(hora.get("pressure").asText());
                    tp.setRain(hora.get("rain").asText());
                    tp.setHora(hora.get("interval").asText());
                    tp.setVelocidad_viento(viento.get("speed").asText());
                    tp.setDireccion_viento(viento.get("dir").asText());
                    tp.setNubosidad(hora.get("clouds").asText());
                    tp.setIndice_uv(hora.get("uv_index").asText());
                    
                    tpa.add(tp);
                    id++;
                }
            }

        }

        return tpa;
    }
}
