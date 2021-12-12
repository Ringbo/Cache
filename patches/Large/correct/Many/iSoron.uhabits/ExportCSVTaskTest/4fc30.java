diff --git a/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportCSVTaskTest.java b/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportCSVTaskTest.java
index 56bf83c..daaf5e4 100644
--- a/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportCSVTaskTest.java
+++ b/app/src/androidTest/java/org/isoron/uhabits/tasks/ExportCSVTaskTest.java
@@ -56,7 +56,7 @@
         for (Habit h : habitList) selected.add(h);
 
         taskRunner.execute(
-            new ExportCSVTask(testContext,habitList, selected, archiveFilename -> {
+            new ExportCSVTask(targetContext,habitList, selected, archiveFilename -> {
                 assertThat(archiveFilename, is(not(nullValue())));
                 File f = new File(archiveFilename);
                 assertTrue(f.exists());
