diff --git a/services/java/com/android/server/ConnectivityService.java b/services/java/com/android/server/ConnectivityService.java
index 352decf..c91b268 100644
--- a/services/java/com/android/server/ConnectivityService.java
+++ b/services/java/com/android/server/ConnectivityService.java
@@ -1341,7 +1341,7 @@
                         mNetd.removeRoute(ifaceName, r);
                     } catch (Exception e) {
                         // never crash - catch them all
-                        if (DBG) loge("Exception trying to remove a route: " + e);
+                        if (VDBG) loge("Exception trying to remove a route: " + e);
                         return false;
                     }
                 } else {
@@ -1353,7 +1353,7 @@
                     mNetd.removeSecondaryRoute(ifaceName, r);
                 } catch (Exception e) {
                     // never crash - catch them all
-                    if (DBG) loge("Exception trying to remove a route: " + e);
+                    if (VDBG) loge("Exception trying to remove a route: " + e);
                     return false;
                 }
             }
