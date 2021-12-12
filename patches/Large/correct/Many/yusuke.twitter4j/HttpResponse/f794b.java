diff --git a/twitter4j-core/src/main/java/twitter4j/internal/http/HttpResponse.java b/twitter4j-core/src/main/java/twitter4j/internal/http/HttpResponse.java
index 07ea7b4..158f4f5 100644
--- a/twitter4j-core/src/main/java/twitter4j/internal/http/HttpResponse.java
+++ b/twitter4j-core/src/main/java/twitter4j/internal/http/HttpResponse.java
@@ -188,7 +188,7 @@
                     jsonArray = new JSONArray(responseAsString);
                 }
                 if (CONF.isPrettyDebugEnabled()) {
-                    logger.debug(json.toString(1));
+                    logger.debug(jsonArray.toString(1));
                 }
             } catch (JSONException jsone) {
                 if (logger.isDebugEnabled()) {
