diff --git a/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java b/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java
index 2dfaa8b..6dbbadf 100644
--- a/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java
+++ b/maven-core/src/main/java/org/apache/maven/plugin/PluginParameterExpressionEvaluator.java
@@ -85,19 +85,19 @@
             return expression;
         }
 
-        if ( expression.equals( "localRepository" ) )
+        if ( "localRepository".equals( expression ) )
         {
             value = context.getLocalRepository();
         }
-        else if ( expression.equals( "session" ) )
+        else if ( "session".equals( expression ) )
         {
             value = context;
         }
-        else if ( expression.equals( "project" ) )
+        else if ( "project".equals( expression ) )
         {
             value = project;
         }
-        else if ( expression.equals( "executedProject" ) )
+        else if ( "executedProject".equals( expression ) )
         {
             value = project.getExecutionProject();
         }
@@ -109,7 +109,7 @@
 
                 if ( pathSeparator > 0 )
                 {
-                    String pathExpression = expression.substring( 1, pathSeparator );
+                    String pathExpression = expression.substring( 0, pathSeparator );
                     value = ReflectionValueExtractor.evaluate( pathExpression, project );
                     value = value + expression.substring( pathSeparator );
                 }
@@ -177,7 +177,7 @@
                                                          e );
             }
         }
-        else if ( expression.equals( "basedir" ) )
+        else if ( "basedir".equals( expression ) )
         {
             value = project.getBasedir().getAbsolutePath();
         }
@@ -250,7 +250,7 @@
 
     public File alignToBaseDirectory( File file )
     {
-        File basedir = null;
+        File basedir;
 
         if ( project != null && project.getFile() != null )
         {
