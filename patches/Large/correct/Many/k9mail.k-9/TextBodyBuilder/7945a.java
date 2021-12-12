diff --git a/src/com/fsck/k9/mail/internet/TextBodyBuilder.java b/src/com/fsck/k9/mail/internet/TextBodyBuilder.java
index 9627e99..5f6cfd3 100644
--- a/src/com/fsck/k9/mail/internet/TextBodyBuilder.java
+++ b/src/com/fsck/k9/mail/internet/TextBodyBuilder.java
@@ -204,7 +204,10 @@
         return mQuotedTextHtml;
     }
 
-    private String textToHtmlFragment(String text) {
+    /**
+     * protected for unit-test purposes
+     */
+    protected String textToHtmlFragment(String text) {
         return HtmlConverter.textToHtmlFragment(text);
     }
 
