diff --git a/api/src/main/java/org/openmrs/util/databasechange/AddConceptMapTypesChangeset.java b/api/src/main/java/org/openmrs/util/databasechange/AddConceptMapTypesChangeset.java
index 324f21c..d9d5f48 100644
--- a/api/src/main/java/org/openmrs/util/databasechange/AddConceptMapTypesChangeset.java
+++ b/api/src/main/java/org/openmrs/util/databasechange/AddConceptMapTypesChangeset.java
@@ -166,7 +166,7 @@
 				}
 				
 				//marks the changeset as a failed one
-				throw new CustomChangeException("Failed to insert one or more concept map types");
+				throw new CustomChangeException("Failed to insert one or more concept map types", be);
 			}
 		}
 		catch (DatabaseException e) {
