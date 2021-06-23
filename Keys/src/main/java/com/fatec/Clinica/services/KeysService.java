package com.fatec.Clinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.Clinica.model.ClinicaKeys;
import com.fatec.Clinica.repository.KeysRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class KeysService {
	@Autowired
	private KeysRepository repository;

	public ClinicaKeys SearchById(Long id) throws ObjectNotFoundException {
		Optional<ClinicaKeys> key = repository.findById(id);
		return key.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado!"));
	}

	public ClinicaKeys InsertKey(long idCliente, String keyCliente, String keyCpf, String keyEdereco) {
		ClinicaKeys clienteKeys = new ClinicaKeys();
		clienteKeys.setIdCliente(idCliente);
		clienteKeys.setKeyCliente(keyCliente);
		clienteKeys.setKeyCpf(keyCpf);
		clienteKeys.setKeyEndereco(keyEdereco);
		repository.save(clienteKeys);
		return clienteKeys;
	}
	public ClinicaKeys InsertKey(ClinicaKeys keys) {
		repository.save(keys);
		return keys;
	}

	public void Deletar(Long id) throws ObjectNotFoundException {
		repository.deleteById(id);
	}

	public List<ClinicaKeys> buscarKeysToList() {
		List<ClinicaKeys> lista = repository.findAll();
		return lista;
	}

	public String buscarKeysToCliente(Long id) {
		String clienteKey = "";
		String cpfKey = "";
		String cpfEndereco = "";
		List<ClinicaKeys> lista = repository.findAll();
		for (ClinicaKeys key : lista) {
			if (key.idCliente == id) {
				clienteKey = key.getKeyCliente();
				cpfKey = key.getKeyCpf();
				cpfEndereco = key.getKeyEndereco();
			}
		}
		return clienteKey + " " + cpfKey + " " + cpfEndereco;
	}

}
