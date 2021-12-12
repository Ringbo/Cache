diff --git a/astrid/src/com/todoroo/astrid/service/UpgradeService.java b/astrid/src/com/todoroo/astrid/service/UpgradeService.java
index d24609e..3253272 100644
--- a/astrid/src/com/todoroo/astrid/service/UpgradeService.java
+++ b/astrid/src/com/todoroo/astrid/service/UpgradeService.java
@@ -258,7 +258,7 @@
         if (from < V4_5_1) {
             String key = context.getString(R.string.p_taskRowStyle);
             if (Preferences.isSet(key)) {
-                boolean value = Preferences.getBoolean(key, true);
+                boolean value = Preferences.getBoolean(key, false);
                 Preferences.clear(key);
                 Preferences.setString(R.string.p_taskRowStyle_v2, value ? "1" : "0"); //$NON-NLS-1$ //$NON-NLS-2$
             }
