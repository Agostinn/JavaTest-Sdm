public class Produto {

    private Long id;
    private String descricaoprod;

    //Getters 
    public Long getId() {
        return id;
    }
    public String getDescricaoprod() {
        return descricaoprod;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setDescricaoprod(String descricaoprod) {
        this.descricaoprod = descricaoprod;
    }

    //Construction
    public Produto(Long id, String descricaoprod) {
        this.id = id;
        this.descricaoprod = descricaoprod;
    }

    //Default Construction
    public Produto() {
    }
    
    //Metodo ToString
    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricaoprod=" + descricaoprod + "]";
    }

     //Hash e Equals 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((descricaoprod == null) ? 0 : descricaoprod.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (descricaoprod == null) {
            if (other.descricaoprod != null)
                return false;
        } else if (!descricaoprod.equals(other.descricaoprod))
            return false;
        return true;
    }
}
