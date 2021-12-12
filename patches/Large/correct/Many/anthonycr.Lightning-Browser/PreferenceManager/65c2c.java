diff --git a/app/src/main/java/acr/browser/lightning/preference/PreferenceManager.java b/app/src/main/java/acr/browser/lightning/preference/PreferenceManager.java
index 6222af3..3ebafc3 100644
--- a/app/src/main/java/acr/browser/lightning/preference/PreferenceManager.java
+++ b/app/src/main/java/acr/browser/lightning/preference/PreferenceManager.java
@@ -391,7 +391,7 @@
         putBoolean(Name.RESTORE_LOST_TABS, enable);
     }
 
-    public void setSavedUrl(@NonNull String url) {
+    public void setSavedUrl(@Nullable String url) {
         putString(Name.SAVE_URL, url);
     }
 
