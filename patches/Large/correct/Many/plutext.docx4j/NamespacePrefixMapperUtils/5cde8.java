diff --git a/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java b/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java
index 9133261..4a7508d 100644
--- a/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java
+++ b/src/main/java/org/docx4j/jaxb/NamespacePrefixMapperUtils.java
@@ -159,7 +159,7 @@
 		Marshaller m=testContext.createMarshaller();
 		
 		if (isJava9orLater()) {
-			return tryUsingRI(m);			
+			return tryRIforRelationshipsPart(m);			
 		}
 		
 //		(new Throwable()).printStackTrace();
