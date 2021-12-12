diff --git a/core/camel-api/src/main/java/org/apache/camel/support/jsse/JsseParameters.java b/core/camel-api/src/main/java/org/apache/camel/support/jsse/JsseParameters.java
index a3fb50b4..1f9c3c0 100644
--- a/core/camel-api/src/main/java/org/apache/camel/support/jsse/JsseParameters.java
+++ b/core/camel-api/src/main/java/org/apache/camel/support/jsse/JsseParameters.java
@@ -162,7 +162,7 @@
 
         if (is == null) {
             LOG.trace("Trying to open resource [{}] as a class path resource using the classloader [{}].",
-                      this.getClass().getClassLoader());
+                      resource, this.getClass().getClassLoader());
             is = this.getClass().getResourceAsStream(resource);
             
             if (is == null) {
