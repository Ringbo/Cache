diff --git a/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java b/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java
index b72514d..5a3d8e5 100755
--- a/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java
+++ b/src/main/java/com/xiaoleilu/hutool/log/StaticLog.java
@@ -154,7 +154,7 @@
 	 * @param e 需在日志中堆栈打印的异常
 	 */
 	public static void error(Log log, Throwable e) {
-		error(log, e.getMessage());
+		error(log, e, e.getMessage());
 	}
 	
 	/**
