diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java b/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java
index 2c68b17..076e7bd 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java
@@ -211,7 +211,7 @@
         }
 
         final String PERSIST_SERVICE = mContext.getString(R.string.pref_persistservice_key);
-        boolean persistService = prefs.getBoolean(PERSIST_SERVICE, true);
+        boolean persistService = prefs.getBoolean(PERSIST_SERVICE, false);
         if (!persistService) {
             Intent intent = new Intent(mContext, AimsicdService.class);
             stopService(intent);
