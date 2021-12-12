diff --git a/core/java/com/android/internal/os/PowerProfile.java b/core/java/com/android/internal/os/PowerProfile.java
index 94750d3..efca0cb 100644
--- a/core/java/com/android/internal/os/PowerProfile.java
+++ b/core/java/com/android/internal/os/PowerProfile.java
@@ -251,7 +251,7 @@
                 final Double[] values = (Double[]) data;
                 if (values.length > level && level >= 0) {
                     return values[level];
-                } else if (level < 0) {
+                } else if (level < 0 || values.length == 0) {
                     return 0;
                 } else {
                     return values[values.length - 1];
