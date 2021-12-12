diff --git a/liquibase-core/src/main/java/liquibase/changelog/ChangeLogHistoryServiceFactory.java b/liquibase-core/src/main/java/liquibase/changelog/ChangeLogHistoryServiceFactory.java
index bad97d1..336a7ba 100644
--- a/liquibase-core/src/main/java/liquibase/changelog/ChangeLogHistoryServiceFactory.java
+++ b/liquibase-core/src/main/java/liquibase/changelog/ChangeLogHistoryServiceFactory.java
@@ -30,7 +30,7 @@
     }
 
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = null;
     }
 
@@ -93,7 +93,7 @@
             }
     }
 
-    public void resetAll() {
+    public synchronized void resetAll() {
         for (ChangeLogHistoryService changeLogHistoryService : registry) {
             changeLogHistoryService.reset();
         }
