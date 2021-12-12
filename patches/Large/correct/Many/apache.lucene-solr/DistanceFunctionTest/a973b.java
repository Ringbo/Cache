diff --git a/src/test/org/apache/solr/search/function/distance/DistanceFunctionTest.java b/src/test/org/apache/solr/search/function/distance/DistanceFunctionTest.java
index cdc906e..d18dcd3 100644
--- a/src/test/org/apache/solr/search/function/distance/DistanceFunctionTest.java
+++ b/src/test/org/apache/solr/search/function/distance/DistanceFunctionTest.java
@@ -121,7 +121,7 @@
             "//float[@name='score']='" + (float) (2.3 + 5.5) + "'");
 
     assertQ(req("fl", "*,score", "q", "{!func}dist(1, point, toMultiVS(0, 0))", "fq", "id:6"),
-            "//float[@name='score']='" + 0.0f + "'");
+            "//float[@name='score']='" + 1.0f + "'");
 
   }
 
