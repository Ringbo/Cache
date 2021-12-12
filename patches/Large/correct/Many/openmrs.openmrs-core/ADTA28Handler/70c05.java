diff --git a/api/src/main/java/org/openmrs/hl7/handler/ADTA28Handler.java b/api/src/main/java/org/openmrs/hl7/handler/ADTA28Handler.java
index a8ae49d..0dde3c0 100644
--- a/api/src/main/java/org/openmrs/hl7/handler/ADTA28Handler.java
+++ b/api/src/main/java/org/openmrs/hl7/handler/ADTA28Handler.java
@@ -254,7 +254,7 @@
 			}
 
 			else {
-				log.debug("PID contains identifier with no assigning authority");
+				log.error("PID contains identifier with no assigning authority");
 				continue;
 			}
 		}
