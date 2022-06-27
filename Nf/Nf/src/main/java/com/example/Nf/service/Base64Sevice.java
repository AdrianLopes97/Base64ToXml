package com.example.Nf.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import static java.nio.charset.StandardCharsets.UTF_8;


public class Base64Sevice {

    //Url do Sieg para efetuar requisições
    public static String API_URL = "https://api.sieg.com/aws/api-xml-search.ashx";

    //Estrutura de requisições contendo conexão e corpo
    public static String SendRequest() {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            MediaType mediaType = MediaType.parse("application/json");


            String bodyToJson = "{\"apikey\":\"zXj9tDazIEXU5okaGAeTdQ==\",\n" +
                    "                    \"email\":\"nelson.chieregato@sp.senac.br\",\n" +
                    "                    \"xmltype\":\"nfse\",\n" +
                    "                    \"take\":1,\n" +
                    "                    \"skip\":0,\n" +
                    "                    \"dataInicio\":\"2022-06-23\",\n" +
                    "                    \"dataFim\":\"2022-06-23\"\n" +
                    "                        }";

            RequestBody requestBody = RequestBody.create(mediaType, bodyToJson);

            Request request = new Request.Builder()
                    .url(API_URL)
                    .method("POST", requestBody)
                    .build();
            Response response = client.newCall(request).execute();
            String responseApi = response.body().string();
            //Transformando Json em objeto
            JSONObject jsonObject = new JSONObject(responseApi);
            //Puxar arrays de xmls
            String base64 = jsonObject.getJSONArray("xmls").get(0).toString();
            byte[] asBytes = Base64.getDecoder().decode(base64);
            //Conversor de base64 para xml
            String decodedXml = new String(asBytes,(UTF_8));
            JAXBContext jaxbContext = JAXBContext.newInstance(AnexarArquivoRequest.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            AnexarArquivoRequest rapidPerformance = (AnexarArquivoRequest) unmarshaller.unmarshal(new StringReader(decodedXml));
            Path path = Path.of("C:\\Users\\gabri\\Desktop\\XML Txt\\output.txt");
            Files.createFile(path);
            Files.writeString(path, decodedXml);
            System.out
                   .println(rapidPerformance);
            return responseApi;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}