diff --git a/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleFacadeImpl.java b/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleFacadeImpl.java
index 10b28e8..aae13c8 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleFacadeImpl.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleFacadeImpl.java
@@ -68,7 +68,7 @@
 
   @Override
   public boolean isWrapWhenTypingReachesRightMargin() {
-    return CodeStyleSettingsManager.getSettings(myProject).WRAP_WHEN_TYPING_REACHES_RIGHT_MAGIN;
+    return CodeStyleSettingsManager.getSettings(myProject).WRAP_WHEN_TYPING_REACHES_RIGHT_MARGIN;
   }
 
   public int getTabSize(final FileType fileType) {
