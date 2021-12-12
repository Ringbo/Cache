diff --git a/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java b/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java
index 6af1c3b..db133f8 100644
--- a/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java
+++ b/services/core/java/com/android/server/om/OverlayManagerServiceImpl.java
@@ -130,7 +130,7 @@
         // installed and should be removed
         final int storedOverlayInfosSize = storedOverlayInfos.size();
         for (int i = 0; i < storedOverlayInfosSize; i++) {
-            final OverlayInfo oi = storedOverlayInfos.get(i);
+            final OverlayInfo oi = storedOverlayInfos.valueAt(i);
             mSettings.remove(oi.packageName, oi.userId);
             removeIdmapIfPossible(oi);
             packagesToUpdateAssets.add(oi.targetPackageName);
