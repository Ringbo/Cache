diff --git a/src/biz/bokhorst/xprivacy/ActivityApp.java b/src/biz/bokhorst/xprivacy/ActivityApp.java
index 5357aaa..85b6a8b 100644
--- a/src/biz/bokhorst/xprivacy/ActivityApp.java
+++ b/src/biz/bokhorst/xprivacy/ActivityApp.java
@@ -466,7 +466,7 @@
 				for (String restrictionName : listRestriction) {
 					String templateName = PrivacyManager.cSettingTemplate + "." + restrictionName;
 					if (PrivacyManager.getSettingBool(null, 0, templateName, !ondemand, false))
-						listPRestriction.add(new PRestriction(mAppInfo.getUid(), restrictionName, null, restricted, restricted));
+						listPRestriction.add(new PRestriction(mAppInfo.getUid(), restrictionName, null, restricted));
 				}
 				PrivacyManager.setRestrictionList(listPRestriction);
 				List<Boolean> newState = PrivacyManager.getRestartStates(mAppInfo.getUid(), null);
@@ -974,7 +974,7 @@
 							List<Boolean> oldState = PrivacyManager.getRestartStates(mAppInfo.getUid(), restrictionName);
 							if (!crestricted)
 								PrivacyManager.deleteRestrictions(mAppInfo.getUid(), restrictionName);
-							PrivacyManager.setRestriction(mAppInfo.getUid(), restrictionName, null, crestricted, crestricted);
+							PrivacyManager.setRestriction(mAppInfo.getUid(), restrictionName, null, crestricted, false);
 							List<Boolean> newState = PrivacyManager.getRestartStates(mAppInfo.getUid(), restrictionName);
 
 							// Update all/some restricted
@@ -1192,7 +1192,7 @@
 							restricted = !restricted;
 							holder.ctvMethodName.setChecked(restricted);
 							PrivacyManager.setRestriction(mAppInfo.getUid(), restrictionName, md.getName(), restricted,
-									restricted);
+									false);
 
 							// Refresh display
 							notifyDataSetChanged(); // Needed to update parent
