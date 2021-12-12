diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/IsStillRunningService.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/IsStillRunningService.java
index b427842..00b353a 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/IsStillRunningService.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/IsStillRunningService.java
@@ -81,12 +81,12 @@
                     invocation.nodeEngine, invocation.serviceName, isStillExecuting,
                     invocation.getTarget(), 0, 0, IS_EXECUTING_CALL_TIMEOUT, null, true);
             Future f = inv.invoke();
-            invocation.logger.warning("Asking if operation execution has been started: " + invocation);
+            invocation.logger.finest("Asking if operation execution has been started: " + invocation);
             executing = (Boolean) invocation.nodeEngine.toObject(f.get(IS_EXECUTING_CALL_TIMEOUT, TimeUnit.MILLISECONDS));
         } catch (Exception e) {
             invocation.logger.warning("While asking 'is-executing': " + invocation, e);
         }
-        invocation.logger.warning("'is-executing': " + executing + " -> " + invocation);
+        invocation.logger.finest("'is-executing': " + executing + " -> " + invocation);
         return executing;
     }
 
@@ -224,7 +224,7 @@
         @Override
         public void onResponse(Object response) {
             boolean executing = Boolean.TRUE.equals(response);
-            invocation.logger.warning("'is-executing': " + executing + " -> " + invocation);
+            invocation.logger.finest("'is-executing': " + executing + " -> " + invocation);
             if (!executing) {
                 setOperationTimeout();
             }
@@ -264,7 +264,7 @@
                     invocation.nodeEngine, invocation.serviceName, isStillRunningOperation,
                     invocation.getTarget(), 0, 0, IS_EXECUTING_CALL_TIMEOUT, callback, true);
 
-            invocation.logger.warning("Asking if operation execution has been started: " + invocation);
+            invocation.logger.finest("Asking if operation execution has been started: " + invocation);
             inv.invoke();
         }
     }
