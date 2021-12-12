diff --git a/scribejava-core/src/main/java/com/github/scribejava/core/services/TimestampService.java b/scribejava-core/src/main/java/com/github/scribejava/core/services/TimestampService.java
index fca170c..42e97fc 100644
--- a/scribejava-core/src/main/java/com/github/scribejava/core/services/TimestampService.java
+++ b/scribejava-core/src/main/java/com/github/scribejava/core/services/TimestampService.java
@@ -14,12 +14,12 @@
      *
      * @return timestamp
      */
-    public String getTimestampInSeconds();
+    String getTimestampInSeconds();
 
     /**
      * Returns a nonce (unique value for each request)
      *
      * @return nonce
      */
-    public String getNonce();
+    String getNonce();
 }
