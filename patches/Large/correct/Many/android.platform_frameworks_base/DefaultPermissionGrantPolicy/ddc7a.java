diff --git a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
index 5016ec0..a6f9243 100644
--- a/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
+++ b/services/core/java/com/android/server/pm/DefaultPermissionGrantPolicy.java
@@ -1013,7 +1013,7 @@
                         permissions.clear();
                     }
                     permissions.add(permissionGrant.name);
-                    grantRuntimePermissionsLPw(pkg, permissions, false,
+                    grantRuntimePermissionsLPw(pkg, permissions,
                             permissionGrant.fixed, userId);
                 }
             }
