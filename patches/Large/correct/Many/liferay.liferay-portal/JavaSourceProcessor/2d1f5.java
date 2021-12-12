diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
index b4db896..20ebbdb 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/JavaSourceProcessor.java
@@ -1094,7 +1094,8 @@
 			processErrorMessage(fileName, "ServiceUtil: " + fileName);
 		}
 
-		if (!className.equals("DeepNamedValueScanner") &&
+		if (!isRunsOutsidePortal(absolutePath) &&
+			!className.equals("DeepNamedValueScanner") &&
 			!className.equals("ProxyUtil") &&
 			newContent.contains("import java.lang.reflect.Proxy;")) {
 
