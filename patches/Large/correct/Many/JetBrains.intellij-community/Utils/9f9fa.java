diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/Utils.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/Utils.java
index 4f87a70..c3e604d 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/Utils.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/Utils.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2013 JetBrains s.r.o.
+ * Copyright 2000-2016 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -308,7 +308,8 @@
 
             @Override
             protected void paintComponent(Graphics g) {
-              if (UIUtil.isUnderWindowsClassicLookAndFeel() || UIUtil.isUnderDarcula() || UIUtil.isUnderWindowsLookAndFeel()) {
+              if (UIUtil.isUnderWindowsClassicLookAndFeel() || UIUtil.isUnderDarcula() || UIUtil.isUnderWindowsLookAndFeel()
+                  || (SystemInfo.isWindows && Registry.is("ide.intellij.laf.win10.ui"))) {
                 g.setColor(component.getBackground());
                 g.fillRect(0, 0, getWidth(), getHeight());
               }
