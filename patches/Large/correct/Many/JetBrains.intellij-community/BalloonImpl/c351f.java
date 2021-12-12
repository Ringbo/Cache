diff --git a/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java b/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
index 1277d6d..486f88b 100644
--- a/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
+++ b/platform/platform-impl/src/com/intellij/ui/BalloonImpl.java
@@ -502,7 +502,7 @@
       myLayeredPane.remove(myComp);
 
       createComponent();
-      if (!new Rectangle(myComp.getSize()).contains(new Rectangle(myLayeredPane.getSize()))) { // Balloon is bigger than window, don't show it at all.
+      if (!new Rectangle(myLayeredPane.getSize()).contains(new Rectangle(myComp.getSize()))) { // Balloon is bigger than window, don't show it at all.
         myLayeredPane = null;
         hide();
         return;
