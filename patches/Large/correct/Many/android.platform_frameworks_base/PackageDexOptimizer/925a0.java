diff --git a/services/core/java/com/android/server/pm/PackageDexOptimizer.java b/services/core/java/com/android/server/pm/PackageDexOptimizer.java
index 2b7bd34..5021f2f 100644
--- a/services/core/java/com/android/server/pm/PackageDexOptimizer.java
+++ b/services/core/java/com/android/server/pm/PackageDexOptimizer.java
@@ -428,7 +428,8 @@
             boolean newProfile) {
         int dexoptNeeded;
         try {
-            dexoptNeeded = DexFile.getDexOptNeeded(path, isa, compilerFilter, newProfile);
+          dexoptNeeded = DexFile.getDexOptNeeded(path, isa, compilerFilter, newProfile,
+              false /* downgrade */);
         } catch (IOException ioe) {
             Slog.w(TAG, "IOException reading apk: " + path, ioe);
             return DEX_OPT_FAILED;
