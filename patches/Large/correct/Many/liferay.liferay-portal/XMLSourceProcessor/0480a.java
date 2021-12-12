diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java
index a150df6..3a8250d 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java
@@ -663,7 +663,8 @@
 
 						processErrorMessage(
 							fileName,
-							"sort: " + fileName + " " + referencePackagePath);
+							"sort: " + fileName + " " + entityName + " " +
+								referenceEntity);
 					}
 				}
 
