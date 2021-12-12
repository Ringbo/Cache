diff --git a/src/java/org/apache/cassandra/cql3/statements/ColumnGroupMap.java b/src/java/org/apache/cassandra/cql3/statements/ColumnGroupMap.java
index 077a034..58428ed 100644
--- a/src/java/org/apache/cassandra/cql3/statements/ColumnGroupMap.java
+++ b/src/java/org/apache/cassandra/cql3/statements/ColumnGroupMap.java
@@ -136,13 +136,13 @@
 
             if (currentGroup == null)
             {
-                currentGroup = new ColumnGroupMap(current, composite.isStaticName(c.name()));
+                currentGroup = new ColumnGroupMap(current, CompositeType.isStaticName(c.name()));
                 currentGroup.add(current, idx, c);
                 previous = current;
                 return;
             }
 
-            if (!isSameGroup(current))
+            if ((currentGroup.isStatic && !CompositeType.isStaticName(c.name())) || !isSameGroup(current))
             {
                 groups.add(currentGroup);
                 // Note that we know that only the first group built can be static
