diff --git a/src/main/java/com/chrisrm/idea/notifications/Notify.java b/src/main/java/com/chrisrm/idea/notifications/Notify.java
index d77ab9b..cae6032 100644
--- a/src/main/java/com/chrisrm/idea/notifications/Notify.java
+++ b/src/main/java/com/chrisrm/idea/notifications/Notify.java
@@ -136,7 +136,7 @@
     {
       final IdeFrame frame = WindowManager.getInstance().getIdeFrame(project);
       final Rectangle bounds = frame.getComponent().getBounds();
-      final RelativePoint target = new RelativePoint(frame.getComponent(), new Point(bounds.x + bounds.width, 0));
+      final RelativePoint target = new RelativePoint(frame.getComponent(), new Point(bounds.x + bounds.width, 20));
 
       try {
         // Create a notification balloon using the manager
