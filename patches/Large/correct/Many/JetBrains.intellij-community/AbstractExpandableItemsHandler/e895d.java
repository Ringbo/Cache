diff --git a/platform/platform-impl/src/com/intellij/ui/AbstractExpandableItemsHandler.java b/platform/platform-impl/src/com/intellij/ui/AbstractExpandableItemsHandler.java
index d08e5a4..df1f82d 100644
--- a/platform/platform-impl/src/com/intellij/ui/AbstractExpandableItemsHandler.java
+++ b/platform/platform-impl/src/com/intellij/ui/AbstractExpandableItemsHandler.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2016 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -358,7 +358,7 @@
     if (width <= 0 || height <= 0) return null;
 
     Dimension size = getImageSize(width, height);
-    myImage = UIUtil.createImage(renderer, size.width, size.height, BufferedImage.TYPE_INT_RGB);
+    myImage = UIUtil.createImage(myComponent, size.width, size.height, BufferedImage.TYPE_INT_RGB);
 
     Graphics2D g = myImage.createGraphics();
     g.setClip(null);
