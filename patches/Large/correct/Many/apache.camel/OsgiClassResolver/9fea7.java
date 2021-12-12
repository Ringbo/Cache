diff --git a/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiClassResolver.java b/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiClassResolver.java
index a9201d0..67a2779 100644
--- a/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiClassResolver.java
+++ b/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiClassResolver.java
@@ -69,7 +69,7 @@
 
     public URL loadResourceAsURL(String uri) {
         ObjectHelper.notEmpty(uri, "uri");
-        return bundleContext.getBundle().getEntry(uri);
+        return bundleContext.getBundle().getResource(uri);
     }
 
     protected Class<?> doLoadClass(String name, Bundle loader) {
