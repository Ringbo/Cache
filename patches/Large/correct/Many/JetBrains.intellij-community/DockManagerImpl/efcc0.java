diff --git a/platform/platform-impl/src/com/intellij/ui/docking/impl/DockManagerImpl.java b/platform/platform-impl/src/com/intellij/ui/docking/impl/DockManagerImpl.java
index 5a2fb3e..3aefd86 100644
--- a/platform/platform-impl/src/com/intellij/ui/docking/impl/DockManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/ui/docking/impl/DockManagerImpl.java
@@ -196,7 +196,7 @@
 
   private class MyDragSession implements DragSession {
 
-    private final JWindow myWindow;
+    private final JDialog myWindow;
 
     private Image myDragImage;
     private final Image myDefaultDragImage;
@@ -208,7 +208,7 @@
     private final JLabel myImageContainer;
 
     private MyDragSession(MouseEvent me, @NotNull DockableContent content) {
-      myWindow = new JWindow();
+      myWindow = new JDialog(WindowManager.getInstance().getFrame(myProject));
       myContent = content;
 
       Image previewImage = content.getPreviewImage();
