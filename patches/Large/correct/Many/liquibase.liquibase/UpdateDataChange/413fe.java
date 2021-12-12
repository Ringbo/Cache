diff --git a/liquibase-core/src/main/java/liquibase/change/core/UpdateDataChange.java b/liquibase-core/src/main/java/liquibase/change/core/UpdateDataChange.java
index 2cd0a4e..669896f 100644
--- a/liquibase-core/src/main/java/liquibase/change/core/UpdateDataChange.java
+++ b/liquibase-core/src/main/java/liquibase/change/core/UpdateDataChange.java
@@ -46,7 +46,8 @@
             if (column.getValueBlobFile() != null) {
                 needsPreparedStatement = true;
             }
-            if (column.getValueClobFile() != null) {
+            if (column.getValueClobFile() != null
+                || (column.getType() != null && column.getType().equalsIgnoreCase("CLOB"))) {
                 needsPreparedStatement = true;
             }
         }
