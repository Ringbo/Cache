diff --git a/engine/src/main/java/org/terasology/rendering/nui/itemRendering/StringTextIconRenderer.java b/engine/src/main/java/org/terasology/rendering/nui/itemRendering/StringTextIconRenderer.java
index 7571390..8d96869 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/itemRendering/StringTextIconRenderer.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/itemRendering/StringTextIconRenderer.java
@@ -37,7 +37,7 @@
     private final int marginRight;
 
     protected StringTextIconRenderer() {
-        this(true, 5, 5, 5, 10);
+        this(false, 5, 5, 5, 10);
     }
 
     protected StringTextIconRenderer(boolean wrap, int marginTop, int marginBottom, int marginLeft, int marginRight) {
@@ -84,7 +84,7 @@
                     }
                     sb.setLength(sb.length() - 1);
                 }
-                canvas.drawText(shortText);
+                canvas.drawText(shortText, Rect2i.createFromMinAndSize(iconWidth, 0, canvas.getRegion().width() - iconWidth, canvas.getRegion().height()));
             }
         }
     }
