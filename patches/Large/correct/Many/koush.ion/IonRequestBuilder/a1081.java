diff --git a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
index 6c89cf8..165e9cc 100644
--- a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
+++ b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
@@ -659,7 +659,7 @@
 
     @Override
     public ResponseFuture<String> asString(Charset charset) {
-        return execute(new StringParser());
+        return execute(new StringParser(charset));
     }
 
     @Override
