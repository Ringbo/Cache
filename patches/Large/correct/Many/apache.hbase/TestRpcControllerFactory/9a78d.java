diff --git a/hbase-endpoint/src/test/java/org/apache/hadoop/hbase/client/TestRpcControllerFactory.java b/hbase-endpoint/src/test/java/org/apache/hadoop/hbase/client/TestRpcControllerFactory.java
index 3fdd8cb..14a2bf9 100644
--- a/hbase-endpoint/src/test/java/org/apache/hadoop/hbase/client/TestRpcControllerFactory.java
+++ b/hbase-endpoint/src/test/java/org/apache/hadoop/hbase/client/TestRpcControllerFactory.java
@@ -170,7 +170,7 @@
     ResultScanner scan = table.getScanner(fam1);
     scan.next();
     scan.close();
-    counter = verifyCount(counter + 2);
+    counter = verifyCount(counter + 1);
 
     Get g2 = new Get(row);
     table.get(Lists.newArrayList(g, g2));
@@ -189,7 +189,7 @@
 
     // reversed, regular
     scanInfo.setSmall(false);
-    counter = doScan(table, scanInfo, counter + 2);
+    counter = doScan(table, scanInfo, counter + 1);
 
     table.close();
     connection.close();
