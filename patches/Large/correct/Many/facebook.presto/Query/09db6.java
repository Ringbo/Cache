diff --git a/presto-cli/src/main/java/com/facebook/presto/cli/Query.java b/presto-cli/src/main/java/com/facebook/presto/cli/Query.java
index 56e1014..0b9ec37 100644
--- a/presto-cli/src/main/java/com/facebook/presto/cli/Query.java
+++ b/presto-cli/src/main/java/com/facebook/presto/cli/Query.java
@@ -90,7 +90,7 @@
             waitForData();
         }
 
-        if ((!client.isFailed()) && (!client.isGone())) {
+        if ((!client.isFailed()) && (!client.isGone()) && (!client.isClosed())) {
             QueryResults results = client.isValid() ? client.current() : client.finalResults();
             if (results.getColumns() == null) {
                 errorChannel.printf("Query %s has no columns\n", results.getId());
