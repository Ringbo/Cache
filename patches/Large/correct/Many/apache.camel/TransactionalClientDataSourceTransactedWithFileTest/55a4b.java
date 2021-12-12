diff --git a/components/camel-spring/src/test/java/org/apache/camel/spring/interceptor/TransactionalClientDataSourceTransactedWithFileTest.java b/components/camel-spring/src/test/java/org/apache/camel/spring/interceptor/TransactionalClientDataSourceTransactedWithFileTest.java
index 444eff0..853d7a5 100644
--- a/components/camel-spring/src/test/java/org/apache/camel/spring/interceptor/TransactionalClientDataSourceTransactedWithFileTest.java
+++ b/components/camel-spring/src/test/java/org/apache/camel/spring/interceptor/TransactionalClientDataSourceTransactedWithFileTest.java
@@ -35,7 +35,7 @@
         template.sendBodyAndHeader("file://target/transacted/okay", "Hello World", Exchange.FILE_NAME, "okay.txt");
 
         // wait for route to complete
-        Thread.sleep(2000);
+        Thread.sleep(3000);
 
         int count = jdbc.queryForInt("select count(*) from books");
         assertEquals("Number of books", 3, count);
@@ -45,7 +45,7 @@
         template.sendBodyAndHeader("file://target/transacted/fail", "Hello World", Exchange.FILE_NAME, "fail.txt");
 
         // wait for route to complete
-        Thread.sleep(2000);
+        Thread.sleep(3000);
 
         // should not be able to process the file so we still got 1 book as we did from the start
         int count = jdbc.queryForInt("select count(*) from books");
