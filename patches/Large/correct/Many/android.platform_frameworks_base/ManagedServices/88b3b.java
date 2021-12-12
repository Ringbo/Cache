diff --git a/services/core/java/com/android/server/notification/ManagedServices.java b/services/core/java/com/android/server/notification/ManagedServices.java
index c7551c50..d577369 100644
--- a/services/core/java/com/android/server/notification/ManagedServices.java
+++ b/services/core/java/com/android/server/notification/ManagedServices.java
@@ -454,7 +454,7 @@
                 newEnabled.addAll(userComponents);
 
                 for (int j = 0; j < userComponents.size(); j++) {
-                    final ComponentName component = userComponents.valueAt(i);
+                    final ComponentName component = userComponents.valueAt(j);
                     newPackages.add(component.getPackageName());
                 }
             }
