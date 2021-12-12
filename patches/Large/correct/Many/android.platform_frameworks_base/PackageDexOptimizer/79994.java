diff --git a/services/core/java/com/android/server/pm/PackageDexOptimizer.java b/services/core/java/com/android/server/pm/PackageDexOptimizer.java
index 49639b0..f55d8e7 100644
--- a/services/core/java/com/android/server/pm/PackageDexOptimizer.java
+++ b/services/core/java/com/android/server/pm/PackageDexOptimizer.java
@@ -405,7 +405,8 @@
             boolean newProfile) {
         int dexoptNeeded;
         try {
-            dexoptNeeded = DexFile.getDexOptNeeded(path, isa, compilerFilter, newProfile);
+            dexoptNeeded = DexFile.getDexOptNeeded(path, isa, compilerFilter, newProfile,
+                    false /* downgrade */);
         } catch (IOException ioe) {
             Slog.w(TAG, "IOException reading apk: " + path, ioe);
             return DEX_OPT_FAILED;
