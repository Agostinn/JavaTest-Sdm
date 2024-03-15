public class Cliente {
    private Long id;
    private String nome;
    private String cpf;

    //Getters
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return cpf;
    }
    
    //Overload Constructor 
    public Cliente(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    //Default Contructor 
    public Cliente() {
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }        
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    //Move this object toString 
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
    }

    //HashCode e Equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }   

    
    
}
