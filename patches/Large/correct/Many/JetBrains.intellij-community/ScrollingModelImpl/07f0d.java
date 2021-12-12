diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/ScrollingModelImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/ScrollingModelImpl.java
index 5735ed6..4eecdb3 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/ScrollingModelImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/ScrollingModelImpl.java
@@ -221,7 +221,7 @@
         hOffset = Math.max(0, targetLocation.x - inset);
       }
     }
-    else if (targetLocation.x >= hOffset + viewRect.width) {
+    else if (viewRect.width > 0 && targetLocation.x >= hOffset + viewRect.width) {
       hOffset = targetLocation.x - Math.max(0, viewRect.width - xInsets);
     }
 
