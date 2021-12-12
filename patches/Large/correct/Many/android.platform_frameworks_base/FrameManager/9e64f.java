diff --git a/tests/Camera2Tests/SmartCamera/SimpleCamera/src/androidx/media/filterfw/FrameManager.java b/tests/Camera2Tests/SmartCamera/SimpleCamera/src/androidx/media/filterfw/FrameManager.java
index 55ed277..9a4348e 100644
--- a/tests/Camera2Tests/SmartCamera/SimpleCamera/src/androidx/media/filterfw/FrameManager.java
+++ b/tests/Camera2Tests/SmartCamera/SimpleCamera/src/androidx/media/filterfw/FrameManager.java
@@ -354,7 +354,7 @@
         assertNotRunning();
         FrameSlot slot = getSlot(name);
         slot.releaseFrame();
-        mFrameSlots.remove(slot);
+        mFrameSlots.remove(name);
     }
 
     /**
