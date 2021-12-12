diff --git a/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java b/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java
index 9827f45..102d03e 100644
--- a/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java
+++ b/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java
@@ -921,7 +921,7 @@
       System.err.println("###### Only in " + bName + ": " + onlyInB);
     }
 
-    onlyInA.addAll(b);
+    onlyInA.addAll(onlyInB);
     return onlyInA;
   }
 
