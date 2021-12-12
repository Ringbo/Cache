diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeUtility.java b/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeUtility.java
index d67a064..6fa1efa 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeUtility.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeUtility.java
@@ -1019,7 +1019,8 @@
             RawDataBody rawDataBody = (RawDataBody) body;
             String encoding = rawDataBody.getEncoding();
             final InputStream rawInputStream = rawDataBody.getInputStream();
-            if (MimeUtil.ENC_7BIT.equalsIgnoreCase(encoding) || MimeUtil.ENC_8BIT.equalsIgnoreCase(encoding)) {
+            if (MimeUtil.ENC_7BIT.equalsIgnoreCase(encoding) || MimeUtil.ENC_8BIT.equalsIgnoreCase(encoding)
+                    || MimeUtil.ENC_BINARY.equalsIgnoreCase(encoding)) {
                 inputStream = rawInputStream;
             } else if (MimeUtil.ENC_BASE64.equalsIgnoreCase(encoding)) {
                 inputStream = new Base64InputStream(rawInputStream, false) {
