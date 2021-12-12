diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 0630c3b..083208f 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -1920,7 +1920,7 @@
       else if (effectType == EffectType.BOLD_DOTTED_LINE) {
         final Color bgColor = getBackroundColor();
         final int dottedAt = SystemInfo.isMac ? y : y + 1;
-        UIUtil.drawBoldDottedLine((Graphics2D)g, xStart, xEnd, dottedAt, bgColor, effectColor, true);
+        UIUtil.drawBoldDottedLine((Graphics2D)g, xStart, xEnd, dottedAt, bgColor, effectColor, false);
       }
     }
 
