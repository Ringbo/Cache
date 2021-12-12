diff --git a/library/src/main/java/com/loopj/android/http/RequestHandle.java b/library/src/main/java/com/loopj/android/http/RequestHandle.java
index bd9acb2..1d56fb4 100644
--- a/library/src/main/java/com/loopj/android/http/RequestHandle.java
+++ b/library/src/main/java/com/loopj/android/http/RequestHandle.java
@@ -5,11 +5,11 @@
 /**
  * A Handle to an AsyncRequest which can be used to cancel a running request.
  */
-public class RequestHandle {
+class RequestHandle {
     private final WeakReference<AsyncHttpRequest> request;
 
     public RequestHandle(AsyncHttpRequest request) {
-        this.request = new WeakReference<AsyncHttpRequest>(request);
+        this.request = new WeakReference(request);
     }
 
     /**
