diff --git a/library/src/main/java/com/loopj/android/http/AsyncHttpRequest.java b/library/src/main/java/com/loopj/android/http/AsyncHttpRequest.java
index 1d92c9e..6113a90 100755
--- a/library/src/main/java/com/loopj/android/http/AsyncHttpRequest.java
+++ b/library/src/main/java/com/loopj/android/http/AsyncHttpRequest.java
@@ -180,7 +180,7 @@
                     // switching between WI-FI and mobile data networks can cause a retry which then results in an UnknownHostException
                     // while the WI-FI is initialising. The retry logic will be invoked here, if this is NOT the first retry
                     // (to assist in genuine cases of unknown host) which seems better than outright failure
-                    cause = new IOException("UnknownHostException exception: " + e.getMessage());
+                    cause = new IOException("UnknownHostException exception: " + e.getMessage(), e);
                     retry = (executionCount > 0) && retryHandler.retryRequest(e, ++executionCount, context);
                 } catch (NullPointerException e) {
                     // there's a bug in HttpClient 4.0.x that on some occasions causes
@@ -203,7 +203,7 @@
         } catch (Exception e) {
             // catch anything else to ensure failure message is propagated
             AsyncHttpClient.log.e("AsyncHttpRequest", "Unhandled exception origin cause", e);
-            cause = new IOException("Unhandled exception: " + e.getMessage());
+            cause = new IOException("Unhandled exception: " + e.getMessage(), cause);
         }
 
         // cleaned up to throw IOException
