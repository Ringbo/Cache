diff --git a/compiler/preloader/src/org/jetbrains/jet/preloading/Preloader.java b/compiler/preloader/src/org/jetbrains/jet/preloading/Preloader.java
index 36f3f19..4c32ea9 100644
--- a/compiler/preloader/src/org/jetbrains/jet/preloading/Preloader.java
+++ b/compiler/preloader/src/org/jetbrains/jet/preloading/Preloader.java
@@ -74,7 +74,7 @@
 
     private static boolean parseMeasureTime(String arg) {
         if ("time".equals(arg)) return true;
-        if ("notime".equals(arg)) return true;
+        if ("notime".equals(arg)) return false;
         System.out.println("Unrecognized argument: " + arg);
         printUsageAndExit();
         return false;
