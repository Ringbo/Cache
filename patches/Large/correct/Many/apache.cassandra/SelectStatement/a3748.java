diff --git a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
index e058cff..02833e7 100644
--- a/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/SelectStatement.java
@@ -626,7 +626,7 @@
                             throw new InvalidRequestException(String.format("Invalid null clustering key part %s", name));
                         ColumnNameBuilder copy = builder.copy().add(val);
                         // See below for why this
-                        s.add((b == Bound.END && copy.remainingCount() > 0) ? copy.buildAsEndOfRange() : copy.build());
+                        s.add((eocBound == Bound.END && copy.remainingCount() > 0) ? copy.buildAsEndOfRange() : copy.build());
                     }
                     return new ArrayList<ByteBuffer>(s);
                 }
@@ -652,7 +652,7 @@
         // with 2ndary index is done, and with the the partition provided with an EQ, we'll end up here, and in that
         // case using the eoc would be bad, since for the random partitioner we have no guarantee that
         // builder.buildAsEndOfRange() will sort after builder.build() (see #5240).
-        return Collections.singletonList((bound == Bound.END && builder.remainingCount() > 0) ? builder.buildAsEndOfRange() : builder.build());
+        return Collections.singletonList((eocBound == Bound.END && builder.remainingCount() > 0) ? builder.buildAsEndOfRange() : builder.build());
     }
 
     private List<ByteBuffer> getRequestedBound(Bound b, List<ByteBuffer> variables) throws InvalidRequestException
