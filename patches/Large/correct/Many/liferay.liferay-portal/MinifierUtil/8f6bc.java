diff --git a/portal-impl/src/com/liferay/portal/util/MinifierUtil.java b/portal-impl/src/com/liferay/portal/util/MinifierUtil.java
index 93d8398..a9beaef4 100644
--- a/portal-impl/src/com/liferay/portal/util/MinifierUtil.java
+++ b/portal-impl/src/com/liferay/portal/util/MinifierUtil.java
@@ -58,7 +58,7 @@
 						". Returning YUIJavaScriptMinifier as default");
 			}
 
-			return new YUIJavaScriptMinifier();
+			return new GoogleClosureCompileJavaScriptMinifier();
 		}
 	}
 
