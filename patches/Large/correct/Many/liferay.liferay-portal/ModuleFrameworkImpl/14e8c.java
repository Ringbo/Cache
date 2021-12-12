diff --git a/modules/core/portal-bootstrap/src/com/liferay/portal/bootstrap/ModuleFrameworkImpl.java b/modules/core/portal-bootstrap/src/com/liferay/portal/bootstrap/ModuleFrameworkImpl.java
index d6fd35c..a6d54f9 100644
--- a/modules/core/portal-bootstrap/src/com/liferay/portal/bootstrap/ModuleFrameworkImpl.java
+++ b/modules/core/portal-bootstrap/src/com/liferay/portal/bootstrap/ModuleFrameworkImpl.java
@@ -757,10 +757,10 @@
 	private boolean _isFragmentBundle(Bundle bundle) {
 		if((bundle.adapt(BundleRevision.class).getTypes() &
 				BundleRevision.TYPE_FRAGMENT) == 0 ) {
-			return true;
+			return false;
 		}
 		else {
-			return false;
+			return true;
 		}
 	}
 
