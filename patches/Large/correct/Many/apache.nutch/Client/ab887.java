diff --git a/src/plugin/protocol-ftp/src/java/org/apache/nutch/protocol/ftp/Client.java b/src/plugin/protocol-ftp/src/java/org/apache/nutch/protocol/ftp/Client.java
index 02607f5..ebd88eb 100644
--- a/src/plugin/protocol-ftp/src/java/org/apache/nutch/protocol/ftp/Client.java
+++ b/src/plugin/protocol-ftp/src/java/org/apache/nutch/protocol/ftp/Client.java
@@ -344,9 +344,9 @@
         }
         entries.add(ftpFile);
         count += line.length();
-        // impose download limit if limit > 0, otherwise no limit
+        // impose download limit if limit >= 0, otherwise no limit
         // here, cut off is up to the line when total bytes is just over limit
-        if (limit > 0 && count > limit) {
+        if (limit >= 0 && count > limit) {
           mandatory_close = true;
           break;
         }
@@ -409,9 +409,9 @@
         new byte[org.apache.commons.net.io.Util.DEFAULT_COPY_BUFFER_SIZE];
       while((len=input.read(buf,0,buf.length)) != -1){
         count += len;
-        // impose download limit if limit > 0, otherwise no limit
+        // impose download limit if limit >= 0, otherwise no limit
         // here, cut off is exactly of limit bytes
-        if (limit > 0 && count > limit) {
+        if (limit >= 0 && count > limit) {
           os.write(buf,0,len-(count-limit));
           mandatory_close = true;
           break;
