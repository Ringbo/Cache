diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 9dc57cb..54aae81 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -1532,7 +1532,7 @@
 								List<PRestriction> listPRestriction = new ArrayList<PRestriction>();
 								for (String restrictionName : listRestriction)
 									listPRestriction.add(new PRestriction(xAppInfo.getUid(), restrictionName, null,
-											crestricted));
+											crestricted, crestricted));
 								PrivacyManager.setRestrictionList(listPRestriction);
 								List<Boolean> newState = PrivacyManager.getRestartStates(xAppInfo.getUid(),
 										mRestrictionName);
