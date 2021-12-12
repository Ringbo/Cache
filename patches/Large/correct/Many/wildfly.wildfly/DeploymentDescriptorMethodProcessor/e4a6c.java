diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/dd/DeploymentDescriptorMethodProcessor.java b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/dd/DeploymentDescriptorMethodProcessor.java
index 45ff387..9dc8ea1 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/dd/DeploymentDescriptorMethodProcessor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/dd/DeploymentDescriptorMethodProcessor.java
@@ -179,7 +179,7 @@
             final SessionBeanMetaData sessionBeanMetadata = (SessionBeanMetaData) metaData;
             // pre-passivate(s) of the interceptor configured (if any) in the deployment descriptor
             final LifecycleCallbacksMetaData prePassivates = sessionBeanMetadata.getPrePassivates();
-            if (preDestroys != null) {
+            if (prePassivates != null) {
                 for (final LifecycleCallbackMetaData prePassivate : prePassivates) {
                     final InterceptorClassDescription.Builder builder = InterceptorClassDescription.builder();
                     final String methodName = prePassivate.getMethodName();
