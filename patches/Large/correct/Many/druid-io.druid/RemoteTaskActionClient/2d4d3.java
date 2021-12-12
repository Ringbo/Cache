diff --git a/indexing-service/src/main/java/io/druid/indexing/common/actions/RemoteTaskActionClient.java b/indexing-service/src/main/java/io/druid/indexing/common/actions/RemoteTaskActionClient.java
index b048bf2..4d73602 100644
--- a/indexing-service/src/main/java/io/druid/indexing/common/actions/RemoteTaskActionClient.java
+++ b/indexing-service/src/main/java/io/druid/indexing/common/actions/RemoteTaskActionClient.java
@@ -108,7 +108,7 @@
           throw Throwables.propagate(e);
         }
 
-        if (response.getStatus().getCode() / 200 == 1) {
+        if (response.getStatus().getCode() / 100 == 2) {
           final Map<String, Object> responseDict = jsonMapper.readValue(
               response.getContent(),
               new TypeReference<Map<String, Object>>()
