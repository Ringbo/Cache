diff --git a/src/api/org/openmrs/api/impl/PersonServiceImpl.java b/src/api/org/openmrs/api/impl/PersonServiceImpl.java
index 1ffc8f8..893bfb2 100644
--- a/src/api/org/openmrs/api/impl/PersonServiceImpl.java
+++ b/src/api/org/openmrs/api/impl/PersonServiceImpl.java
@@ -793,7 +793,7 @@
 			}
 			else {
 				firstName = names[1];
-				lastName = names[2];
+				lastName = names[0];
 			}
 		}
 		else if (name.contains(" ")) {
