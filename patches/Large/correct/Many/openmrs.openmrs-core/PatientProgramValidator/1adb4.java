diff --git a/api/src/main/java/org/openmrs/validator/PatientProgramValidator.java b/api/src/main/java/org/openmrs/validator/PatientProgramValidator.java
index fa91205..9bb6eb4 100644
--- a/api/src/main/java/org/openmrs/validator/PatientProgramValidator.java
+++ b/api/src/main/java/org/openmrs/validator/PatientProgramValidator.java
@@ -140,7 +140,7 @@
 					if (OpenmrsUtil.compareWithNullAsLatest(patientState.getEndDate(), patientState.getStartDate()) < 0) {
 						errors.rejectValue("states", "PatientState.error.endDateCannotBeBeforeStartDate");
 						return;
-					} else if (statesAndStartDates.contains(patientState.getState().getId() + ""
+					} else if (statesAndStartDates.contains(patientState.getState().getUuid() + ""
 					        + patientState.getStartDate())) {
 						// we already have a patient state with the same work flow state and start date
 						errors.rejectValue("states", "PatientState.error.duplicatePatientStates");
@@ -185,7 +185,7 @@
 						}
 					}
 					
-					statesAndStartDates.add(patientState.getState().getId() + "" + patientState.getStartDate());
+					statesAndStartDates.add(patientState.getState().getUuid() + "" + patientState.getStartDate());
 				}
 			}
 		}
