diff --git a/src/biz/bokhorst/xprivacy/XActivityManager.java b/src/biz/bokhorst/xprivacy/XActivityManager.java
index f828183..a48ef74 100644
--- a/src/biz/bokhorst/xprivacy/XActivityManager.java
+++ b/src/biz/bokhorst/xprivacy/XActivityManager.java
@@ -106,7 +106,7 @@
 				if (listIntent.size() == 0)
 					param.setResult(0); // ActivityManager.START_SUCCESS
 				else
-					param.args[2] = listIntent.toArray();
+					param.args[2] = listIntent.toArray(new Intent[0]);
 			}
 			break;
 
