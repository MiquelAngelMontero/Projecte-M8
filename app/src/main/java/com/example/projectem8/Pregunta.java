package com.example.projectem8;

public class Pregunta {

    private String pregunta;
    private String correcta;
    private String[] respostes = new String[4];
    private String imatge;

    public Pregunta(String pregunta, String correcta, String[] respostes, String imatge) {
        this.pregunta = pregunta;
        this.correcta = correcta;
        this.respostes = respostes;
        this.imatge = imatge;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public String[] getRespostes() {
        return respostes;
    }

    public void setRespostes(String[] respostes) {
        this.respostes = respostes;
    }

    public String getImatge() { return imatge; }

    public void setImatge(String imatge) { this.imatge = imatge; }
}
