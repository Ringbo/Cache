diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java b/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java
index 4516080..850ddbe 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/AIMSICD.java
@@ -210,7 +210,7 @@
         }
 
         final String PERSIST_SERVICE = mContext.getString(R.string.pref_persistservice_key);
-        boolean persistService = prefs.getBoolean(PERSIST_SERVICE, false);
+        boolean persistService = prefs.getBoolean(PERSIST_SERVICE, true);
         if (!persistService) {
             Intent intent = new Intent(mContext, AimsicdService.class);
             stopService(intent);
