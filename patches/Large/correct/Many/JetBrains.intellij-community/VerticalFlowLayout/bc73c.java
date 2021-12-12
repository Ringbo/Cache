diff --git a/platform/util/src/com/intellij/openapi/ui/VerticalFlowLayout.java b/platform/util/src/com/intellij/openapi/ui/VerticalFlowLayout.java
index 43aa9b3..eec2638 100644
--- a/platform/util/src/com/intellij/openapi/ui/VerticalFlowLayout.java
+++ b/platform/util/src/com/intellij/openapi/ui/VerticalFlowLayout.java
@@ -165,7 +165,7 @@
       Dimension dimension1 = component.getPreferredSize();
       dimension.width = Math.max(dimension.width, dimension1.width);
       if (i > 0){
-        dimension.height += hGap;
+        dimension.height += vGap;
       }
       dimension.height += dimension1.height;
     }
