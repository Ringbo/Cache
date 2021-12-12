diff --git a/services/java/com/android/server/PackageManagerService.java b/services/java/com/android/server/PackageManagerService.java
index 247a43f..1501202 100644
--- a/services/java/com/android/server/PackageManagerService.java
+++ b/services/java/com/android/server/PackageManagerService.java
@@ -1306,7 +1306,7 @@
                     System.arraycopy(cur, 0, ret, 0, i);
                 }
                 if (i < (N-1)) {
-                    System.arraycopy(cur, i, ret, i+1, N-i-1);
+                    System.arraycopy(cur, i + 1, ret, i, N - i - 1);
                 }
                 return ret;
             }
