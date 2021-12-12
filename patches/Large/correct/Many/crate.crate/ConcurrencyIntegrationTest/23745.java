diff --git a/sql/src/test/java/io/crate/integrationtests/ConcurrencyIntegrationTest.java b/sql/src/test/java/io/crate/integrationtests/ConcurrencyIntegrationTest.java
index 2ba4b66..d740328 100644
--- a/sql/src/test/java/io/crate/integrationtests/ConcurrencyIntegrationTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/ConcurrencyIntegrationTest.java
@@ -53,7 +53,7 @@
     }
 
     @Test
-    public void testConcurrentInserts() throws Throwable {
+    public void testInsertStatementsDoNotShareState() throws Throwable {
         execute("create table t1 (id int primary key, x int) with (number_of_replicas = 0)");
         execute("create table t2 (id int primary key, x string) with (number_of_replicas = 0)");
         execute("create table t3 (x timestamp) with (number_of_replicas = 0)");
@@ -69,8 +69,9 @@
             "insert into t4 (y) values ('foo') ",
         };
 
+        // run every statement 5 times, so all will fit into the executors pool
         for (final String statement : statements) {
-            for (int i = 0; i < 50; i++) {
+            for (int i = 0; i < 5; i++) {
                 executor.submit(
                     new Runnable() {
                         @Override
