diff --git a/portal-impl/test/integration/com/liferay/portal/struts/StrutsActionRegistryUtilTest.java b/portal-impl/test/integration/com/liferay/portal/struts/StrutsActionRegistryUtilTest.java
index b31af4f..acd85fd 100644
--- a/portal-impl/test/integration/com/liferay/portal/struts/StrutsActionRegistryUtilTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/struts/StrutsActionRegistryUtilTest.java
@@ -61,7 +61,7 @@
 
 		_atomicState.reset();
 
-		actionAdapter.execute(null, null, null, null);
+		actionAdapter.execute(null, null, null);
 
 		Assert.assertTrue(_atomicState.isSet());
 
@@ -87,7 +87,7 @@
 
 		_atomicState.reset();
 
-		actionAdapter.execute(null, null, null, null);
+		actionAdapter.execute(null, null, null);
 
 		Assert.assertTrue(_atomicState.isSet());
 
