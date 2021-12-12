diff --git a/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/console/ConsoleMetaData.java b/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/console/ConsoleMetaData.java
index cdfa2ce..b1c0066 100644
--- a/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/console/ConsoleMetaData.java
+++ b/subprojects/native/src/main/java/org/gradle/internal/nativeintegration/console/ConsoleMetaData.java
@@ -32,5 +32,5 @@
      *
      * @return The number of columns available in the console. If no information is available return 0.
      */
-    public int getCols();
+    int getCols();
 }
