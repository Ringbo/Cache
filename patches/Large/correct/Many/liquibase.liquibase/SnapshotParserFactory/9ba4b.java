diff --git a/liquibase-core/src/main/java/liquibase/parser/SnapshotParserFactory.java b/liquibase-core/src/main/java/liquibase/parser/SnapshotParserFactory.java
index 92889fc..0be0c92 100644
--- a/liquibase-core/src/main/java/liquibase/parser/SnapshotParserFactory.java
+++ b/liquibase-core/src/main/java/liquibase/parser/SnapshotParserFactory.java
@@ -19,11 +19,11 @@
     private Comparator<SnapshotParser> snapshotParserComparator;
 
 
-    public static void reset() {
+    public static synchronized void reset() {
         instance = new SnapshotParserFactory();
     }
 
-    public static SnapshotParserFactory getInstance() {
+    public static synchronized SnapshotParserFactory getInstance() {
         if (instance == null) {
              instance = new SnapshotParserFactory();
         }
