diff --git a/jre_emul/Classes/com/google/j2objc/net/IosHttpURLConnection.java b/jre_emul/Classes/com/google/j2objc/net/IosHttpURLConnection.java
index f04e420..9438640 100644
--- a/jre_emul/Classes/com/google/j2objc/net/IosHttpURLConnection.java
+++ b/jre_emul/Classes/com/google/j2objc/net/IosHttpURLConnection.java
@@ -598,7 +598,7 @@
 
   private void setHeader(String k, String v) {
     for (HeaderEntry entry : headers) {
-      if (entry.key == k) {
+      if (entry.key == k || (entry.key != null && k != null && k.equalsIgnoreCase(entry.key))) {
         headers.remove(entry);
         break;
       }
