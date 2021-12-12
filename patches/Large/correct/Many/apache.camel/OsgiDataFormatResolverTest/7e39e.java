diff --git a/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiDataFormatResolverTest.java b/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiDataFormatResolverTest.java
index 3803a7f..2f41b0d 100644
--- a/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiDataFormatResolverTest.java
+++ b/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiDataFormatResolverTest.java
@@ -61,7 +61,7 @@
 
         private boolean fallback;
 
-        public SampleDataFormat(boolean fallback) {
+        SampleDataFormat(boolean fallback) {
             this.fallback = fallback;
         }
 
