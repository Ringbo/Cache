diff --git a/src/test/org/apache/solr/core/TestPropInject.java b/src/test/org/apache/solr/core/TestPropInject.java
index 21a4847..1c80781 100644
--- a/src/test/org/apache/solr/core/TestPropInject.java
+++ b/src/test/org/apache/solr/core/TestPropInject.java
@@ -52,6 +52,6 @@
   public void testPropsDefaults() throws Exception {
     IndexWriter writer = new ExposeWriterHandler().getWriter();
     ConcurrentMergeScheduler cms = (ConcurrentMergeScheduler)writer.getMergeScheduler();
-    assertEquals(10, cms.getMaxThreadCount());
+    assertEquals(4, cms.getMaxThreadCount());
   }
 }
