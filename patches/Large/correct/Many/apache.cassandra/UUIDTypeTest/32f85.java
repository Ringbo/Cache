diff --git a/test/unit/org/apache/cassandra/db/marshal/UUIDTypeTest.java b/test/unit/org/apache/cassandra/db/marshal/UUIDTypeTest.java
index a9b2dd3..cd01048 100644
--- a/test/unit/org/apache/cassandra/db/marshal/UUIDTypeTest.java
+++ b/test/unit/org/apache/cassandra/db/marshal/UUIDTypeTest.java
@@ -150,7 +150,7 @@
         assertEquals("Expected " + describeCompare(u1, u2, expC) + ", got "
                 + describeCompare(u1, u2, c), expC, c);
 
-        if (u1.version() == 1)
+        if (u1.version() == 1 && u2.version() == 1)
             assertEquals(c, sign(TimeUUIDType.instance.compare(bytebuffer(u1), bytebuffer(u2))));
 
         logJdkUUIDCompareToVariance(u1, u2, c);
