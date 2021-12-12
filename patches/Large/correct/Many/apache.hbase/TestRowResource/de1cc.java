diff --git a/src/contrib/stargate/src/test/org/apache/hadoop/hbase/stargate/TestRowResource.java b/src/contrib/stargate/src/test/org/apache/hadoop/hbase/stargate/TestRowResource.java
index 0a8b9b7..fa76018 100644
--- a/src/contrib/stargate/src/test/org/apache/hadoop/hbase/stargate/TestRowResource.java
+++ b/src/contrib/stargate/src/test/org/apache/hadoop/hbase/stargate/TestRowResource.java
@@ -317,7 +317,7 @@
     Thread.yield();
 
     // make sure the fake row was not actually created
-    response = client.get(path);
+    response = client.get(path, MIMETYPE_XML);
     assertEquals(response.getCode(), 404);
 
     // check that all of the values were created
@@ -349,7 +349,7 @@
     Thread.yield();
 
     // make sure the fake row was not actually created
-    response = client.get(path);
+    response = client.get(path, MIMETYPE_PROTOBUF);
     assertEquals(response.getCode(), 404);
 
     // check that all of the values were created
