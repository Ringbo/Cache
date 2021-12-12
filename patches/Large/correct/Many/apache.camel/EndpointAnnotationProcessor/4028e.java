diff --git a/tooling/apt/src/main/java/org/apache/camel/tools/apt/EndpointAnnotationProcessor.java b/tooling/apt/src/main/java/org/apache/camel/tools/apt/EndpointAnnotationProcessor.java
index cf9c3fd..280361b 100644
--- a/tooling/apt/src/main/java/org/apache/camel/tools/apt/EndpointAnnotationProcessor.java
+++ b/tooling/apt/src/main/java/org/apache/camel/tools/apt/EndpointAnnotationProcessor.java
@@ -817,7 +817,7 @@
                 return false;
             }
 
-            EndpointOption that = (EndpointOption) o;
+            ComponentOption that = (ComponentOption) o;
 
             if (!name.equals(that.name)) {
                 return false;
