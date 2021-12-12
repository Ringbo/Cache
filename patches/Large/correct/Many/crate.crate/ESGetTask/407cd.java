diff --git a/sql/src/main/java/io/crate/executor/transport/task/elasticsearch/ESGetTask.java b/sql/src/main/java/io/crate/executor/transport/task/elasticsearch/ESGetTask.java
index 830894b..6849bc5 100644
--- a/sql/src/main/java/io/crate/executor/transport/task/elasticsearch/ESGetTask.java
+++ b/sql/src/main/java/io/crate/executor/transport/task/elasticsearch/ESGetTask.java
@@ -137,7 +137,7 @@
         public void onResponse(MultiGetResponse responses) {
             List<Object[]> rows = new ArrayList<>(responses.getResponses().length);
             for (MultiGetItemResponse response : responses) {
-                if (response.isFailed()) {
+                if (response.isFailed() || !response.getResponse().isExists()) {
                     continue;
                 }
                 final Object[] row = new Object[fieldExtractor.length];
