diff --git a/lucene/queryparser/src/java/org/apache/lucene/queryparser/flexible/core/util/QueryNodeOperation.java b/lucene/queryparser/src/java/org/apache/lucene/queryparser/flexible/core/util/QueryNodeOperation.java
index 4280d1c..7d82510 100644
--- a/lucene/queryparser/src/java/org/apache/lucene/queryparser/flexible/core/util/QueryNodeOperation.java
+++ b/lucene/queryparser/src/java/org/apache/lucene/queryparser/flexible/core/util/QueryNodeOperation.java
@@ -56,7 +56,7 @@
       op = ANDOperation.BOTH;
     else if (q1 instanceof AndQueryNode)
       op = ANDOperation.Q1;
-    else if (q1 instanceof AndQueryNode)
+    else if (q2 instanceof AndQueryNode)
       op = ANDOperation.Q2;
     else
       op = ANDOperation.NONE;
