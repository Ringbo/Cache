diff --git a/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java b/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
index 8f67427..03c3c00 100644
--- a/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
+++ b/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
@@ -2025,7 +2025,7 @@
 				PropsKeys.PASSWORDS_TOOLKIT);
 
 			Toolkit toolkit = (Toolkit)newInstance(
-				portletClassLoader, Sanitizer.class, toolkitClassName);
+				portletClassLoader, Toolkit.class, toolkitClassName);
 
 			ToolkitWrapper toolkitWrapper =
 				(ToolkitWrapper)PwdToolkitUtil.getToolkit();
