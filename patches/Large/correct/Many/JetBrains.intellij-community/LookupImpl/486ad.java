diff --git a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
index 5fb943b..287682c 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/lookup/impl/LookupImpl.java
@@ -490,7 +490,7 @@
     CommandProcessor.getInstance().executeCommand(myProject, () -> finishLookupInWritableFile(completionChar, item), null, null);
   }
 
-  void finishLookupInWritableFile(char completionChar, @Nullable LookupElement item) {
+  public void finishLookupInWritableFile(char completionChar, @Nullable LookupElement item) {
     //noinspection deprecation,unchecked
     if (item == null ||
         !item.isValid() ||
