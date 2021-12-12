diff --git a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
index d127480..eb420ec 100644
--- a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
+++ b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
@@ -353,7 +353,7 @@
                         response.request = finalRequest;
                         response.result = result;
                         response.exception = e;
-                        ret.setComplete(response);
+                        ret.setComplete(e, response);
                         return;
                     }
                     ret.setComplete(e, null);
