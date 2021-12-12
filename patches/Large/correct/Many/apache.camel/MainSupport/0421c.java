diff --git a/camel-core/src/main/java/org/apache/camel/main/MainSupport.java b/camel-core/src/main/java/org/apache/camel/main/MainSupport.java
index 6ad6830..7dd337e 100644
--- a/camel-core/src/main/java/org/apache/camel/main/MainSupport.java
+++ b/camel-core/src/main/java/org/apache/camel/main/MainSupport.java
@@ -62,11 +62,11 @@
     /**
      * A class for intercepting the hang up signal and do a graceful shutdown of the Camel.
      */
-    private final class HangupInterceptor extends Thread {
+    private static final class HangupInterceptor extends Thread {
         Logger log = LoggerFactory.getLogger(this.getClass());
         final MainSupport mainInstance;
 
-        public HangupInterceptor(MainSupport main) {
+        HangupInterceptor(MainSupport main) {
             mainInstance = main;
         }
 
