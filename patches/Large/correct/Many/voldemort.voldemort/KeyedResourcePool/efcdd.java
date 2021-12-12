diff --git a/src/java/voldemort/utils/pool/KeyedResourcePool.java b/src/java/voldemort/utils/pool/KeyedResourcePool.java
index 276a87c..a115acc 100644
--- a/src/java/voldemort/utils/pool/KeyedResourcePool.java
+++ b/src/java/voldemort/utils/pool/KeyedResourcePool.java
@@ -99,7 +99,7 @@
                 long timeRemainingNs = this.timeoutNs - (System.nanoTime() - startNs);
                 if(timeRemainingNs < 0)
                     throw new TimeoutException("Could not acquire resource in "
-                                               + (this.timeoutNs * Time.NS_PER_MS) + " ms.");
+                                               + (this.timeoutNs / Time.NS_PER_MS) + " ms.");
                 resource = checkoutOrCreateResource(key, resources, timeRemainingNs);
                 if(objectFactory.validate(key, resource))
                     return resource;
@@ -133,7 +133,7 @@
         resource = pool.blockingGet(timeoutNs);
         if(resource == null)
             throw new TimeoutException("Timed out wait for resource after "
-                                       + (timeoutNs * Time.NS_PER_MS) + " ms.");
+                                       + (timeoutNs / Time.NS_PER_MS) + " ms.");
 
         return resource;
     }
