diff --git a/db/src/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java b/db/src/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
index 4308b47..c6e19cc 100644
--- a/db/src/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
+++ b/db/src/org/pentaho/di/core/database/VectorWiseDatabaseMeta.java
@@ -133,7 +133,7 @@
                     }
                     else
                     {
-                        if (length>4)
+                        if (length == -1 || length>4)
                         {
                             retval+="INTEGER";
                         }
