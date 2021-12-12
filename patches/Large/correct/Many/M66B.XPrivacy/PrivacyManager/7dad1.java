diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index bbac5d3..be23e80 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -468,7 +468,7 @@
 									+ (parentAsked ? "+asked" : "+ask"), false);
 					boolean restricted = value.contains("true");
 					boolean asked = (!ondemand || value.contains("asked"));
-					if ((parentRestricted && !restricted) || (!parentAsked && asked))
+					if ((parentRestricted && !restricted) || (!parentAsked && asked) || hook.whitelist() != null)
 						listPRestriction.add(new PRestriction(uid, rRestrictionName, hook.getName(), parentRestricted
 								&& restricted, parentAsked || asked));
 				}
