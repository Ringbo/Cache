diff --git a/common/src/main/java/org/broadleafcommerce/common/extensibility/jpa/MergePersistenceUnitManager.java b/common/src/main/java/org/broadleafcommerce/common/extensibility/jpa/MergePersistenceUnitManager.java
index 117b3c9..c9c17c5 100644
--- a/common/src/main/java/org/broadleafcommerce/common/extensibility/jpa/MergePersistenceUnitManager.java
+++ b/common/src/main/java/org/broadleafcommerce/common/extensibility/jpa/MergePersistenceUnitManager.java
@@ -244,7 +244,7 @@
             for (PersistenceUnitInfo pui : mergedPus.values()) {
                 for (String managedClassName : pui.getManagedClassNames()) {
                     if (!entityMarkerClassTransformer.getTransformedClassNames().contains(managedClassName)) {
-                        LOG.trace("Should have transformed " + managedClassName + " but didn't");
+                        LOG.error("Should have transformed " + managedClassName + " but didn't");
                     }
                 }
             }
