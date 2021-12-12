diff --git a/ApiDemos/app/src/main/java/com/example/mapdemo/StreetViewPanoramaViewDemoActivity.java b/ApiDemos/app/src/main/java/com/example/mapdemo/StreetViewPanoramaViewDemoActivity.java
index 11d1fa4..0643200 100755
--- a/ApiDemos/app/src/main/java/com/example/mapdemo/StreetViewPanoramaViewDemoActivity.java
+++ b/ApiDemos/app/src/main/java/com/example/mapdemo/StreetViewPanoramaViewDemoActivity.java
@@ -65,7 +65,7 @@
     @Override
     protected void onDestroy() {
         mStreetViewPanoramaView.onDestroy();
-        super.onPause();
+        super.onDestroy();
     }
 
     @Override
