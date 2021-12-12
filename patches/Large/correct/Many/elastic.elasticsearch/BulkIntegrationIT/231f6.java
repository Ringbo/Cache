diff --git a/server/src/test/java/org/elasticsearch/action/bulk/BulkIntegrationIT.java b/server/src/test/java/org/elasticsearch/action/bulk/BulkIntegrationIT.java
index 3e61557..3258943 100644
--- a/server/src/test/java/org/elasticsearch/action/bulk/BulkIntegrationIT.java
+++ b/server/src/test/java/org/elasticsearch/action/bulk/BulkIntegrationIT.java
@@ -93,10 +93,10 @@
         assertThat(client().prepareGet("index3", "type", "id").setRouting("1").get().getSource().get("foo"), equalTo("baz"));
 
         bulkResponse = client().prepareBulk().add(client().prepareUpdate("alias1", "type", "id").setDoc("foo", "updated")).get();
-        assertFalse(bulkResponse.hasFailures());
+        assertFalse(bulkResponse.buildFailureMessage(), bulkResponse.hasFailures());
         assertThat(client().prepareGet("index3", "type", "id").setRouting("1").get().getSource().get("foo"), equalTo("updated"));
         bulkResponse = client().prepareBulk().add(client().prepareDelete("alias1", "type", "id")).get();
-        assertFalse(bulkResponse.hasFailures());
+        assertFalse(bulkResponse.buildFailureMessage(), bulkResponse.hasFailures());
         assertFalse(client().prepareGet("index3", "type", "id").setRouting("1").get().isExists());
     }
 
