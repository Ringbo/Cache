diff --git a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
index f758230..be93305 100644
--- a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
+++ b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
@@ -276,7 +276,7 @@
         }
         javaClass.getJavaDoc().setFullText(doc);
 
-        String prefix = "camel.dataformat." + model.getModelName();
+        String prefix = "camel.dataformat." + model.getName();
         javaClass.addAnnotation("org.springframework.boot.context.properties.ConfigurationProperties").setStringValue("prefix", prefix);
 
         for (DataFormatOptionModel option : model.getDataFormatOptions()) {
