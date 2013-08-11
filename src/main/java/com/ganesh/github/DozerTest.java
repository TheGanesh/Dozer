package com.ganesh.github;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class DozerTest {
  public static void main(String[] args) {

    List<String> mappingFiles = new ArrayList<String>();
    mappingFiles.add("dozer-mappings.xml");
    DozerBeanMapper mapper = new DozerBeanMapper();
    mapper.setMappingFiles(mappingFiles);

    SourceObject sourceObject = new SourceObject();
    sourceObject.setName("Ganesh");
    sourceObject.setAge(28);
    sourceObject.setCity("Richfield");

    DestinationObject destObject = mapper.map(sourceObject, DestinationObject.class);

    System.out.println("Peru:" + destObject.getPeru());
    System.out.println("Ooru:" + destObject.getOoru());
    System.out.println("Vayasu:" + destObject.getVayasu());

  }
}
