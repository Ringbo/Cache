diff --git a/ambari-server/src/main/java/org/apache/ambari/server/view/ViewRegistry.java b/ambari-server/src/main/java/org/apache/ambari/server/view/ViewRegistry.java
index 5f775a6..e48c88e 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/view/ViewRegistry.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/view/ViewRegistry.java
@@ -1274,7 +1274,7 @@
       setViewStatus(viewDefinition, ViewEntity.ViewStatus.DEPLOYED, "Deployed " + extractedArchiveDirPath + ".");
 
     } catch (Exception e) {
-      String msg = "Caught exception loading view " + viewDefinition.getViewName();
+      String msg = "Caught exception loading view " + viewDefinition.getName();
 
       setViewStatus(viewDefinition, ViewEntity.ViewStatus.ERROR, msg + " : " + e.getMessage());
       LOG.error(msg, e);
