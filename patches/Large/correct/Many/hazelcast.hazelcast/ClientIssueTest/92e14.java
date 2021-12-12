diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/ClientIssueTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/ClientIssueTest.java
index 2baf3f1..1347d97 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/ClientIssueTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/ClientIssueTest.java
@@ -194,7 +194,7 @@
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
-                hz1.getLifecycleService().terminate();
+                hz1.getLifecycleService().shutdown();
             }
         };
 
@@ -225,7 +225,7 @@
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
-                hz1.getLifecycleService().terminate();
+                hz1.getLifecycleService().shutdown();
             }
         };
 
