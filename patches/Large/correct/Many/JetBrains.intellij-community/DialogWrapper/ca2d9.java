diff --git a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
index 6243192..24e41f7 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
@@ -1858,7 +1858,7 @@
   private Dimension myActualSize = null;
   private String myLastErrorText = null;
 
-  protected final void setErrorText(@Nullable final String text) {
+  public void setErrorText(@Nullable final String text) {
     if (Comparing.equal(myLastErrorText, text)) {
       return;
     }
