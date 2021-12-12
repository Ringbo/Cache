diff --git a/core/java/com/android/internal/os/ZygoteInit.java b/core/java/com/android/internal/os/ZygoteInit.java
index 50ddbd1..da53995 100644
--- a/core/java/com/android/internal/os/ZygoteInit.java
+++ b/core/java/com/android/internal/os/ZygoteInit.java
@@ -267,7 +267,12 @@
                     if (false) {
                         Log.v(TAG, "Preloading " + line + "...");
                     }
-                    Class.forName(line);
+                    // Load and explicitly initialize the given class. Use the tree-argument version
+                    // of forName to avoid repeated stack lookups (to derive the caller's
+                    // class-loader). Use true to force initialization, and null for the boot
+                    // classpath class-loader (could as well cache the class-loader of this class in
+                    // a variable).
+                    Class.forName(line, true, null);
                     count++;
                 } catch (ClassNotFoundException e) {
                     Log.w(TAG, "Class not found for preloading: " + line);
