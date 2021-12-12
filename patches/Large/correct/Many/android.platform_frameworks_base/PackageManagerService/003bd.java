diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index 99261ad..76c823b 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -14331,7 +14331,7 @@
                 }
                 if (savedInfo.second == info) {
                     // circled back to the highest ordered item; remove from order list
-                    mOrderResult.remove(savedInfo);
+                    mOrderResult.remove(packageName);
                     if (mOrderResult.size() == 0) {
                         // no more ordered items
                         break;
