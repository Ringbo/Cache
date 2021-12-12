diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/ClientRegressionTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/ClientRegressionTest.java
index b2449a1..0901dbf 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/ClientRegressionTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/ClientRegressionTest.java
@@ -195,7 +195,7 @@
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
-                hz1.getLifecycleService().terminate();
+                hz1.getLifecycleService().shutdown();
             }
         };
 
@@ -226,7 +226,7 @@
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
-                hz1.getLifecycleService().terminate();
+                hz1.getLifecycleService().shutdown();
             }
         };
 
