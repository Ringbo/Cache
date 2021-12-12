diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index 85546f6..ad358bf 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -566,7 +566,7 @@
 								&& restricted, parentAsked || asked);
 					else
 						childMerge = getRestrictionEx(uid, rRestrictionName, hook.getName());
-					if ((parentRestricted && !restricted) || (!parentAsked && asked) || !clear) {
+					if ((parentRestricted && !restricted) || (!parentAsked && asked) || hook.isDangerous() || !clear) {
 						PRestriction child = new PRestriction(uid, rRestrictionName, hook.getName(),
 								(parentRestricted && restricted) || childMerge.restricted, (parentAsked || asked)
 										&& childMerge.asked);
