diff --git a/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java b/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
index 9a5b8a7..1adb5e9 100644
--- a/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
+++ b/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
@@ -700,9 +700,9 @@
               vsbPolicy = VERTICAL_SCROLLBAR_ALWAYS;
             }
           }
-          if (!viewTracksViewportWidth && vsbPolicy == HORIZONTAL_SCROLLBAR_AS_NEEDED) {
+          if (!viewTracksViewportWidth && hsbPolicy == HORIZONTAL_SCROLLBAR_AS_NEEDED) {
             if (viewPreferredSize.width > viewportExtentSize.width || 0 != view.getX()) {
-              vsbPolicy = HORIZONTAL_SCROLLBAR_ALWAYS;
+              hsbPolicy = HORIZONTAL_SCROLLBAR_ALWAYS;
             }
           }
         }
