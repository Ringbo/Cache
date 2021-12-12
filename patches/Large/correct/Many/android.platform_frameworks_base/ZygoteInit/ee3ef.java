diff --git a/core/java/com/android/internal/os/ZygoteInit.java b/core/java/com/android/internal/os/ZygoteInit.java
index 40c9ed2..4dde217 100644
--- a/core/java/com/android/internal/os/ZygoteInit.java
+++ b/core/java/com/android/internal/os/ZygoteInit.java
@@ -458,7 +458,7 @@
                 Log.v(TAG, "Preloading resource #" + Integer.toHexString(id));
             }
             if (id != 0) {
-                if (mResources.getDrawable(id) == null) {
+                if (mResources.getDrawable(id, null) == null) {
                     throw new IllegalArgumentException(
                             "Unable to find preloaded drawable resource #0x"
                             + Integer.toHexString(id)
