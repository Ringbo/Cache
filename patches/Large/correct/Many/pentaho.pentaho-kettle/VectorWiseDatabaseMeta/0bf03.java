diff --git a/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java b/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
index 4308b47..8fbe19e 100644
--- a/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
+++ b/src-db/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
@@ -133,7 +133,7 @@
                     }
                     else
                     {
-                        if (length>4)
+                        if (length == -1 || length>4) // If the length is undefined or greater than 4, use a standard INTEGER
                         {
                             retval+="INTEGER";
                         }
