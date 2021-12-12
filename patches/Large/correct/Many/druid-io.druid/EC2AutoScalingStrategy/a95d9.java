diff --git a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/EC2AutoScalingStrategy.java b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/EC2AutoScalingStrategy.java
index 5422a21..45b5573 100644
--- a/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/EC2AutoScalingStrategy.java
+++ b/indexing-service/src/main/java/com/metamx/druid/indexing/coordinator/scaling/EC2AutoScalingStrategy.java
@@ -218,7 +218,7 @@
         }
     );
 
-    log.info("Performing lookup: %s --> %s", ips, retVal);
+    log.debug("Performing lookup: %s --> %s", ips, retVal);
 
     return retVal;
   }
@@ -250,7 +250,7 @@
         }
     );
 
-    log.info("Performing lookup: %s --> %s", nodeIds, retVal);
+    log.debug("Performing lookup: %s --> %s", nodeIds, retVal);
 
     return retVal;
   }
