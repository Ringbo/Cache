diff --git a/core/java/com/android/internal/os/ZygoteInit.java b/core/java/com/android/internal/os/ZygoteInit.java
index 4abab28..2be6212 100644
--- a/core/java/com/android/internal/os/ZygoteInit.java
+++ b/core/java/com/android/internal/os/ZygoteInit.java
@@ -549,7 +549,7 @@
             try {
                 dexoptNeeded = DexFile.getDexOptNeeded(
                     classPathElement, instructionSet, systemServerFilter,
-                    false /* newProfile */, false /* downgrade */);
+                    null /* classLoaderContext */, false /* newProfile */, false /* downgrade */);
             } catch (FileNotFoundException ignored) {
                 // Do not add to the classpath.
                 Log.w(TAG, "Missing classpath element for system server: " + classPathElement);
