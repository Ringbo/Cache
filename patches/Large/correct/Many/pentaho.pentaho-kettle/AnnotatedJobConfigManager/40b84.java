diff --git a/src/org/pentaho/di/core/config/AnnotatedJobConfigManager.java b/src/org/pentaho/di/core/config/AnnotatedJobConfigManager.java
index 8c18a22..5a6abdb 100644
--- a/src/org/pentaho/di/core/config/AnnotatedJobConfigManager.java
+++ b/src/org/pentaho/di/core/config/AnnotatedJobConfigManager.java
@@ -82,7 +82,7 @@
 			String name = BaseMessages.getString(packageName, job.name());
 			if (name.startsWith("!") && name.endsWith("!")) name=Messages.getString(job.name());
 			LogWriter.getInstance().setLogLevel(oldLogLevel); // restore loglevel, when the last alternative fails, log it when loglevel is detailed
-			if (name.startsWith("!") && name.endsWith("!")) name=BaseMessages.getString(altPackageName, job.name());
+			if (!Const.isEmpty(job.name()) && name.startsWith("!") && name.endsWith("!")) name=BaseMessages.getString(altPackageName, job.name());
 			if (name.startsWith("!") && name.endsWith("!")) name=job.name(); // Nothing to translate, keep it like it is. 
 			
 			// Determine the i18n tool tip text for the step (the extended description)
