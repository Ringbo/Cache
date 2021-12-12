diff --git a/core/java/com/android/internal/os/LoggingPrintStream.java b/core/java/com/android/internal/os/LoggingPrintStream.java
index 451340b..f14394a 100644
--- a/core/java/com/android/internal/os/LoggingPrintStream.java
+++ b/core/java/com/android/internal/os/LoggingPrintStream.java
@@ -293,7 +293,7 @@
 
     @Override
     public synchronized void println(String s) {
-        if (builder.length() == 0) {
+        if (builder.length() == 0 && s != null) {
             // Optimization for a simple println.
             int length = s.length();
 
