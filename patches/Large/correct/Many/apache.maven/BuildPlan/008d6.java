diff --git a/maven-core/src/main/java/org/apache/maven/lifecycle/plan/BuildPlan.java b/maven-core/src/main/java/org/apache/maven/lifecycle/plan/BuildPlan.java
index 1e637bc..128fad1 100644
--- a/maven-core/src/main/java/org/apache/maven/lifecycle/plan/BuildPlan.java
+++ b/maven-core/src/main/java/org/apache/maven/lifecycle/plan/BuildPlan.java
@@ -256,14 +256,14 @@
                 {
                     bindings.add( StateManagementUtils.createStartForkedExecutionMojoBinding() );
                     bindings.addAll( forkedBindings );
-                    bindings.add( StateManagementUtils.createClearForkedExecutionMojoBinding() );
+                    bindings.add( StateManagementUtils.createEndForkedExecutionMojoBinding() );
                 }
 
                 bindings.add( mojoBinding );
 
                 if ( !forkedBindings.isEmpty() )
                 {
-                    bindings.add( StateManagementUtils.createEndForkedExecutionMojoBinding() );
+                    bindings.add( StateManagementUtils.createClearForkedExecutionMojoBinding() );
                 }
             }
             else
