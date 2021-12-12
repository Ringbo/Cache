diff --git a/platform/lang-impl/src/com/intellij/codeInspection/reference/RefElementImpl.java b/platform/lang-impl/src/com/intellij/codeInspection/reference/RefElementImpl.java
index ddfe49c..3899fd5 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/reference/RefElementImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/reference/RefElementImpl.java
@@ -255,7 +255,7 @@
   public boolean isSuppressed(final String toolId) {
     if (mySuppressions != null) {
       for (@NonNls String suppression : mySuppressions) {
-        if (suppression.equalsIgnoreCase(SuppressionUtil.ALL)){
+        if (suppression.equals(toolId) || suppression.equalsIgnoreCase(SuppressionUtil.ALL)){
           return true;
         }
       }
