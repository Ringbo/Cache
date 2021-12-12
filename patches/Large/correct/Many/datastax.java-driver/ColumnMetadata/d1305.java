diff --git a/driver-core/src/main/java/com/datastax/driver/core/ColumnMetadata.java b/driver-core/src/main/java/com/datastax/driver/core/ColumnMetadata.java
index a0b9ef9..a32e38b 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/ColumnMetadata.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/ColumnMetadata.java
@@ -159,7 +159,7 @@
             if (type == null)
                 return null;
 
-            return new IndexMetadata(column, type, row.getString(INDEX_NAME));
+            return new IndexMetadata(column, row.getString(INDEX_NAME), type);
         
         }
     }
