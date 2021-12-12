diff --git a/services/java/com/android/server/PackageManagerService.java b/services/java/com/android/server/PackageManagerService.java
index 5d0c4e3..076b0e2 100644
--- a/services/java/com/android/server/PackageManagerService.java
+++ b/services/java/com/android/server/PackageManagerService.java
@@ -1295,7 +1295,7 @@
                     System.arraycopy(cur, 0, ret, 0, i);
                 }
                 if (i < (N-1)) {
-                    System.arraycopy(cur, i, ret, i+1, N-i-1);
+                    System.arraycopy(cur, i + 1, ret, i, N - i - 1);
                 }
                 return ret;
             }
