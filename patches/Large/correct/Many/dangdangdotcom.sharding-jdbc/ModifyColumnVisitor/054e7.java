diff --git a/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/ModifyColumnVisitor.java b/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/ModifyColumnVisitor.java
index 1a20bed..8bff0a4 100644
--- a/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/ModifyColumnVisitor.java
+++ b/sharding-core/src/main/java/io/shardingsphere/core/parsing/antler/phrase/visitor/ModifyColumnVisitor.java
@@ -51,7 +51,7 @@
             ColumnDefinition column = VisitorUtils.visitColumnDefinition(each);
             if (null != column) {
                 alterStatement.getUpdateColumns().put(column.getName(), column);
-                postVisitColumnDefinition(ancestorNode, statement, column.getName());
+                postVisitColumnDefinition(each, statement, column.getName());
             }
         }
     }
