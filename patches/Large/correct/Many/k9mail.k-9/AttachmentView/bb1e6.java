diff --git a/src/com/fsck/k9/view/AttachmentView.java b/src/com/fsck/k9/view/AttachmentView.java
index 36de617..21fea30 100644
--- a/src/com/fsck/k9/view/AttachmentView.java
+++ b/src/com/fsck/k9/view/AttachmentView.java
@@ -79,7 +79,7 @@
 
             size = Integer.parseInt(MimeUtility.getHeaderParameter(contentDisposition, "size"));
             contentType = part.getMimeType();
-            if (MimeUtility.DEFAULT_ATTACHMENT_MIME_TYPE.equals(contentType)) {
+            if (MimeUtility.DEFAULT_ATTACHMENT_MIME_TYPE.equalsIgnoreCase(contentType)) {
                 contentType = MimeUtility.getMimeTypeByExtension(name);
             }
             TextView attachmentName = (TextView) findViewById(R.id.attachment_name);
