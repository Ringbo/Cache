diff --git a/src/main/java/org/elasticsearch/rest/action/support/RestTable.java b/src/main/java/org/elasticsearch/rest/action/support/RestTable.java
index a2a9461..2907bf6 100644
--- a/src/main/java/org/elasticsearch/rest/action/support/RestTable.java
+++ b/src/main/java/org/elasticsearch/rest/action/support/RestTable.java
@@ -68,7 +68,7 @@
 
     public static RestResponse buildTextPlainResponse(Table table, RestChannel channel) throws IOException {
         RestRequest request = channel.request();
-        boolean verbose = request.paramAsBoolean("v", false);
+        boolean verbose = request.paramAsBoolean("v", true);
 
         List<DisplayHeader> headers = buildDisplayHeaders(table, request);
         int[] width = buildWidths(table, request, verbose, headers);
