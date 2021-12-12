diff --git a/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java b/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java
index 48a0618..e0a3493 100644
--- a/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java
+++ b/testsuite/integration/clust/src/test/java/org/jboss/as/test/clustering/cluster/ClusteredWebTestCase.java
@@ -107,7 +107,7 @@
             Assert.assertEquals(HttpServletResponse.SC_OK, response.getStatusLine().getStatusCode());
             Assert.assertEquals(2, Integer.parseInt(response.getFirstHeader("value").getValue()));
             // This won't be true unless we have somewhere to which to replicate
-            Assert.assertFalse(Boolean.valueOf(response.getFirstHeader("serialized").getValue()));
+            Assert.assertTrue(Boolean.valueOf(response.getFirstHeader("serialized").getValue()));
             response.getEntity().getContent().close();
         } finally {
             client.getConnectionManager().shutdown();
