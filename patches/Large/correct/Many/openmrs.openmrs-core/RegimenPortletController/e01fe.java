diff --git a/src/web/org/openmrs/web/controller/RegimenPortletController.java b/src/web/org/openmrs/web/controller/RegimenPortletController.java
index 2314416..1f6cd19 100644
--- a/src/web/org/openmrs/web/controller/RegimenPortletController.java
+++ b/src/web/org/openmrs/web/controller/RegimenPortletController.java
@@ -68,7 +68,7 @@
 						setIdToUse = "*";
 					if (setIdToUse != null) {
 						helper(patientDrugOrderSets, setIdToUse, order);
-						if (order.isCurrent())
+						if (order.isCurrent() || order.isFuture())
 							helper(currentDrugOrderSets, setIdToUse, order);
 						else
 							helper(completedDrugOrderSets, setIdToUse, order);
