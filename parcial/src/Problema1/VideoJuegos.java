package Problema1;

public enum VideoJuegos {
    DEPORTIVOS("fifa","control","2023"){
        @Override
        public String mostrarPosicionRanking() {
            return "bueno";
        }

        @Override
        public String comprarMonedas() {
            return "bueno";
        }
    },
    ESTRATEGIA("ajedrez","moviendofichas","934"){
        @Override
        public String mostrarPosicionRanking() {
            return "bueno";
        }

        @Override
        public String comprarMonedas() {
            return "bueno";
        }
    },
    MUSICALES("guitarhero","guitarra","2000"){
        @Override
        public String mostrarPosicionRanking() {
            return "daddy";
        }

        @Override
        public String comprarMonedas() {
            return "mon";
        }
    },
    AVENTURA("ratchetyclank","control","2014"){
        @Override
        public String mostrarPosicionRanking() {
            return "ok";
        }

        @Override
        public String comprarMonedas() {
            return "ok";
        }
    },
    SIMULACION("bussimulator","gafas de realidad virtual","2019"){
        @Override
        public String mostrarPosicionRanking() {
            return "excelente";
        }

        @Override
        public String comprarMonedas() {
            return "excelente";
        }
    };

    private String nombrejuego;
    private String comojugar;
    private String añodecreacion;

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public String getComojugar() {
        return comojugar;
    }

    public void setComojugar(String comojugar) {
        this.comojugar = comojugar;
    }

    public String getAñodecreacion() {
        return añodecreacion;
    }

    public void setAñodecreacion(String añodecreacion) {
        this.añodecreacion = añodecreacion;
    }

    VideoJuegos(String nombrejuego, String comojugar, String añodecreacion) {
        this.nombrejuego = nombrejuego;
        this.comojugar = comojugar;
        this.añodecreacion = añodecreacion;

    }
    public abstract String mostrarPosicionRanking();
    public abstract String comprarMonedas();
}


