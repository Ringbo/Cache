diff --git a/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java b/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
index 467abc7..0186a01 100644
--- a/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
+++ b/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
@@ -677,7 +677,7 @@
         Object result = Templates.combineTemplates(kubernetesList);
         if (result instanceof Template) {
             Template resultTemplate = (Template) result;
-            configureTemplateDescriptionAndIcon(template, iconUrl);
+            configureTemplateDescriptionAndIcon(resultTemplate, iconUrl);
         }
 
         try {
