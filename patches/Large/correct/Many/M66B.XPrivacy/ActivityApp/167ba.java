diff --git a/src/biz/bokhorst/xprivacy/ActivityApp.java b/src/biz/bokhorst/xprivacy/ActivityApp.java
index aba1230..32acaa8 100644
--- a/src/biz/bokhorst/xprivacy/ActivityApp.java
+++ b/src/biz/bokhorst/xprivacy/ActivityApp.java
@@ -1103,7 +1103,7 @@
 					// Toggle white/black list entry
 					holder.ctvName.toggle();
 					boolean isChecked = holder.ctvName.isChecked();
-					PrivacyManager.setSetting(mAppInfo.getUid(), mSelectedType, name, Boolean.toString(!isChecked));
+					PrivacyManager.setSetting(mAppInfo.getUid(), mSelectedType, name, Boolean.toString(isChecked));
 				}
 			});
 
