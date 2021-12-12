diff --git a/liquibase-core/src/main/java/liquibase/parser/ChangeLogParserFactory.java b/liquibase-core/src/main/java/liquibase/parser/ChangeLogParserFactory.java
index aa36e8c..97ffddd 100644
--- a/liquibase-core/src/main/java/liquibase/parser/ChangeLogParserFactory.java
+++ b/liquibase-core/src/main/java/liquibase/parser/ChangeLogParserFactory.java
@@ -16,11 +16,11 @@
     private Comparator<ChangeLogParser> changelogParserComparator;
 
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new ChangeLogParserFactory();
     }
 
-    public static ChangeLogParserFactory getInstance() {
+    public static synchronized ChangeLogParserFactory getInstance() {
         if (instance == null) {
              instance = new ChangeLogParserFactory();
         }
