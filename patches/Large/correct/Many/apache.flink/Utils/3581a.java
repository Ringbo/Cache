diff --git a/flink-java/src/main/java/org/apache/flink/api/java/Utils.java b/flink-java/src/main/java/org/apache/flink/api/java/Utils.java
index 44e176c..0184e58 100644
--- a/flink-java/src/main/java/org/apache/flink/api/java/Utils.java
+++ b/flink-java/src/main/java/org/apache/flink/api/java/Utils.java
@@ -53,7 +53,7 @@
 	public static String getCallLocationName(int depth) {
 		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
 
-		if (stackTrace.length < depth) {
+		if (stackTrace.length <= depth) {
 			return "<unknown>";
 		}
 
