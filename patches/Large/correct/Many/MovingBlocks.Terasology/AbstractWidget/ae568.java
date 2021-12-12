diff --git a/engine/src/main/java/org/terasology/rendering/nui/AbstractWidget.java b/engine/src/main/java/org/terasology/rendering/nui/AbstractWidget.java
index 5b1c489..2bdc976 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/AbstractWidget.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/AbstractWidget.java
@@ -287,7 +287,7 @@
 
     @Override
     public void onBindEvent(BindButtonEvent event) {
-        if (event.getId().equals(new SimpleUri("engine:tabbingUI"))) {
+        if (event.getId().equals(new SimpleUri("engine:tabbingUI")) && event.getState().equals(ButtonState.DOWN)) {
             TabbingManagerSystem.focusSetThrough = true;
             logger.info("event id: " + event.getId());
             logger.info("changing focus of widget");
@@ -307,8 +307,7 @@
                 }
                 TabbingManagerSystem.tooltipLocked = true;
             }
-
-            event.consume();
+            event.prepare(new SimpleUri("engine:tabbingUI"), ButtonState.DOWN, 0);
         }
     }
 }
