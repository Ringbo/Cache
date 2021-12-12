diff --git a/source/com/intellij/psi/impl/compiled/ClsFileImpl.java b/source/com/intellij/psi/impl/compiled/ClsFileImpl.java
index 93d1eef..cd9087d 100644
--- a/source/com/intellij/psi/impl/compiled/ClsFileImpl.java
+++ b/source/com/intellij/psi/impl/compiled/ClsFileImpl.java
@@ -235,7 +235,7 @@
 
   private LanguageLevel getLanguageLevelInner() {
     final LanguageLevel defaultLevel = getManager().getEffectiveLanguageLevel();
-    if (myClass != null) {
+    if (myClass != null && myClass.isContentsLoaded()) {
       final ClassFileData data = myClass.getClassFileData();
       if (data != null) {
         return getLanguageLevelFromClassFileData(data, defaultLevel);
