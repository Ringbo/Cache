diff --git a/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java b/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java
index 54a4c61..b72514d 100755
--- a/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java
+++ b/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java
@@ -154,7 +154,7 @@
 	 * @param e 需在日志中堆栈打印的异常
 	 */
 	public static void error(Log log, Throwable e) {
-		error(e, e.getMessage());
+		error(log, e.getMessage());
 	}
 	
 	/**
