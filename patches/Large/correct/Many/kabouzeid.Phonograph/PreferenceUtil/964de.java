diff --git a/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java b/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java
index 666af59..69800a4 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java
@@ -152,7 +152,7 @@
     }
 
     public final boolean classicNotification() {
-        return mPreferences.getBoolean(CLASSIC_NOTIFICATION, true);
+        return mPreferences.getBoolean(CLASSIC_NOTIFICATION, false);
     }
 
     public void setClassicNotification(final boolean value) {
