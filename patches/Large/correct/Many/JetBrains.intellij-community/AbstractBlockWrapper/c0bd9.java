diff --git a/platform/lang-impl/src/com/intellij/formatting/AbstractBlockWrapper.java b/platform/lang-impl/src/com/intellij/formatting/AbstractBlockWrapper.java
index ec55f74..8081b7f 100644
--- a/platform/lang-impl/src/com/intellij/formatting/AbstractBlockWrapper.java
+++ b/platform/lang-impl/src/com/intellij/formatting/AbstractBlockWrapper.java
@@ -246,7 +246,7 @@
           if (anchorBlock instanceof CompositeBlockWrapper) {
             List<AbstractBlockWrapper> children = ((CompositeBlockWrapper)anchorBlock).getChildren();
             for (AbstractBlockWrapper c : children) {
-              if (c.getStartOffset() != getStartOffset()) {
+              if (c.getStartOffset() != getStartOffset() && c.getStartOffset() < targetBlockStartOffset) {
                 anchorBlock = c;
                 break;
               }
