diff --git a/src/java/org/apache/cassandra/cql3/statements/DropTypeStatement.java b/src/java/org/apache/cassandra/cql3/statements/DropTypeStatement.java
index a3b82a4..94edd01 100644
--- a/src/java/org/apache/cassandra/cql3/statements/DropTypeStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/DropTypeStatement.java
@@ -121,7 +121,7 @@
             else if (toCheck instanceof SetType)
                 return isUsedBy(((SetType)toCheck).getElementsType());
             else
-                return isUsedBy(((MapType)toCheck).getKeysType()) || isUsedBy(((MapType)toCheck).getKeysType());
+                return isUsedBy(((MapType)toCheck).getKeysType()) || isUsedBy(((MapType)toCheck).getValuesType());
         }
         return false;
     }
