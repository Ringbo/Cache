diff --git a/infrastructures/openshift/src/main/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInfrastructure.java b/infrastructures/openshift/src/main/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInfrastructure.java
index e0346bd..62b6582 100644
--- a/infrastructures/openshift/src/main/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInfrastructure.java
+++ b/infrastructures/openshift/src/main/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInfrastructure.java
@@ -60,7 +60,7 @@
 
         infrastructureProvisioner.provision(environment, openShiftEnvironment, id);
 
-        return runtimeContextFactory.create(originEnv,
+        return runtimeContextFactory.create(environment,
                                             openShiftEnvironment,
                                             id,
                                             this);
