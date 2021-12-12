diff --git a/platform/lang-impl/src/com/intellij/ui/ColorLineMarkerProvider.java b/platform/lang-impl/src/com/intellij/ui/ColorLineMarkerProvider.java
index 6e1379a..1b29a50 100644
--- a/platform/lang-impl/src/com/intellij/ui/ColorLineMarkerProvider.java
+++ b/platform/lang-impl/src/com/intellij/ui/ColorLineMarkerProvider.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2015 JetBrains s.r.o.
+ * Copyright 2000-2016 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -102,7 +102,7 @@
     @Override
     public Icon getCommonIcon(@NotNull List<MergeableLineMarkerInfo> infos) {
       if (infos.size() == 2 && infos.get(0) instanceof MyInfo && infos.get(1) instanceof MyInfo) {
-         return new TwoColorsIcon(12, ((MyInfo)infos.get(1)).myColor, ((MyInfo)infos.get(0)).myColor);
+         return new TwoColorsIcon(12, ((MyInfo)infos.get(0)).myColor, ((MyInfo)infos.get(1)).myColor);
       }
       return AllIcons.Gutter.Colors;
     }
