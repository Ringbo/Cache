diff --git a/src/main/java/org/graylog2/restclient/models/Extractor.java b/src/main/java/org/graylog2/restclient/models/Extractor.java
index 3b6f22c..0a0921a 100644
--- a/src/main/java/org/graylog2/restclient/models/Extractor.java
+++ b/src/main/java/org/graylog2/restclient/models/Extractor.java
@@ -185,7 +185,7 @@
         request.conditionValue = conditionValue;
         request.order = order;
 
-        final Map response = api.path(routes.ExtractorsResource().list(input.getId()), Map.class)
+        final Map response = api.path(routes.ExtractorsResource().create(input.getId()), Map.class)
                 .node(node)
                 .expect(Http.Status.CREATED)
                 .body(request)
