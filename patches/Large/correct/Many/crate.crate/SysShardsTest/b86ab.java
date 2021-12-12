diff --git a/sql/src/test/java/io/crate/integrationtests/SysShardsTest.java b/sql/src/test/java/io/crate/integrationtests/SysShardsTest.java
index 386cf86..1180520 100644
--- a/sql/src/test/java/io/crate/integrationtests/SysShardsTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/SysShardsTest.java
@@ -308,15 +308,15 @@
     @Test
     public void testSelectNodeSysExpressionWithUnassignedShards() throws Exception {
         try {
-            transportExecutor.exec(
-                    "create table users (id integer primary key, name string) with (number_of_replicas=2)");
+            transportExecutor.exec("create table users (id integer primary key, name string) " +
+                    "clustered into 5 shards with (number_of_replicas=2)");
             transportExecutor.ensureYellowOrGreen();
             SQLResponse response = transportExecutor.exec(
                     "select _node['name'], id from sys.shards where table_name = 'users' order by _node['name'] nulls last"
             );
             String nodeName = response.rows()[0][0].toString();
             assertEquals("shared0", nodeName);
-            assertThat(response.rows()[8][0], is(nullValue()));
+            assertThat(response.rows()[12][0], is(nullValue()));
         } finally {
             transportExecutor.exec("drop table users");
         }
