diff --git a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
index eb420ec..d127480 100644
--- a/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
+++ b/ion/src/com/koushikdutta/ion/IonRequestBuilder.java
@@ -353,7 +353,7 @@
                         response.request = finalRequest;
                         response.result = result;
                         response.exception = e;
-                        ret.setComplete(e, response);
+                        ret.setComplete(response);
                         return;
                     }
                     ret.setComplete(e, null);
