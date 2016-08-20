package com.tesco.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.tesco.pojo.ProductAssets;

public class InsertionXml {

	public static void main(String[] args) {
		try {

			File file = new File("C:\\Users\\Ashish Agarwal\\workspace\\JaxbExample\\sample.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(ProductAssets.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ProductAssets productAssets = (ProductAssets) jaxbUnmarshaller.unmarshal(file);
			System.out.println(productAssets.toString());

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }


	}

}
