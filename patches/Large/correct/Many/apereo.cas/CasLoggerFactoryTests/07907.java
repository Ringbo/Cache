diff --git a/cas-server-core-logging/src/test/java/org/slf4j/impl/CasLoggerFactoryTests.java b/cas-server-core-logging/src/test/java/org/slf4j/impl/CasLoggerFactoryTests.java
index 663dbad..a31fec9 100644
--- a/cas-server-core-logging/src/test/java/org/slf4j/impl/CasLoggerFactoryTests.java
+++ b/cas-server-core-logging/src/test/java/org/slf4j/impl/CasLoggerFactoryTests.java
@@ -322,11 +322,11 @@
         validateLogData();
     }
 
-    private String getMessageToLog() {
+    private static String getMessageToLog() {
         return String.format("Here is one %s and here is another %s", ID1, ID2);
     }
 
-    private String getMessageToLogWithParams() {
+    private static String getMessageToLogWithParams() {
         return "Here is one {} and here is another {}";
     }
 
