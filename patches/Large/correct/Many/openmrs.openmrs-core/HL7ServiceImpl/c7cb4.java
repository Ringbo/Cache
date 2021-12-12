diff --git a/api/src/main/java/org/openmrs/hl7/impl/HL7ServiceImpl.java b/api/src/main/java/org/openmrs/hl7/impl/HL7ServiceImpl.java
index b549f79..53b73c4 100644
--- a/api/src/main/java/org/openmrs/hl7/impl/HL7ServiceImpl.java
+++ b/api/src/main/java/org/openmrs/hl7/impl/HL7ServiceImpl.java
@@ -864,7 +864,7 @@
 		}
 		Context.getHL7Service().saveHL7InError(hl7InError);
 		Context.getHL7Service().purgeHL7InQueue(hl7InQueue);
-		log.error(error, cause);
+		log.info(error, cause);
 	}
 	
 	/**
