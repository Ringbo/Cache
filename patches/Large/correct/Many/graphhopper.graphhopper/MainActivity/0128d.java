diff --git a/android/app/src/main/java/com/graphhopper/android/MainActivity.java b/android/app/src/main/java/com/graphhopper/android/MainActivity.java
index 723a525..a75b4c7 100644
--- a/android/app/src/main/java/com/graphhopper/android/MainActivity.java
+++ b/android/app/src/main/java/com/graphhopper/android/MainActivity.java
@@ -384,7 +384,7 @@
 
             protected void onPostExecute( Object _ignore )
             {
-                dialog.hide();
+                dialog.dismiss();
                 if (hasError())
                 {
                     String str = "An error happened while retrieving maps:" + getErrorMessage();
