diff --git a/solr/contrib/dataimporthandler-extras/src/java/org/apache/solr/handler/dataimport/MailEntityProcessor.java b/solr/contrib/dataimporthandler-extras/src/java/org/apache/solr/handler/dataimport/MailEntityProcessor.java
index 9342c0b..6a41e60 100644
--- a/solr/contrib/dataimporthandler-extras/src/java/org/apache/solr/handler/dataimport/MailEntityProcessor.java
+++ b/solr/contrib/dataimporthandler-extras/src/java/org/apache/solr/handler/dataimport/MailEntityProcessor.java
@@ -52,9 +52,9 @@
 public class MailEntityProcessor extends EntityProcessorBase {
   
   private static final SimpleDateFormat sinceDateParser = 
-      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
+      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
   private static final SimpleDateFormat afterFmt = 
-      new SimpleDateFormat("yyyy/MM/dd");
+      new SimpleDateFormat("yyyy/MM/dd", Locale.ROOT);
   
   public static interface CustomFilter {
     public SearchTerm getCustomSearch(Folder folder);
@@ -226,7 +226,7 @@
       addEnvelopeToDocument(part, row);
     }
     
-    String ct = part.getContentType().toLowerCase();
+    String ct = part.getContentType().toLowerCase(Locale.ROOT);
     ContentType ctype = new ContentType(ct);
     if (part.isMimeType("multipart/*")) {
       Object content = part.getContent();
