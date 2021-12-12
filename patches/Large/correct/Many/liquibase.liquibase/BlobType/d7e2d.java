diff --git a/liquibase-core/src/main/java/liquibase/datatype/core/BlobType.java b/liquibase-core/src/main/java/liquibase/datatype/core/BlobType.java
index dd461be..0d1acee 100644
--- a/liquibase-core/src/main/java/liquibase/datatype/core/BlobType.java
+++ b/liquibase-core/src/main/java/liquibase/datatype/core/BlobType.java
@@ -93,7 +93,7 @@
                 return new DatabaseDataType("BFILE");
             }
 
-            if (originalDefinition.toLowerCase().startsWith("raw")) {
+            if (originalDefinition.toLowerCase().startsWith("raw") || originalDefinition.toLowerCase().startsWith("binary")) {
                 return new DatabaseDataType("RAW", getParameters());
             }
 
