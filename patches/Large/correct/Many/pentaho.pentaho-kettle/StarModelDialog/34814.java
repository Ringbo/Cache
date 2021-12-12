diff --git a/src-plugins/star-modeler/src/org/pentaho/di/starmodeler/StarModelDialog.java b/src-plugins/star-modeler/src/org/pentaho/di/starmodeler/StarModelDialog.java
index a1a19b0..b74ccfa 100644
--- a/src-plugins/star-modeler/src/org/pentaho/di/starmodeler/StarModelDialog.java
+++ b/src-plugins/star-modeler/src/org/pentaho/di/starmodeler/StarModelDialog.java
@@ -588,7 +588,7 @@
             LogicalColumn fromColumn = column;
             LogicalTable toTable = dimensionTable;
             LogicalColumn toColumn = tk;
-            LogicalRelationship relationship = new LogicalRelationship(LogicalModel, fromTable, toTable, fromColumn, toColumn);
+            LogicalRelationship relationship = new LogicalRelationship(logicalModel, fromTable, toTable, fromColumn, toColumn);
             logicalRelationships.add(relationship);
           }
         }
