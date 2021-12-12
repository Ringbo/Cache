diff --git a/components/camel-blueprint/src/test/java/org/apache/camel/blueprint/BlueprintComponentResolverTest.java b/components/camel-blueprint/src/test/java/org/apache/camel/blueprint/BlueprintComponentResolverTest.java
index 5d30fc4..de4ccc0 100644
--- a/components/camel-blueprint/src/test/java/org/apache/camel/blueprint/BlueprintComponentResolverTest.java
+++ b/components/camel-blueprint/src/test/java/org/apache/camel/blueprint/BlueprintComponentResolverTest.java
@@ -60,7 +60,7 @@
 
         private boolean fallback;
 
-        public SampleComponent(boolean fallback) {
+        SampleComponent(boolean fallback) {
             this.fallback = fallback;
         }
 
