diff --git a/subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java b/subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java
index 0c66276..8cd6a72 100644
--- a/subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java
+++ b/subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java
@@ -128,7 +128,7 @@
             };
             GroovyCategorySupport.use(ServletCategory.class, closure);
         } catch (RuntimeException runtimeException) {
-            StringBuffer error = new StringBuffer("GroovyServlet Error: ");
+            StringBuilder error = new StringBuilder("GroovyServlet Error: ");
             error.append(" script: '");
             error.append(scriptUri);
             error.append("': ");
