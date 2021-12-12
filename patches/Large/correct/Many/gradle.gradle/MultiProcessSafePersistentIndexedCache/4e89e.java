diff --git a/subprojects/core/src/main/groovy/org/gradle/cache/internal/MultiProcessSafePersistentIndexedCache.java b/subprojects/core/src/main/groovy/org/gradle/cache/internal/MultiProcessSafePersistentIndexedCache.java
index 298310b..8006d0e 100644
--- a/subprojects/core/src/main/groovy/org/gradle/cache/internal/MultiProcessSafePersistentIndexedCache.java
+++ b/subprojects/core/src/main/groovy/org/gradle/cache/internal/MultiProcessSafePersistentIndexedCache.java
@@ -76,7 +76,7 @@
     public void close() {
         if (cache != null) {
             try {
-                fileAccess.updateFile(new Runnable() {
+                fileAccess.writeFile(new Runnable() {
                     public void run() {
                         cache.close();
                     }
