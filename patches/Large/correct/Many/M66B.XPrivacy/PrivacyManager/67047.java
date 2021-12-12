diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index 22b732e..5759b41 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -515,7 +515,7 @@
 			return false;
 		} else {
 			// Check restart
-			return getMethod(restrictionName, methodName).isDangerous();
+			return getMethod(restrictionName, methodName).isRestartRequired();
 		}
 	}
 
