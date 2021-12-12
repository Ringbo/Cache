diff --git a/liquibase-core/src/main/java/liquibase/changelog/OfflineChangeLogHistoryService.java b/liquibase-core/src/main/java/liquibase/changelog/OfflineChangeLogHistoryService.java
index ff67b0f..b1851f4 100644
--- a/liquibase-core/src/main/java/liquibase/changelog/OfflineChangeLogHistoryService.java
+++ b/liquibase-core/src/main/java/liquibase/changelog/OfflineChangeLogHistoryService.java
@@ -114,7 +114,9 @@
                     "DESCRIPTION",
                     "COMMENTS",
                     "TAG",
-                    "LIQUIBASE"
+                    "LIQUIBASE",
+                    "CONTEXTS",
+                    "LABELS"                    
             });
         } finally {
             if (writer != null) {
@@ -252,7 +254,7 @@
                 csvWriter.writeNext(line);
             }
 
-            String[] newLine = new String[11];
+            String[] newLine = new String[13];
             newLine[COLUMN_ID] = changeSet.getId();
             newLine[COLUMN_AUTHOR] = changeSet.getAuthor();
             newLine[COLUMN_FILENAME] =  changeSet.getFilePath();
