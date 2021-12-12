diff --git a/src/org/geometerplus/zlibrary/core/network/ZLNetworkManager.java b/src/org/geometerplus/zlibrary/core/network/ZLNetworkManager.java
index 48dda1f..e8c4a3f 100644
--- a/src/org/geometerplus/zlibrary/core/network/ZLNetworkManager.java
+++ b/src/org/geometerplus/zlibrary/core/network/ZLNetworkManager.java
@@ -75,7 +75,7 @@
 				return null;
 			}
 
-			if (myCredentialsMap.containsKey(scope) || quietMode) {
+			if (myCredentialsMap.containsKey(scope) || quietly) {
 				return myCredentialsMap.get(scope);
 			}
 
