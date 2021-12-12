diff --git a/app/src/main/java/com/waz/zclient/controllers/userpreferences/UserPreferencesController.java b/app/src/main/java/com/waz/zclient/controllers/userpreferences/UserPreferencesController.java
index a0a8f7e..c0986bf 100644
--- a/app/src/main/java/com/waz/zclient/controllers/userpreferences/UserPreferencesController.java
+++ b/app/src/main/java/com/waz/zclient/controllers/userpreferences/UserPreferencesController.java
@@ -354,7 +354,7 @@
 
     @Override
     public boolean hasShareContactsEnabled() {
-        return userPreferences.getBoolean(context.getString(R.string.pref_share_contacts_key), false);
+        return userPreferences.getBoolean(context.getString(R.string.pref_share_contacts_key), true);
     }
 
     @Override
