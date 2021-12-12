diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/FileDrop.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/FileDrop.java
index 46173be..87c3768 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/FileDrop.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/FileDrop.java
@@ -245,7 +245,7 @@
         private final Border dragBorder;
         private final Listener listener;
 
-        public FileDropTargetListener(Component component, Border dragBorder, Listener listener) {
+        FileDropTargetListener(Component component, Border dragBorder, Listener listener) {
             this.component = component;
             this.dragBorder = dragBorder;
             this.listener = listener;
