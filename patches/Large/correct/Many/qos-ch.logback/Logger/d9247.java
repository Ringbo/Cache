diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java b/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java
index 1f76864..53c2332 100644
--- a/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java
@@ -236,7 +236,7 @@
   }
 
   public synchronized Iterator iteratorForAppenders() {
-    if (aai != null) {
+    if (aai == null) {
       return Collections.EMPTY_LIST.iterator();
     }
     return aai.iteratorForAppenders();
