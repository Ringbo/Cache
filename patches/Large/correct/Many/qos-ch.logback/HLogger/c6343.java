diff --git a/logback-classic/src/test/java/ch/qos/logback/classic/HLogger.java b/logback-classic/src/test/java/ch/qos/logback/classic/HLogger.java
index 9b87830..a9ec26b 100644
--- a/logback-classic/src/test/java/ch/qos/logback/classic/HLogger.java
+++ b/logback-classic/src/test/java/ch/qos/logback/classic/HLogger.java
@@ -87,7 +87,7 @@
     return name;
   }
 
-  private final boolean isRootLogger() {
+  private boolean isRootLogger() {
     // only the root logger has a null parent
     return parent == null;
   }
