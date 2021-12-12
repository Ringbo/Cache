diff --git a/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java b/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java
index 600da7c..3a5ce10 100644
--- a/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java
+++ b/src/org/pentaho/di/trans/steps/ldapinput/LDAPInput.java
@@ -142,7 +142,7 @@
 	        	}
         	}
         	if(meta.isDynamicFilter()) {
-        		if(Const.isEmpty(meta.getDynamicSearchFieldName())) {
+        		if(Const.isEmpty(meta.getDynamicFilterFieldName())) {
             		throw new KettleException(BaseMessages.getString(PKG, "LDAPInput.Error.DynamicFilterFieldMissing"));
             	}
         	}
