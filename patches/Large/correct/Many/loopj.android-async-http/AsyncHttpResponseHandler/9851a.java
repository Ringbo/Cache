diff --git a/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java b/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java
index 0912423..30c0af9 100755
--- a/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java
+++ b/library/src/main/java/com/loopj/android/http/AsyncHttpResponseHandler.java
@@ -179,7 +179,7 @@
      */
     public AsyncHttpResponseHandler() {
         // Use asynchronous mode by default.
-        setUseSynchronousMode(true);
+        setUseSynchronousMode(false);
     }
 
     /**
