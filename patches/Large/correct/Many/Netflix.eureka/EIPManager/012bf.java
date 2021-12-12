diff --git a/eureka-core/src/main/java/com/netflix/eureka/util/EIPManager.java b/eureka-core/src/main/java/com/netflix/eureka/util/EIPManager.java
index 4c4839f..0cda245 100644
--- a/eureka-core/src/main/java/com/netflix/eureka/util/EIPManager.java
+++ b/eureka-core/src/main/java/com/netflix/eureka/util/EIPManager.java
@@ -231,7 +231,7 @@
         if (availableEIPList == null || availableEIPList.isEmpty()) {
             throw new RuntimeException("Cannot find a free EIP to bind");
         }
-        return eipCandidates.iterator().next();
+        return availableEIPList.iterator().next();
     }
 
     /**
