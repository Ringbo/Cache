diff --git a/camel-core/src/test/java/org/apache/camel/impl/DefaultCamelContextResolverTest.java b/camel-core/src/test/java/org/apache/camel/impl/DefaultCamelContextResolverTest.java
index 2284d9c..67f1c9c 100644
--- a/camel-core/src/test/java/org/apache/camel/impl/DefaultCamelContextResolverTest.java
+++ b/camel-core/src/test/java/org/apache/camel/impl/DefaultCamelContextResolverTest.java
@@ -150,7 +150,7 @@
 
         private boolean fallback;
 
-        public SampleComponent(boolean fallback) {
+        SampleComponent(boolean fallback) {
             this.fallback = fallback;
         }
 
@@ -172,7 +172,7 @@
 
         private boolean fallback;
 
-        public SampleDataFormat(boolean fallback) {
+        SampleDataFormat(boolean fallback) {
             this.fallback = fallback;
         }
 
@@ -199,7 +199,7 @@
 
         private boolean fallback;
 
-        public SampleLanguage(boolean fallback) {
+        SampleLanguage(boolean fallback) {
             this.fallback = fallback;
         }
 
