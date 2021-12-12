diff --git a/platform/lang-impl/src/com/intellij/codeInsight/lookup/LookupItem.java b/platform/lang-impl/src/com/intellij/codeInsight/lookup/LookupItem.java
index 940dfb9..6111b29 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/lookup/LookupItem.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/lookup/LookupItem.java
@@ -171,7 +171,7 @@
 
   @Override
   public void handleInsert(final InsertionContext context) {
-    if (!Boolean.TRUE.equals(getAttribute(CASE_INSENSITIVE))) {
+    if (Boolean.TRUE.equals(getAttribute(CASE_INSENSITIVE))) {
       CompletionService.getCompletionService().correctCaseInsensitiveString(this, context);
     }
 
