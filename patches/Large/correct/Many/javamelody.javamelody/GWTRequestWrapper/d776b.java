diff --git a/javamelody-core/src/main/java/net/bull/javamelody/GWTRequestWrapper.java b/javamelody-core/src/main/java/net/bull/javamelody/GWTRequestWrapper.java
index 8a9a8b2..2d7abf3 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/GWTRequestWrapper.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/GWTRequestWrapper.java
@@ -69,7 +69,7 @@
 		//				gwtmethodname = decodeRequest.getMethod().getName();
 
 		final String[] split = payload.split("\\|"); //pipe delimited
-		if (split[6].length() > 0) {
+		if (split.length > 6 && split[6].length() > 0) {
 			gwtRpcMethodName = split[6];
 		}
 	}
