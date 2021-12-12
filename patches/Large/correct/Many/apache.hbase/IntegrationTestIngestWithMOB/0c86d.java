diff --git a/hbase-it/src/test/java/org/apache/hadoop/hbase/IntegrationTestIngestWithMOB.java b/hbase-it/src/test/java/org/apache/hadoop/hbase/IntegrationTestIngestWithMOB.java
index 4697eed..b021cc4 100644
--- a/hbase-it/src/test/java/org/apache/hadoop/hbase/IntegrationTestIngestWithMOB.java
+++ b/hbase-it/src/test/java/org/apache/hadoop/hbase/IntegrationTestIngestWithMOB.java
@@ -60,7 +60,7 @@
   protected String[] getArgsForLoadTestToolInitTable() {
     List<String> args = new ArrayList<String>();
     args.add("-tn");
-    args.add(getTablename());
+    args.add(getTablename().getNameAsString());
     // pass all remaining args from conf with keys <test class name>.<load test tool arg>
     String clazz = this.getClass().getSimpleName();
     for (String arg : LOAD_TEST_TOOL_MOB_INIT_ARGS) {
@@ -104,7 +104,7 @@
   protected void initTable() throws IOException {
     super.initTable();
 
-    byte[] tableName = getTablename().getBytes();
+    byte[] tableName = getTablename().getName();
     HBaseAdmin admin = new HBaseAdmin(conf);
     HTableDescriptor tableDesc = admin.getTableDescriptor(tableName);
     LOG.info("Disabling table " + getTablename());
