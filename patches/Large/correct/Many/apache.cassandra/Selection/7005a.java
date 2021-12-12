diff --git a/src/java/org/apache/cassandra/cql3/statements/Selection.java b/src/java/org/apache/cassandra/cql3/statements/Selection.java
index 6a70130..2f5b948 100644
--- a/src/java/org/apache/cassandra/cql3/statements/Selection.java
+++ b/src/java/org/apache/cassandra/cql3/statements/Selection.java
@@ -262,7 +262,7 @@
             }
         }
 
-        private boolean isDead(IColumn c)
+        private boolean isDead(Column c)
         {
             return c == null || c.isMarkedForDelete();
         }
