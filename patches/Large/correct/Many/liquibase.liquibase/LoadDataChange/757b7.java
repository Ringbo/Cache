diff --git a/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java b/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java
index c4917fb..04b7812 100644
--- a/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java
+++ b/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java
@@ -628,7 +628,7 @@
                     columnConfig.setType(liquibaseDataType.getLoadTypeName().toString());
                 } else {
                     LOG.warning(LogType.LOG, String.format(coreBundle.getString("unable.to.convert.load.data.type"),
-                        columnConfig.toString(), snapshotOfTable.toString(), liquibaseDataType.toString()));
+                        columnConfig.toString(), snapshotOfTable.toString(), dataType.toString()));
                 }
             }
         }
