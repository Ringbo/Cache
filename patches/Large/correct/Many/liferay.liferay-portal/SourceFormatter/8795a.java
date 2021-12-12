diff --git a/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java b/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
index 7883ea5..2ab43ca 100644
--- a/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
+++ b/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
@@ -1204,7 +1204,7 @@
 					// Set convertImportsToSingleLine to false to revert imports
 					// from a single line to multiple lines
 
-					boolean convertImportsToSingleLine = true;
+					boolean convertImportsToSingleLine = false;
 
 					if (convertImportsToSingleLine) {
 						newContent =
