diff --git a/indexing-service/src/main/java/org/apache/druid/indexing/overlord/TaskRunnerUtils.java b/indexing-service/src/main/java/org/apache/druid/indexing/overlord/TaskRunnerUtils.java
index 176a3a1..6352b86 100644
--- a/indexing-service/src/main/java/org/apache/druid/indexing/overlord/TaskRunnerUtils.java
+++ b/indexing-service/src/main/java/org/apache/druid/indexing/overlord/TaskRunnerUtils.java
@@ -99,12 +99,12 @@
     }
   }
 
-  public static URL makeWorkerURL(Worker worker, String pathFormat, Object... pathParams)
+  public static URL makeWorkerURL(Worker worker, String pathFormat, String... pathParams)
   {
     Preconditions.checkArgument(pathFormat.startsWith("/"), "path must start with '/': %s", pathFormat);
     final String path = StringUtils.format(
         pathFormat,
-        Arrays.stream(pathParams).map(s -> StringUtils.urlEncode(s.toString())).toArray()
+        Arrays.stream(pathParams).map(StringUtils::urlEncode).toArray()
     );
 
     try {
