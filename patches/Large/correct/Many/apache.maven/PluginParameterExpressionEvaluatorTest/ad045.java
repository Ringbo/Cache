diff --git a/maven-core/src/test/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorTest.java b/maven-core/src/test/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorTest.java
index c6e1563..63942cd 100644
--- a/maven-core/src/test/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorTest.java
+++ b/maven-core/src/test/java/org/apache/maven/plugin/PluginParameterExpressionEvaluatorTest.java
@@ -199,8 +199,8 @@
         throws CycleDetectedException, DuplicateProjectException
     {
         return new MavenSession( container, new Settings(), repo, new DefaultEventDispatcher(),
-                                 new ReactorManager( Collections.EMPTY_LIST ), Collections.EMPTY_LIST, ".",
-                                 new Properties(), new Date() );
+                                 new ReactorManager( Collections.EMPTY_LIST, ReactorManager.FAIL_FAST ),
+                                 Collections.EMPTY_LIST, ".", new Properties(), new Date() );
     }
 
     public void testLocalRepositoryExtraction()
