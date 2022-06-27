package com.example.Nf;

import com.example.Nf.service.AnexarArquivoRequest;
import com.example.Nf.service.Base64Sevice;
import com.google.gson.Gson;
import okhttp3.RequestBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NfApplication {

	public static void main(String[] args) {
		Base64Sevice.SendRequest();
		SpringApplication.run(NfApplication.class, args);
	}

}
