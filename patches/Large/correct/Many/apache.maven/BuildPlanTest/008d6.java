diff --git a/maven-core/src/test/java/org/apache/maven/lifecycle/plan/BuildPlanTest.java b/maven-core/src/test/java/org/apache/maven/lifecycle/plan/BuildPlanTest.java
index 5744176..6907874 100644
--- a/maven-core/src/test/java/org/apache/maven/lifecycle/plan/BuildPlanTest.java
+++ b/maven-core/src/test/java/org/apache/maven/lifecycle/plan/BuildPlanTest.java
@@ -45,7 +45,7 @@
 
         check.add( mb );
 
-        check.add( StateManagementUtils.createClearForkedExecutionMojoBinding() );
+        check.add( StateManagementUtils.createEndForkedExecutionMojoBinding() );
 
         binding.getGenerateSources().addBinding( mb );
 
@@ -62,7 +62,7 @@
 
         check.add( eclipseBinding );
 
-        check.add( StateManagementUtils.createEndForkedExecutionMojoBinding() );
+        check.add( StateManagementUtils.createClearForkedExecutionMojoBinding() );
 
         BuildPlan plan = new BuildPlan( new LifecycleBindings(), tasks );
 
