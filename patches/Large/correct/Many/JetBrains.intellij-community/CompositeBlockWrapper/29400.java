diff --git a/platform/lang-impl/src/com/intellij/formatting/CompositeBlockWrapper.java b/platform/lang-impl/src/com/intellij/formatting/CompositeBlockWrapper.java
index 805bbf4..dca827b 100644
--- a/platform/lang-impl/src/com/intellij/formatting/CompositeBlockWrapper.java
+++ b/platform/lang-impl/src/com/intellij/formatting/CompositeBlockWrapper.java
@@ -75,7 +75,7 @@
   }
 
   @Override
-  protected AbstractBlockWrapper getPreviousBlock() {
+  protected LeafBlockWrapper getPreviousBlock() {
     if (myChildren == null || myChildren.isEmpty()) {
       return null;
     }
