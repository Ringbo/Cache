diff --git a/community/bolt/src/test/java/org/neo4j/bolt/v1/runtime/ExecutionPlanConverterTest.java b/community/bolt/src/test/java/org/neo4j/bolt/v1/runtime/ExecutionPlanConverterTest.java
index 6ee48f4..0245371 100644
--- a/community/bolt/src/test/java/org/neo4j/bolt/v1/runtime/ExecutionPlanConverterTest.java
+++ b/community/bolt/src/test/java/org/neo4j/bolt/v1/runtime/ExecutionPlanConverterTest.java
@@ -75,8 +75,8 @@
         private final Set<String> identifiers;
         private final Map<String,Object> arguments;
 
-        public TestExecutionPlanDescription( String name, ProfilerStatistics profilerStatistics,
-                Set<String> identifiers, Map<String,Object> arguments )
+        TestExecutionPlanDescription( String name, ProfilerStatistics profilerStatistics, Set<String> identifiers,
+                Map<String,Object> arguments )
         {
             this.name = name;
             this.profilerStatistics = profilerStatistics;
