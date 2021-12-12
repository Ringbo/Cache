diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java
index 5e7d553..d343f0a 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/content/ToolWindowContentUi.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2009 JetBrains s.r.o.
+ * Copyright 2000-2012 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -303,11 +303,11 @@
     });
 
     c.addMouseListener(new MouseAdapter() {
-      public void mouseReleased(final MouseEvent e) {
+      public void mousePressed(final MouseEvent e) {
         myLastPoint[0] = e.getPoint();
         SwingUtilities.convertPointToScreen(myLastPoint[0], c);
         if (!e.isPopupTrigger()) {
-          if (UIUtil.isCloseClick(e, MouseEvent.MOUSE_RELEASED)) {
+          if (UIUtil.isCloseClick(e)) {
             ui.processHide(e);
           }
           else {
