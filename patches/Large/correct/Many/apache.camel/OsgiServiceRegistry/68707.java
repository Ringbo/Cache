diff --git a/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiServiceRegistry.java b/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiServiceRegistry.java
index 72a60e6..f120107 100644
--- a/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiServiceRegistry.java
+++ b/components/camel-core-osgi/src/main/java/org/apache/camel/core/osgi/OsgiServiceRegistry.java
@@ -144,7 +144,7 @@
         this.serviceReferenceUsageMap.clear();
     }
 
-    void drainServiceUsage(ServiceReference<?> serviceReference, AtomicLong serviceUsageCount) {
+    private void drainServiceUsage(ServiceReference<?> serviceReference, AtomicLong serviceUsageCount) {
         if (serviceUsageCount != null && serviceReference != null) {
             while(serviceUsageCount.decrementAndGet() >= 0) {
                 this.bundleContext.ungetService(serviceReference);
@@ -152,7 +152,7 @@
         }
     }
     
-    void incrementServiceUsage(ServiceReference<?> sr) {
+    private void incrementServiceUsage(ServiceReference<?> sr) {
         AtomicLong serviceUsageCount = this.serviceReferenceUsageMap.get(sr);
         if (serviceUsageCount != null) {
             serviceUsageCount.incrementAndGet();
