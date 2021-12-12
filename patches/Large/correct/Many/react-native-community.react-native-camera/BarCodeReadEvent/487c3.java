diff --git a/android/src/main/java/org/reactnative/camera/events/BarCodeReadEvent.java b/android/src/main/java/org/reactnative/camera/events/BarCodeReadEvent.java
index f4b26c5..9b090f8 100644
--- a/android/src/main/java/org/reactnative/camera/events/BarCodeReadEvent.java
+++ b/android/src/main/java/org/reactnative/camera/events/BarCodeReadEvent.java
@@ -24,7 +24,7 @@
     if (event == null) {
       event = new BarCodeReadEvent();
     }
-    event.init(viewTag);
+    event.init(viewTag, barCode);
     return event;
   }
 
