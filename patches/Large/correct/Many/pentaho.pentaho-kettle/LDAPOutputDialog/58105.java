diff --git a/src-ui/org/pentaho/di/ui/trans/steps/ldapoutput/LDAPOutputDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/ldapoutput/LDAPOutputDialog.java
index 4d886eb..473e400 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/ldapoutput/LDAPOutputDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/ldapoutput/LDAPOutputDialog.java
@@ -1284,7 +1284,7 @@
 			}else {
 				connection.connect();
 			}
-			return connection.getFields(transMeta.environmentSubstitute(wBaseDN.getText()), null);
+			return connection.getFields(transMeta.environmentSubstitute(wBaseDN.getText()));
 		}finally {
 			  if(connection!=null) {
 				  try {
