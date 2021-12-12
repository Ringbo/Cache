diff --git a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/support/GrailsRootLoader.java b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/support/GrailsRootLoader.java
index 9084192..feebd5e 100644
--- a/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/support/GrailsRootLoader.java
+++ b/grails-bootstrap/src/main/groovy/org/codehaus/groovy/grails/cli/support/GrailsRootLoader.java
@@ -41,7 +41,7 @@
     @Override
     protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
         try {
-            if(name.startsWith("java.") || name.startsWith("javax.xml.") || name.startsWith("org.w3c.dom.")) {
+            if(name.startsWith("java.") || name.startsWith("javax.xml.") || name.startsWith("org.w3c.dom.") || name.startsWith("org.xml.")) {
                 try {
                     return getParent().loadClass(name);
                 } catch (ClassNotFoundException e) {
