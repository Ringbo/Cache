diff --git a/sql-clients/test-utils/src/main/java/org/elasticsearch/xpack/sql/test/server/ProtoHandler.java b/sql-clients/test-utils/src/main/java/org/elasticsearch/xpack/sql/test/server/ProtoHandler.java
index c4ac3c0..9b520a2 100644
--- a/sql-clients/test-utils/src/main/java/org/elasticsearch/xpack/sql/test/server/ProtoHandler.java
+++ b/sql-clients/test-utils/src/main/java/org/elasticsearch/xpack/sql/test/server/ProtoHandler.java
@@ -83,7 +83,7 @@
     }
 
     @Override
-    public void close() throws Exception {
+    public void close() {
         // no-op
     }
 }
\ No newline at end of file
