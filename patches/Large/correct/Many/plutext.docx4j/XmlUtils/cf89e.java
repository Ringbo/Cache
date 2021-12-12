diff --git a/src/main/java/org/docx4j/XmlUtils.java b/src/main/java/org/docx4j/XmlUtils.java
index eeab6b3..b5e5f32 100644
--- a/src/main/java/org/docx4j/XmlUtils.java
+++ b/src/main/java/org/docx4j/XmlUtils.java
@@ -644,14 +644,14 @@
 	
 	public static Object unmarshallFromTemplate(String wmlTemplateString, 
 			java.util.Map<String, ?> mappings, JAXBContext jc) throws JAXBException {
-	    String wmlString = replace(wmlTemplateString, 0, new StringBuilder(), mappings).toString();
+	    String wmlString = replace(wmlTemplateString, new StringBuilder(), mappings).toString();
 	    log.debug("Results of substitution: " + wmlString);
 	    return unmarshalString(wmlString, jc);
 	 }
 	
 	public static Object unmarshallFromTemplate(String wmlTemplateString, 
 			java.util.Map<String, ?> mappings, JAXBContext jc, Class<?> declaredType) throws JAXBException {
-	      String wmlString = replace(wmlTemplateString, 0, new StringBuilder(), mappings).toString();
+	      String wmlString = replace(wmlTemplateString, new StringBuilder(), mappings).toString();
 	      return unmarshalString(wmlString, jc, declaredType);
 	   }
 	
