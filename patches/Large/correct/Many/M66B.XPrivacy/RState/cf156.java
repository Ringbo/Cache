diff --git a/src/biz/bokhorst/xprivacy/RState.java b/src/biz/bokhorst/xprivacy/RState.java
index 681f733..3293c22 100644
--- a/src/biz/bokhorst/xprivacy/RState.java
+++ b/src/biz/bokhorst/xprivacy/RState.java
@@ -41,7 +41,7 @@
 					allAsk = (allAsk && !query.asked);
 					someAsk = (someAsk || !query.asked);
 				}
-				asked = !someAsk;
+				asked = !onDemand;
 			} else {
 				// Examine the category/method states
 				PRestriction query = PrivacyManager.getRestrictionEx(uid, restrictionName, null);
