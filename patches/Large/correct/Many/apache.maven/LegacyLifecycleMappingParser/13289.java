diff --git a/maven-core/src/main/java/org/apache/maven/lifecycle/binding/LegacyLifecycleMappingParser.java b/maven-core/src/main/java/org/apache/maven/lifecycle/binding/LegacyLifecycleMappingParser.java
index 2837abb..e35cb80 100644
--- a/maven-core/src/main/java/org/apache/maven/lifecycle/binding/LegacyLifecycleMappingParser.java
+++ b/maven-core/src/main/java/org/apache/maven/lifecycle/binding/LegacyLifecycleMappingParser.java
@@ -39,7 +39,7 @@
 
         for ( Iterator it = lifecycles.iterator(); it.hasNext(); )
         {
-            LegacyLifecycle lifecycle = (LegacyLifecycle) it.next();
+            Lifecycle lifecycle = (Lifecycle) it.next();
 
             if ( "clean".equals( lifecycle.getId() ) )
             {
