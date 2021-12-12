diff --git a/core/src/test/java/org/elasticsearch/monitor/jvm/JvmInfoTests.java b/core/src/test/java/org/elasticsearch/monitor/jvm/JvmInfoTests.java
index 7504ae6..82b264a 100644
--- a/core/src/test/java/org/elasticsearch/monitor/jvm/JvmInfoTests.java
+++ b/core/src/test/java/org/elasticsearch/monitor/jvm/JvmInfoTests.java
@@ -29,7 +29,7 @@
         // if we are running on HotSpot, and the test JVM was started
         // with UseG1GC, then JvmInfo should successfully report that
         // G1GC is enabled
-        if (Constants.JVM_NAME.contains("HotSpot")) {
+        if (Constants.JVM_NAME.contains("HotSpot") || Constants.JVM_NAME.contains("OpenJDK")) {
             assertEquals(Boolean.toString(isG1GCEnabled()), JvmInfo.jvmInfo().useG1GC());
         } else {
             assertEquals("unknown", JvmInfo.jvmInfo().useG1GC());
