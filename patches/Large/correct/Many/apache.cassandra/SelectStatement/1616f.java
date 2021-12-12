diff --git a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
index c68a6b6..3b699b9 100644
--- a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
@@ -329,7 +329,7 @@
 
     private Collection<ByteBuffer> getKeys(final List<ByteBuffer> variables) throws InvalidRequestException
     {
-        assert keyRestriction != null || keyRestriction.isEquality();
+        assert keyRestriction != null && keyRestriction.isEquality();
 
         List<ByteBuffer> keys = new ArrayList<ByteBuffer>(keyRestriction.eqValues.size());
         for (Term t : keyRestriction.eqValues)
