diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index 38f28ae..28f7480 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -4825,8 +4825,8 @@
 
             enqueueInputEvent(new KeyEvent(event.getDownTime(), event.getEventTime(),
                         event.getAction(), keyCode, event.getRepeatCount(), event.getMetaState(),
-                        event.getScanCode(), event.getFlags() | KeyEvent.FLAG_FALLBACK,
-                        event.getSource()));
+                        event.getDeviceId(), event.getScanCode(),
+                        event.getFlags() | KeyEvent.FLAG_FALLBACK, event.getSource()));
             return true;
         }
 
