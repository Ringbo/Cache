diff --git a/src/biz/bokhorst/xprivacy/PackageChange.java b/src/biz/bokhorst/xprivacy/PackageChange.java
index db6ffcc..6feea9c 100644
--- a/src/biz/bokhorst/xprivacy/PackageChange.java
+++ b/src/biz/bokhorst/xprivacy/PackageChange.java
@@ -56,9 +56,10 @@
 
 							// Restrict if no previous restrictions
 							if (!someRestricted)
-								for (String restrictionName : PrivacyManager.getRestrictions(false))
+								for (String restrictionName : PrivacyManager.getRestrictions(true))
 									if (PrivacyManager.getSettingBool(null, context, 0,
-											String.format("Template.%s", restrictionName), true, false))
+											String.format("Template.%s", restrictionName),
+											!PrivacyManager.isDangerousRestriction(restrictionName), false))
 										PrivacyManager.setRestricted(null, context, uid, restrictionName, null, true);
 						}
 
