diff --git a/core/java/com/android/internal/app/procstats/SparseMappingTable.java b/core/java/com/android/internal/app/procstats/SparseMappingTable.java
index cd4f7b6..76102af 100644
--- a/core/java/com/android/internal/app/procstats/SparseMappingTable.java
+++ b/core/java/com/android/internal/app/procstats/SparseMappingTable.java
@@ -629,7 +629,7 @@
      * this is an eng build.)
      */
     private static void logOrThrow(String message, Throwable th) {
-        Slog.wtf(TAG, message, th);
+        Slog.e(TAG, message, th);
         if (Build.TYPE.equals("eng")) {
             throw new RuntimeException(message, th);
         }
