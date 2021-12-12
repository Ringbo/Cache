diff --git a/core/java/com/android/internal/os/ZygoteInit.java b/core/java/com/android/internal/os/ZygoteInit.java
index fdc723e..cb1d9ac 100644
--- a/core/java/com/android/internal/os/ZygoteInit.java
+++ b/core/java/com/android/internal/os/ZygoteInit.java
@@ -548,7 +548,7 @@
             try {
                 dexoptNeeded = DexFile.getDexOptNeeded(
                     classPathElement, instructionSet, "speed",
-                    false /* newProfile */);
+                    false /* newProfile */, false /* downgrade */);
             } catch (FileNotFoundException ignored) {
                 // Do not add to the classpath.
                 Log.w(TAG, "Missing classpath element for system server: " + classPathElement);
