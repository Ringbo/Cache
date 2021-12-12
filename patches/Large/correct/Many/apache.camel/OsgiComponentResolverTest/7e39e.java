diff --git a/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiComponentResolverTest.java b/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiComponentResolverTest.java
index c9a4d14..85c667f 100644
--- a/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiComponentResolverTest.java
+++ b/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiComponentResolverTest.java
@@ -69,7 +69,7 @@
 
         private boolean fallback;
 
-        public SampleComponent(boolean fallback) {
+        SampleComponent(boolean fallback) {
             this.fallback = fallback;
         }
 
