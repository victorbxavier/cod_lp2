package br.ufrn.imd.dao;

import br.ufrn.imd.modelo.Cliente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ClienteDAO {
    private ArrayList<Cliente> clientes;
    private static ClienteDAO cDAO;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    private ClienteDAO() {
        clientes = new ArrayList<Cliente>();
    }

    //Singleton
    public static ClienteDAO getInstance() {
        if (cDAO == null) {
            cDAO = new ClienteDAO();
        }
        return cDAO;
    }

    public int buscaCodigoCliente() {
        if (clientes.isEmpty()) {
            return -1;
        }
        int idUltimoCliente = clientes.get(clientes.size() - 1).getIdCliente();
        return idUltimoCliente;
    }

    public void inserirCliente(Cliente c) {
        clientes.add(c);
    }

    public void listarClientes() {
        String obj = "";
        for (Cliente c : clientes) {
            System.out.println("ID:" + c.getIdCliente());
            System.out.println("Nome:" + c.getNome());
            System.out.println("Data de Nascimento:" + formato.format(c.getData_nasc()));
            System.out.println("CPF:" + c.getCpf());
        }
    }
}
