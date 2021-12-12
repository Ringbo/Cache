diff --git a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
index 94231c6..97a4216 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
@@ -330,8 +330,9 @@
             // NOTE: The order of these checks happens in the expected order of the traversal of the
             // tasks
 
-            // Remove the task if it is blacklisted
-            if (sRecentsBlacklist.contains(t.realActivity.getClassName())) {
+            // Remove the task if it or it's package are blacklsited
+            if (sRecentsBlacklist.contains(t.realActivity.getClassName()) ||
+                    sRecentsBlacklist.contains(t.realActivity.getPackageName())) {
                 iter.remove();
                 continue;
             }
