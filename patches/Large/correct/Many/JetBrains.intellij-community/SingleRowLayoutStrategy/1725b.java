diff --git a/platform/platform-api/src/com/intellij/ui/tabs/impl/singleRow/SingleRowLayoutStrategy.java b/platform/platform-api/src/com/intellij/ui/tabs/impl/singleRow/SingleRowLayoutStrategy.java
index 65e7df4..73a646e 100644
--- a/platform/platform-api/src/com/intellij/ui/tabs/impl/singleRow/SingleRowLayoutStrategy.java
+++ b/platform/platform-api/src/com/intellij/ui/tabs/impl/singleRow/SingleRowLayoutStrategy.java
@@ -46,7 +46,7 @@
   protected abstract int getFixedFitLength(final SingleRowPassInfo data);
 
   public Rectangle getLayoutRect(final SingleRowPassInfo data, final int position, final int length) {
-    return getLayoutRec(getFixedPosition(data), position, length, getFixedFitLength(data));
+    return getLayoutRec(position, getFixedPosition(data), length, getFixedFitLength(data));
   }
 
   protected abstract Rectangle getLayoutRec(final int position, final int fixedPos, final int length, final int fixedFitLength);
