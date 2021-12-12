diff --git a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java b/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java
index 4527726..4d2b00e 100644
--- a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java
+++ b/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsApplication.java
@@ -211,7 +211,7 @@
 
     protected Map loadMetadata() {
         final Properties meta = new Properties();
-        Resource r = new ClassPathResource(PROJECT_META_FILE);
+        Resource r = new ClassPathResource(PROJECT_META_FILE, getClassLoader());
         try {
             meta.load(r.getInputStream());
         }
