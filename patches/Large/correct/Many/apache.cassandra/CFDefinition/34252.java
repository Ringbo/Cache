diff --git a/src/java/org/apache/cassandra/cql3/CFDefinition.java b/src/java/org/apache/cassandra/cql3/CFDefinition.java
index 3266c95..23bedaf 100644
--- a/src/java/org/apache/cassandra/cql3/CFDefinition.java
+++ b/src/java/org/apache/cassandra/cql3/CFDefinition.java
@@ -152,7 +152,7 @@
 
     public Collection<Name> staticColumns()
     {
-        return regularColumns.values();
+        return staticColumns.values();
     }
 
     public Name compactValue()
