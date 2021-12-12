diff --git a/test/unit/org/apache/cassandra/utils/SemanticVersionTest.java b/test/unit/org/apache/cassandra/utils/SemanticVersionTest.java
index 6d03d3f..010964f 100644
--- a/test/unit/org/apache/cassandra/utils/SemanticVersionTest.java
+++ b/test/unit/org/apache/cassandra/utils/SemanticVersionTest.java
@@ -71,7 +71,7 @@
         v1 = new SemanticVersion("1.2.3");
         v2 = new SemanticVersion("1.2.4");
         assert v1.isSupportedBy(v2);
-        assert v2.isSupportedBy(v1);
+        assert !v2.isSupportedBy(v1);
 
         v1 = new SemanticVersion("1.2.3");
         v2 = new SemanticVersion("1.3.3");
