diff --git a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
index 301c7c4..ec50ef9 100644
--- a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
@@ -352,7 +352,7 @@
 
     private ByteBuffer getKeyBound(Bound b, List<ByteBuffer> variables) throws InvalidRequestException
     {
-        return buildBound(b, keyRestrictions, cfDef.getKeyNameBuilder(), variables);
+        return buildBound(b, cfDef.keys.values(), keyRestrictions, isReversed, cfDef.getKeyNameBuilder(), variables);
     }
 
     private Token getTokenBound(Bound b, List<ByteBuffer> variables, IPartitioner<?> p) throws InvalidRequestException
@@ -499,20 +499,25 @@
         }
     }
 
-    private ByteBuffer buildBound(Bound bound, Restriction[] restrictions, ColumnNameBuilder builder, List<ByteBuffer> variables) throws InvalidRequestException
+    private static ByteBuffer buildBound(Bound bound,
+                                         Collection<CFDefinition.Name> names,
+                                         Restriction[] restrictions,
+                                         boolean isReversed,
+                                         ColumnNameBuilder builder,
+                                         List<ByteBuffer> variables) throws InvalidRequestException
     {
         // The end-of-component of composite doesn't depend on whether the
         // component type is reversed or not (i.e. the ReversedType is applied
         // to the component comparator but not to the end-of-component itself),
         // it only depends on whether the slice is reversed
         Bound eocBound = isReversed ? Bound.reverse(bound) : bound;
-        for (CFDefinition.Name name : cfDef.columns.values())
+        for (CFDefinition.Name name : names)
         {
             // In a restriction, we always have Bound.START < Bound.END for the "base" comparator.
             // So if we're doing a reverse slice, we must inverse the bounds when giving them as start and end of the slice filter.
             // But if the actual comparator itself is reversed, we must inversed the bounds too.
             Bound b = isReversed == isReversedType(name) ? bound : Bound.reverse(bound);
-            Restriction r = columnRestrictions[name.position];
+            Restriction r = restrictions[name.position];
             if (r == null || (!r.isEquality() && r.bound(b) == null))
             {
                 // There wasn't any non EQ relation on that key, we select all records having the preceding component as prefix.
@@ -543,7 +548,7 @@
     private ByteBuffer getRequestedBound(Bound b, List<ByteBuffer> variables) throws InvalidRequestException
     {
         assert isColumnRange();
-        return buildBound(b, columnRestrictions, cfDef.getColumnNameBuilder(), variables);
+        return buildBound(b, cfDef.columns.values(), columnRestrictions, isReversed, cfDef.getColumnNameBuilder(), variables);
     }
 
     private List<IndexExpression> getIndexExpressions(List<ByteBuffer> variables) throws InvalidRequestException
