diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index 6891b76..00d86e3 100644
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -2737,7 +2737,7 @@
                     }
                 }
 
-                if (pi != null && !list.append(pi)) {
+                if (pi != null && list.append(pi)) {
                     break;
                 }
             }
@@ -2787,7 +2787,7 @@
                     }
                 }
 
-                if (ai != null && !list.append(ai)) {
+                if (ai != null && list.append(ai)) {
                     break;
                 }
             }
