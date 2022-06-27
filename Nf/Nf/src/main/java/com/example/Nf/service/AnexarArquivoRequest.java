package com.example.Nf.service;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RetornoConsulta",namespace="http://www.prefeitura.sp.gov.br/nfe")
public class AnexarArquivoRequest {
    private String arquivoBase64;

    public String getArquivoBase64() { return arquivoBase64; }
    public void setArquivoBase64(String arquivoBase64) { this.arquivoBase64 = arquivoBase64; }
    @Getter
    @Setter
    @ToString
    @XmlRootElement(name = "RetornoConsulta",namespace="http://www.prefeitura.sp.gov.br/nfe")
    public static class Base64DTOForm {
        //@JsonProperty("apikey")
        public String ApiKey;
        public String getApiKey() { return ApiKey; }
        public void setApiKey(String ApiKey) { this.ApiKey = ApiKey; }
        @JsonProperty("email")
        public String Email;
        public String getEmail() { return Email; }
        public void setEmail(String ApiKey) { this.Email = Email; }
        @JsonProperty("xmltype")
        public String XmlType;
        public String getXmlType() { return XmlType; }
        public void setXmlType(String XmlType) { this.XmlType = XmlType; }
        @JsonProperty("take")
        public float Take;
        public float getTake() { return Take; }
        public void setTake(Float Take) { this.Take = Take; }
        @JsonProperty("skip")
        public float Skip;
        public float getSkip() { return Skip; }
        public void setSkip(Float Skip) { this.Skip = Skip; }
        @JsonProperty("dataInicio")
        public String DataInicio;
        public String getDataInicio() { return DataInicio; }
        public void setDataInicio(String DataInicio) { this.DataInicio = DataInicio; }
        @JsonProperty("dataFim")
        public String DataFim;
        public String getDataFim() { return DataFim; }
        public void setDataFim(String DataFim) { this.DataFim = DataFim; }
        @JsonProperty("cnpjEmit")
        public String CnpjEmit;
        public String getCnpjEmit() { return CnpjEmit; }
        public void setCnpjEmit(String CnpjEmit) { this.CnpjEmit = CnpjEmit; }
        @JsonProperty("cnpjDest")
        public String CnpjDest;
        public String getCnpjDest() { return CnpjDest; }
        public void setCnpjDest(String CnpjDest) { this.CnpjDest = CnpjDest; }
        @JsonProperty("cnpjRem")
        public String CnpjRem;
        public String getCnpjRem() { return CnpjRem; }
        public void setCnpjRem(String CnpjRem) { this.CnpjRem = CnpjRem; }
        @JsonProperty("cnpjTom")
        public String CnpjTom;
        public String getCnpjTom() { return CnpjTom; }
        public void setCnpjTom(String ACnpjTom) { this.CnpjTom = CnpjTom; }
        @JsonProperty("downloadevent")
        public boolean Downloadevent;
        public boolean getDownloadevent() { return Downloadevent; }
        public void setDownloadevent(Boolean Downloadevent) { this.Downloadevent = Downloadevent; }
    }

}