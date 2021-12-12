diff --git a/platform/util/src/com/intellij/openapi/ui/Splitter.java b/platform/util/src/com/intellij/openapi/ui/Splitter.java
index f2183c3..6df4de0 100644
--- a/platform/util/src/com/intellij/openapi/ui/Splitter.java
+++ b/platform/util/src/com/intellij/openapi/ui/Splitter.java
@@ -109,7 +109,7 @@
   @Override
   public Dimension getPreferredSize() {
     Dimension first = myFirstComponent.getPreferredSize();
-    Dimension second = myFirstComponent.getPreferredSize();
+    Dimension second = mySecondComponent.getPreferredSize();
     if (myVerticalSplit) {
       return new Dimension(Math.max(first.width, second.width), first.height + second.height + myDividerWidth);
     }
