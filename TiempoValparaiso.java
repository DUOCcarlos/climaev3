package org.apache.beam.examples;

public class TiempoConcepcion {

    private String id;
    private String location;
    private String day;
    private String nombredia;
    private String diadescripcion;
    private String maxtemp;
    private String mintemp;
    private String humedad;
    private String presionatm;
    private String rain;
    private String hora;
    private String velocidadviento;
    private String direccionviento;
    private String nubosidad;
    private String indiceuv;

    public void setId(String id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setNombre_dia(String nombre_dia) {
        this.nombredia = nombre_dia;
    }

    public void setDia_descripcion(String dia_descripcion) {
        this.diadescripcion = dia_descripcion;
    }

    public void setMaxtemp(String maxtemp) {
        this.maxtemp = maxtemp;
    }

    public void setMintemp(String mintemp) {
        this.mintemp = mintemp;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public void setPresion_atm(String presion_atm) {
        this.presionatm = presion_atm;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setVelocidad_viento(String velocidad_viento) {
        this.velocidadviento = velocidad_viento;
    }

    public void setDireccion_viento(String direccion_viento) {
        this.direccionviento = direccion_viento;
    }

    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    public void setIndice_uv(String indice_uv) {
        this.indiceuv = indice_uv;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getDay() {
        return day;
    }

    public String getNombre_dia() {
        return nombredia;
    }

    public String getDia_descripcion() {
        return diadescripcion;
    }

    public String getMaxtemp() {
        return maxtemp;
    }

    public String getMintemp() {
        return mintemp;
    }

    public String getHumedad() {
        return humedad;
    }

    public String getPresion_atm() {
        return presionatm;
    }

    public String getRain() {
        return rain;
    }

    public String getHora() {
        return hora;
    }

    public String getVelocidad_viento() {
        return velocidadviento;
    }

    public String getDireccion_viento() {
        return direccionviento;
    }

    public String getNubosidad() {
        return nubosidad;
    }

    public String getIndice_uv() {
        return indiceuv;
    }

    @Override
    public String toString() {
        return "TiempoConcepcion{" + "id=" + id + ", location=" + location + ", day=" + day + ", nombre_dia=" + nombredia + ", dia_descripcion=" + diadescripcion + ", maxtemp=" + maxtemp + ", mintemp=" + mintemp + ", humedad=" + humedad + ", presion_atm=" + presionatm + ", rain=" + rain + ", hora=" + hora + ", velocidad_viento=" + velocidadviento + ", direccion_viento=" + direccionviento + ", nubosidad=" + nubosidad + ", indice_uv=" + indiceuv + '}';
    }
    
    public String toCSV(){
         return "" + id + "," + location + "," + day + "," + nombredia + "," + diadescripcion + "," + maxtemp + "," + mintemp + "," + humedad + "," +
                presionatm + "," + rain + "," + hora + "," + velocidadviento + "," + direccionviento + "," + nubosidad + "," + indiceuv + "";
    }
    

}
    
    
