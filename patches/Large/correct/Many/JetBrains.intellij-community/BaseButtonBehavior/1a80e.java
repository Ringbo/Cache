diff --git a/platform-api/src/com/intellij/util/ui/BaseButtonBehavior.java b/platform-api/src/com/intellij/util/ui/BaseButtonBehavior.java
index 2dcc4bf..74e5189 100644
--- a/platform-api/src/com/intellij/util/ui/BaseButtonBehavior.java
+++ b/platform-api/src/com/intellij/util/ui/BaseButtonBehavior.java
@@ -123,7 +123,7 @@
     }
 
     private boolean passIfNeeded(final MouseEvent e) {
-      if (!UIUtil.isActionClick(e) || myMouseDeadzone.isWithin()) {
+      if (!UIUtil.isActionClick(e, MouseEvent.MOUSE_RELEASED) || myMouseDeadzone.isWithin()) {
         pass(e);
         return true;
       }
