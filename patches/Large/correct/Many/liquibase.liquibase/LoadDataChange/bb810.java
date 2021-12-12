diff --git a/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java b/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java
index b5ff557..202ed0a 100644
--- a/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java
+++ b/liquibase-core/src/main/java/liquibase/change/core/LoadDataChange.java
@@ -629,7 +629,7 @@
                     columnConfig.setType(liquibaseDataType.getLoadTypeName().toString());
                 } else {
                     LOG.warning(LogType.LOG, String.format(coreBundle.getString("unable.to.convert.load.data.type"),
-                        columnConfig.toString(), snapshotOfTable.toString(), liquibaseDataType.toString()));
+                        columnConfig.toString(), snapshotOfTable.toString(), dataType.toString()));
                 }
             }
         }
