diff --git a/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java b/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java
index ef4c6ff..798b741 100644
--- a/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java
+++ b/camel-core/src/test/java/org/apache/camel/ContextTestSupport.java
@@ -49,7 +49,7 @@
         context.stop();
     }
 
-    protected CamelContext createCamelContext() {
+    protected CamelContext createCamelContext() throws Exception {
         return new DefaultCamelContext();
     }
 
