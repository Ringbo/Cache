diff --git a/src/commons/org/codehaus/groovy/grails/compiler/GrailsClassLoader.java b/src/commons/org/codehaus/groovy/grails/compiler/GrailsClassLoader.java
index 3ed403a..3fa80d1 100644
--- a/src/commons/org/codehaus/groovy/grails/compiler/GrailsClassLoader.java
+++ b/src/commons/org/codehaus/groovy/grails/compiler/GrailsClassLoader.java
@@ -56,7 +56,7 @@
 
             try {
                 inputStream = resourceURL.openStream();
-                Class reloadedClass = innerLoader.parseClass(inputStream);
+                Class reloadedClass = innerLoader.parseClass(inputStream, name);
                 innerClassLoaderMap.put(name, innerLoader);
                 return reloadedClass;
             } catch (IOException e) {
