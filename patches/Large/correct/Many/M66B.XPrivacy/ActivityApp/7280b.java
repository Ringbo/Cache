diff --git a/src/biz/bokhorst/xprivacy/ActivityApp.java b/src/biz/bokhorst/xprivacy/ActivityApp.java
index e701dbc..e7693e3 100644
--- a/src/biz/bokhorst/xprivacy/ActivityApp.java
+++ b/src/biz/bokhorst/xprivacy/ActivityApp.java
@@ -522,7 +522,7 @@
 						jMethod.put("restriction", restrictionName);
 						jMethod.put("method", md.getMethodName());
 						jMethod.put("restricted", mRestricted);
-						jRestriction.put("used", mUsed);
+						jMethod.put("used", mUsed);
 						jSettings.put(jMethod);
 					}
 				}
