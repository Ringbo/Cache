diff --git a/android/src/main/java/com/imagepicker/ImagePickerModule.java b/android/src/main/java/com/imagepicker/ImagePickerModule.java
index a5a9091..80c0384 100644
--- a/android/src/main/java/com/imagepicker/ImagePickerModule.java
+++ b/android/src/main/java/com/imagepicker/ImagePickerModule.java
@@ -415,7 +415,7 @@
       try {
         String isoFormatString = isoFormat.format(exifDatetimeFormat.parse(timestamp)) + "Z";
         response.putString("timestamp", isoFormatString);
-      } catch (ParseException e) {}
+      } catch (Exception e) {}
 
       int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
       boolean isVertical = true;
