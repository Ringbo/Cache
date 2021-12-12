diff --git a/platform/platform-impl/src/com/intellij/ide/actions/AboutAction.java b/platform/platform-impl/src/com/intellij/ide/actions/AboutAction.java
index 1e1c86e..8faa74a 100644
--- a/platform/platform-impl/src/com/intellij/ide/actions/AboutAction.java
+++ b/platform/platform-impl/src/com/intellij/ide/actions/AboutAction.java
@@ -101,7 +101,7 @@
 
     final long showTime = System.currentTimeMillis();
     //final long delta = Patches.APPLE_BUG_ID_3716865 ? 100 : 0;
-    final long delta = 100; //reproducible on Windows too
+    final long delta = 500; //reproducible on Windows too
 
     dialog.addWindowFocusListener(new WindowFocusListener() {
       public void windowGainedFocus(WindowEvent e) {
