diff --git a/src/main/java/com/ning/http/client/RequestBuilderBase.java b/src/main/java/com/ning/http/client/RequestBuilderBase.java
index 04c52cd..1e7efe1 100644
--- a/src/main/java/com/ning/http/client/RequestBuilderBase.java
+++ b/src/main/java/com/ning/http/client/RequestBuilderBase.java
@@ -134,7 +134,7 @@
                 throw new IllegalArgumentException("Illegal URL: " + url, e);
             }
 
-            if (queryParams != null) {
+            if (queryParams != null && !queryParams.isEmpty()) {
 
                 StringBuilder builder = new StringBuilder();
                 if (!url.substring(8).contains("/")) { // no other "/" than http[s]:// -> http://localhost:1234
