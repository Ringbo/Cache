diff --git a/solr/core/src/test/org/apache/solr/search/TestSmileRequest.java b/solr/core/src/test/org/apache/solr/search/TestSmileRequest.java
index 2e157c7..0bf46e7 100644
--- a/solr/core/src/test/org/apache/solr/search/TestSmileRequest.java
+++ b/solr/core/src/test/org/apache/solr/search/TestSmileRequest.java
@@ -81,7 +81,7 @@
       }
     };
     client.queryDefaults().set("shards", servers.getShards());
-    TestJsonRequest.doJsonRequest(client, false);
+    TestJsonRequest.doJsonRequest(client, true);
 
   }
 
