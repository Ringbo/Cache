diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowHeader.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowHeader.java
index 00988b0..a83fa0c 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowHeader.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/ToolWindowHeader.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2011 JetBrains s.r.o.
+ * Copyright 2000-2012 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -188,9 +188,9 @@
     });
     
     addMouseListener(new MouseAdapter() {
-      public void mouseReleased(final MouseEvent e) {
+      public void mousePressed(final MouseEvent e) {
         if (!e.isPopupTrigger()) {
-          if (UIUtil.isCloseClick(e, MouseEvent.MOUSE_RELEASED)) {
+          if (UIUtil.isCloseClick(e)) {
             if (e.isAltDown()) {
               toolWindow.fireHidden();
             }
