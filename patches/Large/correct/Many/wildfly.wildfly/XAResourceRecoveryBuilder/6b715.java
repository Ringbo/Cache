diff --git a/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/XAResourceRecoveryBuilder.java b/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/XAResourceRecoveryBuilder.java
index a6e6cf3..a781e42 100644
--- a/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/XAResourceRecoveryBuilder.java
+++ b/clustering/infinispan/extension/src/main/java/org/jboss/as/clustering/infinispan/subsystem/XAResourceRecoveryBuilder.java
@@ -78,7 +78,7 @@
         };
         Consumer<XAResourceRecovery> destroyer = recovery -> {
             if (recovery != null) {
-                this.registry.getValue().addXAResourceRecovery(recovery);
+                this.registry.getValue().removeXAResourceRecovery(recovery);
             }
         };
         Service<XAResourceRecovery> service = new SuppliedValueService<>(Function.identity(), supplier, destroyer);
