diff --git a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
index fc12416..4bf0d37 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
@@ -1395,7 +1395,7 @@
     }
 
     void layoutHint() {
-      if (myElementHint != null) {
+      if (myElementHint != null && getCurrentItem() != null) {
         final Rectangle bounds = getCurrentItemBounds();
         myElementHint.setSize(myElementHint.getPreferredSize());
         myElementHint.setLocation(new Point(bounds.x + bounds.width - myElementHint.getWidth(), bounds.y));
