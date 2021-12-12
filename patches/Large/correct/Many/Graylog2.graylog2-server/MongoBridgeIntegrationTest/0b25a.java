diff --git a/src/test/java/org/graylog2/database/MongoBridgeIntegrationTest.java b/src/test/java/org/graylog2/database/MongoBridgeIntegrationTest.java
index 698d4a5..17f7c55 100644
--- a/src/test/java/org/graylog2/database/MongoBridgeIntegrationTest.java
+++ b/src/test/java/org/graylog2/database/MongoBridgeIntegrationTest.java
@@ -48,7 +48,8 @@
             "localhost",
             "graylog2test",
             Integer.valueOf(27017),
-            "false"
+            "false",
+            null
         );
 
         // TODO: Truncate messages collection.
