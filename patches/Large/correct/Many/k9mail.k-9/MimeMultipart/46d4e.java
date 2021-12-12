diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMultipart.java b/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMultipart.java
index ef10b04..ae4c520 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMultipart.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/internet/MimeMultipart.java
@@ -32,7 +32,7 @@
         this.boundary = boundary;
     }
 
-    public static String generateBoundary() {
+    public String generateBoundary() {
         Random random = new Random();
         StringBuilder sb = new StringBuilder();
         sb.append("----");
