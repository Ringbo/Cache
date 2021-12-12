diff --git a/android/src/main/java/org/reactnative/camera/events/TextRecognizedEvent.java b/android/src/main/java/org/reactnative/camera/events/TextRecognizedEvent.java
index 96e4ecf..bdb8686 100644
--- a/android/src/main/java/org/reactnative/camera/events/TextRecognizedEvent.java
+++ b/android/src/main/java/org/reactnative/camera/events/TextRecognizedEvent.java
@@ -104,7 +104,7 @@
 
     WritableMap size = Arguments.createMap();
     size.putDouble("width", text.getBoundingBox().width() * this.mScaleX);
-    size.putDouble("height", text.getBoundingBox().width() * this.mScaleY);
+    size.putDouble("height", text.getBoundingBox().height() * this.mScaleY);
 
     WritableMap bounds = Arguments.createMap();
     bounds.putMap("origin", origin);
