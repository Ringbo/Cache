diff --git a/src/android/notification/Manager.java b/src/android/notification/Manager.java
index 3505c93..9af3c94 100644
--- a/src/android/notification/Manager.java
+++ b/src/android/notification/Manager.java
@@ -120,7 +120,7 @@
                 notification.getOptions().getDict(), updates);
 
         try {
-            options.putOpt("updated", true);
+            options.put("updated", true);
         } catch (JSONException ignore) {}
 
         return schedule(options, receiver);
