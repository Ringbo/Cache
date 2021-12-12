diff --git a/src/java/org/apache/cassandra/transport/DataType.java b/src/java/org/apache/cassandra/transport/DataType.java
index 0cb9d2d..80528e7 100644
--- a/src/java/org/apache/cassandra/transport/DataType.java
+++ b/src/java/org/apache/cassandra/transport/DataType.java
@@ -159,7 +159,7 @@
                 else
                 {
                     assert type instanceof SetType;
-                    return Pair.<DataType, Object>create(LIST, ((SetType)type).elements);
+                    return Pair.<DataType, Object>create(SET, ((SetType)type).elements);
                 }
             }
             return Pair.<DataType, Object>create(CUSTOM, type.toString());
