diff --git a/media/java/android/media/ExifInterface.java b/media/java/android/media/ExifInterface.java
index 0a61148..6677178 100644
--- a/media/java/android/media/ExifInterface.java
+++ b/media/java/android/media/ExifInterface.java
@@ -2661,9 +2661,9 @@
     }
 
     private void addDefaultValuesForCompatibility() {
-        // The value of DATETIME tag has the same value of DATETIME_ORIGINAL tag.
+        // If DATETIME tag has no value, then set the value to DATETIME_ORIGINAL tag's.
         String valueOfDateTimeOriginal = getAttribute(TAG_DATETIME_ORIGINAL);
-        if (valueOfDateTimeOriginal != null) {
+        if (valueOfDateTimeOriginal != null && getAttribute(TAG_DATETIME) == null) {
             mAttributes[IFD_TYPE_PRIMARY].put(TAG_DATETIME,
                     ExifAttribute.createString(valueOfDateTimeOriginal));
         }
