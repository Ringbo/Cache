diff --git a/services/java/com/android/server/pm/PackageManagerService.java b/services/java/com/android/server/pm/PackageManagerService.java
index 6b61c47..938d93a 100644
--- a/services/java/com/android/server/pm/PackageManagerService.java
+++ b/services/java/com/android/server/pm/PackageManagerService.java
@@ -2573,7 +2573,7 @@
                     }
                 }
 
-                if (pi != null && !list.append(pi)) {
+                if (pi != null && list.append(pi)) {
                     break;
                 }
             }
@@ -2620,7 +2620,7 @@
                     }
                 }
 
-                if (ai != null && !list.append(ai)) {
+                if (ai != null && list.append(ai)) {
                     break;
                 }
             }
