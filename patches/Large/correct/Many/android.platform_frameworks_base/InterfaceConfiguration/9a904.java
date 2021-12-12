diff --git a/core/java/android/net/InterfaceConfiguration.java b/core/java/android/net/InterfaceConfiguration.java
index eace8b2..34cde08 100644
--- a/core/java/android/net/InterfaceConfiguration.java
+++ b/core/java/android/net/InterfaceConfiguration.java
@@ -113,7 +113,7 @@
      */
     public boolean isActive() {
         try {
-            if (hasFlag(FLAG_UP)) {
+            if (isUp()) {
                 for (byte b : mAddr.getAddress().getAddress()) {
                     if (b != 0) return true;
                 }
