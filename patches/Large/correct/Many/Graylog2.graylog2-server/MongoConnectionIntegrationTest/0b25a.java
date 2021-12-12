diff --git a/src/test/java/org/graylog2/database/MongoConnectionIntegrationTest.java b/src/test/java/org/graylog2/database/MongoConnectionIntegrationTest.java
index a9aab0c..5346f5a 100644
--- a/src/test/java/org/graylog2/database/MongoConnectionIntegrationTest.java
+++ b/src/test/java/org/graylog2/database/MongoConnectionIntegrationTest.java
@@ -59,7 +59,8 @@
             "localhost",
             "graylog2test",
             Integer.valueOf(27017),
-            "false"
+            "false",
+            null
         );
 
         Mongo connection = instance.getConnection();
