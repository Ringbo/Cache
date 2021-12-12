diff --git a/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java b/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java
index 0aab1ee..37d9ce4 100644
--- a/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java
+++ b/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java
@@ -188,7 +188,7 @@
 			searchBase=getInputRowMeta().getString(data.readRow, data.indexOfSearchBaseField);
 		}
 		String filter=data.staticFilter;
-		if(data.indexOfFilterField>0) {
+		if(data.indexOfFilterField>=0) {
 			// retrieve dynamic filter string
 			filter=getInputRowMeta().getString(data.readRow, data.indexOfFilterField);
 		}
