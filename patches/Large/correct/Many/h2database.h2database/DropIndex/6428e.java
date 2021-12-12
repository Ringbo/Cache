diff --git a/h2/src/main/org/h2/command/ddl/DropIndex.java b/h2/src/main/org/h2/command/ddl/DropIndex.java
index 1be6118..0637976 100644
--- a/h2/src/main/org/h2/command/ddl/DropIndex.java
+++ b/h2/src/main/org/h2/command/ddl/DropIndex.java
@@ -60,7 +60,7 @@
                     if (Constraint.PRIMARY_KEY.equals(cons.getConstraintType())) {
                         pkConstraint = cons;
                     } else {
-                        throw DbException.get(ErrorCode.INDEX_BELONGS_TO_CONSTRAINT_1, indexName);
+                        throw DbException.get(ErrorCode.INDEX_BELONGS_TO_CONSTRAINT_1, indexName, cons.getName());
                     }
                 }
             }
