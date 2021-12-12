diff --git a/bundles/io/org.eclipse.smarthome.io.rest.log/src/main/java/org/eclipse/smarthome/io/rest/log/internal/LogHandler.java b/bundles/io/org.eclipse.smarthome.io.rest.log/src/main/java/org/eclipse/smarthome/io/rest/log/internal/LogHandler.java
index b0da27d..c1c52d1 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.log/src/main/java/org/eclipse/smarthome/io/rest/log/internal/LogHandler.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.log/src/main/java/org/eclipse/smarthome/io/rest/log/internal/LogHandler.java
@@ -132,7 +132,7 @@
             LOG_BUFFER.pollLast(); // Remove last element of Deque
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     /**
