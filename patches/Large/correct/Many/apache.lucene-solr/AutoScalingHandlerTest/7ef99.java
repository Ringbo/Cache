diff --git a/solr/core/src/test/org/apache/solr/cloud/autoscaling/AutoScalingHandlerTest.java b/solr/core/src/test/org/apache/solr/cloud/autoscaling/AutoScalingHandlerTest.java
index 9130b15..fd9ca75 100644
--- a/solr/core/src/test/org/apache/solr/cloud/autoscaling/AutoScalingHandlerTest.java
+++ b/solr/core/src/test/org/apache/solr/cloud/autoscaling/AutoScalingHandlerTest.java
@@ -617,7 +617,7 @@
 
     Map triggers = (Map) response.get("triggers");
     assertNotNull(triggers);
-    assertEquals(1, triggers.size());
+    assertEquals(2, triggers.size());
     assertTrue(triggers.containsKey("node_added_trigger1"));
     Map node_added_trigger1 = (Map) triggers.get("node_added_trigger1");
     assertEquals(4, node_added_trigger1.size());
