diff --git a/presto-cli/src/main/java/com/facebook/presto/cli/Query.java b/presto-cli/src/main/java/com/facebook/presto/cli/Query.java
index f4b0221..aed3d69 100644
--- a/presto-cli/src/main/java/com/facebook/presto/cli/Query.java
+++ b/presto-cli/src/main/java/com/facebook/presto/cli/Query.java
@@ -119,7 +119,7 @@
         if ((!client.isFailed()) && (!client.isGone()) && (!client.isClosed())) {
             QueryResults results = client.isValid() ? client.current() : client.finalResults();
             if (results.getUpdateType() != null) {
-                renderUpdate(out, results);
+                renderUpdate(errorChannel, results);
             }
             else if (results.getColumns() == null) {
                 errorChannel.printf("Query %s has no columns\n", results.getId());
