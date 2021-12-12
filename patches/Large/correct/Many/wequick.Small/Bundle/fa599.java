diff --git a/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java b/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java
index ced41d4..1047b50 100644
--- a/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java
+++ b/Android/DevSample/small/src/main/java/net/wequick/small/Bundle.java
@@ -405,7 +405,7 @@
         if (this.uriString == null || !uriString.startsWith(this.uriString)) return false;
 
         String srcPath = uriString.substring(this.uriString.length());
-        String srcQuery = uri.getQuery();
+        String srcQuery = uri.getEncodedQuery();
         if (srcQuery != null) {
             srcPath = srcPath.substring(0, srcPath.length() - srcQuery.length() - 1);
         }
