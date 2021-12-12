diff --git a/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportDBTaskTest.java b/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportDBTaskTest.java
index 42ade59..e3f7e4a 100644
--- a/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportDBTaskTest.java
+++ b/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportDBTaskTest.java
@@ -46,7 +46,7 @@
     @Test
     public void testExportCSV() throws Throwable
     {
-        ExportDBTask task = new ExportDBTask(testContext, filename -> {
+        ExportDBTask task = new ExportDBTask(targetContext, filename -> {
             assertThat(filename, is(not(nullValue())));
 
             File f = new File(filename);
