diff --git a/api/src/main/java/com/google/android/apps/muzei/api/Artwork.java b/api/src/main/java/com/google/android/apps/muzei/api/Artwork.java
index 6ce569a..8531ac0 100644
--- a/api/src/main/java/com/google/android/apps/muzei/api/Artwork.java
+++ b/api/src/main/java/com/google/android/apps/muzei/api/Artwork.java
@@ -459,7 +459,7 @@
                 .attribution(jsonObject.optString(KEY_ATTRIBUTION))
                 .token(jsonObject.optString(KEY_TOKEN))
                 .metaFont(jsonObject.optString(KEY_META_FONT))
-                .dateAdded(new Date(jsonObject.getLong(KEY_DATE_ADDED)));
+                .dateAdded(new Date(jsonObject.optLong(KEY_DATE_ADDED, 0)));
 
         String componentName = jsonObject.optString(KEY_COMPONENT_NAME);
         if (!TextUtils.isEmpty(componentName)) {
