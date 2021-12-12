diff --git a/src/biz/bokhorst/xprivacy/PrivacyManager.java b/src/biz/bokhorst/xprivacy/PrivacyManager.java
index 4d41470..bafbcf3 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyManager.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyManager.java
@@ -392,10 +392,10 @@
 		List<Boolean> listRestricted = new ArrayList<Boolean>();
 		if (restrictionName == null)
 			for (String sRestrictionName : PrivacyManager.getRestrictions())
-				listRestricted.add(getRestricted(null, uid, sRestrictionName, null, false, true));
+				listRestricted.add(getRestricted(null, uid, sRestrictionName, null, false, false));
 		else {
 			for (MethodDescription md : getMethods(restrictionName))
-				listRestricted.add(getRestricted(null, uid, restrictionName, md.getName(), false, true));
+				listRestricted.add(getRestricted(null, uid, restrictionName, md.getName(), false, false));
 		}
 		return listRestricted;
 	}
