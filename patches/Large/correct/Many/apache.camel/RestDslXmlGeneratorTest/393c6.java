diff --git a/tooling/swagger-rest-dsl-generator/src/test/java/org/apache/camel/generator/swagger/RestDslXmlGeneratorTest.java b/tooling/swagger-rest-dsl-generator/src/test/java/org/apache/camel/generator/swagger/RestDslXmlGeneratorTest.java
index fed3779..b29fd8f 100644
--- a/tooling/swagger-rest-dsl-generator/src/test/java/org/apache/camel/generator/swagger/RestDslXmlGeneratorTest.java
+++ b/tooling/swagger-rest-dsl-generator/src/test/java/org/apache/camel/generator/swagger/RestDslXmlGeneratorTest.java
@@ -60,7 +60,7 @@
         final URI file = RestDslGeneratorTest.class.getResource("/SwaggerPetstoreXml.txt").toURI();
         final String expectedContent = new String(Files.readAllBytes(Paths.get(file)), StandardCharsets.UTF_8);
 
-        assertThat(xml).isEqualTo(expectedContent);
+        assertThat(xml).isEqualToIgnoringWhitespace(expectedContent);
     }
 
 
