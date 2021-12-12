diff --git a/sonar-db/src/main/java/org/sonar/db/version/v60/AddBColumnsToProjects.java b/sonar-db/src/main/java/org/sonar/db/version/v60/AddBColumnsToProjects.java
index 630a776..00ee9fd 100644
--- a/sonar-db/src/main/java/org/sonar/db/version/v60/AddBColumnsToProjects.java
+++ b/sonar-db/src/main/java/org/sonar/db/version/v60/AddBColumnsToProjects.java
@@ -48,7 +48,7 @@
       .addColumn(newVarcharColumnDefBuilder().setColumnName("b_module_uuid_path").setLimit(1500).setIsNullable(true).build())
       .addColumn(newVarcharColumnDefBuilder().setColumnName("b_name").setLimit(500).setIsNullable(true).build())
       .addColumn(newVarcharColumnDefBuilder().setColumnName("b_path").setLimit(2000).setIsNullable(true).build())
-      .addColumn(newVarcharColumnDefBuilder().setColumnName("b_qualifier").setLimit(3).setIsNullable(true).build())
+      .addColumn(newVarcharColumnDefBuilder().setColumnName("b_qualifier").setLimit(10).setIsNullable(true).build())
       .build());
   }
 
