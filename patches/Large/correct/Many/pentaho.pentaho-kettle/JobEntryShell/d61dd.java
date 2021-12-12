diff --git a/src/org/pentaho/di/job/entries/shell/JobEntryShell.java b/src/org/pentaho/di/job/entries/shell/JobEntryShell.java
index f142b1a..0ad3552 100644
--- a/src/org/pentaho/di/job/entries/shell/JobEntryShell.java
+++ b/src/org/pentaho/di/job/entries/shell/JobEntryShell.java
@@ -566,7 +566,7 @@
 
 			if (getWorkDirectory() != null && !Const.isEmpty(Const.rtrim(getWorkDirectory())))
 			{
-				File file = new File(getWorkDirectory());
+				File file = new File(environmentSubstitute(getWorkDirectory()));
 				procBuilder.directory(file);
 			}
 			Process proc = procBuilder.start();
