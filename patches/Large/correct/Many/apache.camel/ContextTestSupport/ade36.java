diff --git a/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java b/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java
index df36f85..4f42334 100644
--- a/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java
+++ b/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java
@@ -147,7 +147,7 @@
      * This should only be enabled for tests that uses custom type converters.
      */
     protected boolean isLoadTypeConverters() {
-        return false;
+        return true;
     }
 
     protected void stopCamelContext() throws Exception {
