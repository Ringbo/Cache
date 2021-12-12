diff --git a/platform/platform-api/src/com/intellij/ui/GroupedElementsRenderer.java b/platform/platform-api/src/com/intellij/ui/GroupedElementsRenderer.java
index b8092e6..6d2ab2d 100644
--- a/platform/platform-api/src/com/intellij/ui/GroupedElementsRenderer.java
+++ b/platform/platform-api/src/com/intellij/ui/GroupedElementsRenderer.java
@@ -71,7 +71,7 @@
       myComponent.setBorder(ourBorder);
       setDeselected(myComponent);
       setDeselected(myTextLabel);
-      if (UIUtil.isUnderNimbusLookAndFeel()) {
+      if (UIUtil.isUnderGTKLookAndFeel() || UIUtil.isUnderNimbusLookAndFeel()) {
         myTextLabel.setOpaque(false);
       }
     }
