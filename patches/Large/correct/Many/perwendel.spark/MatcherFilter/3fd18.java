diff --git a/src/main/java/spark/http/matching/MatcherFilter.java b/src/main/java/spark/http/matching/MatcherFilter.java
index c801a98..00042a6 100644
--- a/src/main/java/spark/http/matching/MatcherFilter.java
+++ b/src/main/java/spark/http/matching/MatcherFilter.java
@@ -146,7 +146,13 @@
             try {
                 DoneFilters.execute(context);
             } catch (Exception generalException) {
-                GeneralError.modify(httpResponse, body, requestWrapper, responseWrapper, generalException);
+                GeneralError.modify(
+                        httpRequest,
+                        httpResponse,
+                        body,
+                        requestWrapper,
+                        responseWrapper,
+                        generalException);
             }
         }
 
