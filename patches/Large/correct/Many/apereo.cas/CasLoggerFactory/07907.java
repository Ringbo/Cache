diff --git a/cas-server-core-logging/src/main/java/org/slf4j/impl/CasLoggerFactory.java b/cas-server-core-logging/src/main/java/org/slf4j/impl/CasLoggerFactory.java
index f3e1c62..39809e2 100644
--- a/cas-server-core-logging/src/main/java/org/slf4j/impl/CasLoggerFactory.java
+++ b/cas-server-core-logging/src/main/java/org/slf4j/impl/CasLoggerFactory.java
@@ -118,7 +118,7 @@
         }
     }
 
-    private ILoggerFactory getLoggerFactoryBeInstantiated(final Class<? extends ILoggerFactory> loggerFactory) {
+    private static ILoggerFactory getLoggerFactoryBeInstantiated(final Class<? extends ILoggerFactory> loggerFactory) {
         try {
             return loggerFactory.newInstance();
         } catch (final Exception e) {
