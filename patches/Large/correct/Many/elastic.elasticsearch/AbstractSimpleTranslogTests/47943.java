diff --git a/modules/elasticsearch/src/test/java/org/elasticsearch/index/translog/AbstractSimpleTranslogTests.java b/modules/elasticsearch/src/test/java/org/elasticsearch/index/translog/AbstractSimpleTranslogTests.java
index 0ccef97..cd9d6dc 100644
--- a/modules/elasticsearch/src/test/java/org/elasticsearch/index/translog/AbstractSimpleTranslogTests.java
+++ b/modules/elasticsearch/src/test/java/org/elasticsearch/index/translog/AbstractSimpleTranslogTests.java
@@ -106,7 +106,7 @@
         assertThat(snapshot.estimatedTotalOperations(), equalTo(3));
         snapshot.release();
 
-        translog.add(new Translog.DeleteByQuery(new byte[]{4}, null, null));
+        translog.add(new Translog.DeleteByQuery(new byte[]{4}, null));
         snapshot = translog.snapshot();
         assertThat(snapshot, translogSize(4));
         assertThat(snapshot.estimatedTotalOperations(), equalTo(4));
