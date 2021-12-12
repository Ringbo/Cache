diff --git a/platform/platform-impl/src/com/intellij/ide/plugins/PluginHeaderPanel.java b/platform/platform-impl/src/com/intellij/ide/plugins/PluginHeaderPanel.java
index 4f837db..024b0c4 100644
--- a/platform/platform-impl/src/com/intellij/ide/plugins/PluginHeaderPanel.java
+++ b/platform/platform-impl/src/com/intellij/ide/plugins/PluginHeaderPanel.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2014 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -184,7 +184,7 @@
         g.setPaint(getBackgroundPaint());
         g.fillRoundRect(1, 1, w - 2, h - 2, 6, 6);
         g.setColor(getButtonForeground());
-        int offset = 12;
+        int offset = 8;
         g.drawString(getText(), offset + 16 + 4, getBaseline(w, h));
         getIcon().paintIcon(this, g, offset, (getHeight() - getIcon().getIconHeight()) / 2);
         config.restore();
