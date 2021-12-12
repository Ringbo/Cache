diff --git a/contrib/views/slider/src/main/java/org/apache/ambari/view/slider/SliderAppsViewControllerImpl.java b/contrib/views/slider/src/main/java/org/apache/ambari/view/slider/SliderAppsViewControllerImpl.java
index 93c95a0..f60ac3b 100644
--- a/contrib/views/slider/src/main/java/org/apache/ambari/view/slider/SliderAppsViewControllerImpl.java
+++ b/contrib/views/slider/src/main/java/org/apache/ambari/view/slider/SliderAppsViewControllerImpl.java
@@ -459,7 +459,7 @@
     String rmAddress = viewContext.getProperties().get(PROPERTY_YARN_RM_ADDRESS);
     String rmSchedulerAddress = viewContext.getProperties().get(PROPERTY_YARN_RM_SCHEDULER_ADDRESS);
     String zkQuorum = viewContext.getProperties().get(PROPERTY_ZK_QUOROM);
-    boolean securedCluster = Boolean.getBoolean(viewContext.getProperties().get(PROPERTY_SLIDER_SECURITY_ENABLED));
+    boolean securedCluster = Boolean.valueOf(viewContext.getProperties().get(PROPERTY_SLIDER_SECURITY_ENABLED));
 
     HdfsConfiguration hdfsConfig = new HdfsConfiguration();
     YarnConfiguration yarnConfig = new YarnConfiguration(hdfsConfig);
