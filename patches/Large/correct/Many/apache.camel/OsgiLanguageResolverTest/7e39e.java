diff --git a/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiLanguageResolverTest.java b/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiLanguageResolverTest.java
index 09fa281..8e5b302 100644
--- a/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiLanguageResolverTest.java
+++ b/components/camel-core-osgi/src/test/java/org/apache/camel/core/osgi/OsgiLanguageResolverTest.java
@@ -67,7 +67,7 @@
 
         private boolean fallback;
 
-        public SampleLanguage(boolean fallback) {
+        SampleLanguage(boolean fallback) {
             this.fallback = fallback;
         }
 
