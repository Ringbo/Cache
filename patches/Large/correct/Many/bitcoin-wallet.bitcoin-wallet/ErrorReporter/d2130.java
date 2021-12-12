diff --git a/src/de/schildbach/wallet/ErrorReporter.java b/src/de/schildbach/wallet/ErrorReporter.java
index b62c88a..332253f 100644
--- a/src/de/schildbach/wallet/ErrorReporter.java
+++ b/src/de/schildbach/wallet/ErrorReporter.java
@@ -69,7 +69,7 @@
 		return instance;
 	}
 
-	public void init(final Context context)
+	public synchronized void init(final Context context)
 	{
 		previousHandler = Thread.getDefaultUncaughtExceptionHandler();
 		Thread.setDefaultUncaughtExceptionHandler(this);
@@ -145,7 +145,7 @@
 		return totalBlocks * blockSize;
 	}
 
-	public void uncaughtException(final Thread t, final Throwable e)
+	public synchronized void uncaughtException(final Thread t, final Throwable e)
 	{
 		report.append("=== collected at exception time ===\n\n");
 
@@ -271,7 +271,7 @@
 				appendReport(report, f, indent + 1);
 	}
 
-	public void check(final Context context)
+	public synchronized void check(final Context context)
 	{
 		if (!stackTraceFile.exists())
 			return;
