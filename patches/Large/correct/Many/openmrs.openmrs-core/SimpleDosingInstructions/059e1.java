diff --git a/api/src/main/java/org/openmrs/SimpleDosingInstructions.java b/api/src/main/java/org/openmrs/SimpleDosingInstructions.java
index 5210593..fe52b00 100644
--- a/api/src/main/java/org/openmrs/SimpleDosingInstructions.java
+++ b/api/src/main/java/org/openmrs/SimpleDosingInstructions.java
@@ -112,7 +112,7 @@
 		simpleDosingInstructions.setDurationUnits(order.getDurationUnits());
 		simpleDosingInstructions.setAsNeeded(order.getAsNeeded());
 		simpleDosingInstructions.setAsNeededCondition(order.getAsNeededCondition());
-		simpleDosingInstructions.setAdministrationInstructions(order.getInstructions());
+		simpleDosingInstructions.setAdministrationInstructions(order.getDosingInstructions());
 		return simpleDosingInstructions;
 	}
 	
