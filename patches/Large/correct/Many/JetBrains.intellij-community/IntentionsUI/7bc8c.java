diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/IntentionsUI.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/IntentionsUI.java
index 6b2f1d7..5c33ddf 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/IntentionsUI.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/IntentionsUI.java
@@ -24,7 +24,7 @@
   @NotNull
   public CachedIntentions getCachedIntentions(@Nullable Editor editor, @NotNull PsiFile file) {
     CachedIntentions cachedIntentions = myCachedIntentions;
-    if (cachedIntentions != null && editor == myCachedIntentions.getEditor() && file == myCachedIntentions.getFile()) {
+    if (cachedIntentions != null && editor == cachedIntentions.getEditor() && file == cachedIntentions.getFile()) {
       return cachedIntentions;
     } else {
       CachedIntentions intentions = new CachedIntentions(myProject, file, editor);
