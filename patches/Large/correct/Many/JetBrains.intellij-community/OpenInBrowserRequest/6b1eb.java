diff --git a/xml/openapi/src/com/intellij/ide/browsers/OpenInBrowserRequest.java b/xml/openapi/src/com/intellij/ide/browsers/OpenInBrowserRequest.java
index 8f7c742..695a430c 100644
--- a/xml/openapi/src/com/intellij/ide/browsers/OpenInBrowserRequest.java
+++ b/xml/openapi/src/com/intellij/ide/browsers/OpenInBrowserRequest.java
@@ -14,11 +14,11 @@
   private Collection<Url> result;
   protected PsiFile file;
 
-  OpenInBrowserRequest(@NotNull PsiFile file) {
+  public OpenInBrowserRequest(@NotNull PsiFile file) {
     this.file = file;
   }
 
-  OpenInBrowserRequest() {
+  public OpenInBrowserRequest() {
   }
 
   @Nullable
