diff --git a/connector/src/main/java/org/jboss/as/connector/services/ResourceAdapterService.java b/connector/src/main/java/org/jboss/as/connector/services/ResourceAdapterService.java
index 4a1dc55..942ba84 100644
--- a/connector/src/main/java/org/jboss/as/connector/services/ResourceAdapterService.java
+++ b/connector/src/main/java/org/jboss/as/connector/services/ResourceAdapterService.java
@@ -30,7 +30,7 @@
 
     @Override
     public void start(StartContext context) throws StartException {
-        log.errorf("started ResourceAdapterService %s", context.getController().getName());
+        log.infof("started ResourceAdapterService %s", context.getController().getName());
 
     }
 
