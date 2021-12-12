diff --git a/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/RenameColumnVisitor.java b/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/RenameColumnVisitor.java
index 5de56e4..d539779 100644
--- a/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/RenameColumnVisitor.java
+++ b/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/RenameColumnVisitor.java
@@ -56,7 +56,7 @@
             oldDefinition = new ColumnDefinition(newName, null, null, false);
         }
 
-        alterStatement.getUpdateColumns().put(newName, oldDefinition);        
+        alterStatement.getUpdateColumns().put(oldName, oldDefinition);
     }
 
 }
