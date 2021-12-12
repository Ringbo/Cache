diff --git a/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java b/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java
index 8522520..01d8d71 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/util/PreferenceUtil.java
@@ -317,7 +317,7 @@
     }
 
     public String getRecentlyPlayedCutoffText(Context context) {
-        return getCutoffText(LAST_PLAYED_CUTOFF, context);
+        return getCutoffText(RECENTLY_PLAYED_CUTOFF, context);
     }
 
     private String getCutoffText(final String cutoff, Context context) {
