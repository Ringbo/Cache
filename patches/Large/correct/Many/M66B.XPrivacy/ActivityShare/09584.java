diff --git a/src/biz/bokhorst/xprivacy/ActivityShare.java b/src/biz/bokhorst/xprivacy/ActivityShare.java
index 4ac6b3e..852cc94 100644
--- a/src/biz/bokhorst/xprivacy/ActivityShare.java
+++ b/src/biz/bokhorst/xprivacy/ActivityShare.java
@@ -823,7 +823,7 @@
 						// Get uid
 						uid = getPackageManager().getPackageInfo(packageName, 0).applicationInfo.uid;
 
-						if (listUidSelected.size() == 0 || listUidSelected.contains(uid)) {
+						if (listUidSelected.contains(uid)) {
 							Util.log(null, Log.INFO, "Importing " + packageName);
 							setState(uid, STATE_RUNNING, null);
 
@@ -845,7 +845,7 @@
 									: null);
 						}
 					} catch (Throwable ex) {
-						if (uid > 0)
+						if (listUidSelected.contains(uid))
 							setState(uid, STATE_FAILURE, ex.getMessage());
 						Util.bug(null, ex);
 					}
@@ -945,7 +945,7 @@
 						// Application setting
 						int iid = Integer.parseInt(id);
 						int uid = getUid(iid);
-						if (uid >= 0 && mListUidSelected.contains(uid)) {
+						if (mListUidSelected.contains(uid)) {
 							// Check for abort
 							if (mAbort && !mListUidSettings.contains(uid)) {
 								setState(uid, STATE_FAILURE);
@@ -999,7 +999,7 @@
 
 					// Get uid
 					int uid = getUid(id);
-					if (uid >= 0 || mListUidSelected.contains(uid)) {
+					if (mListUidSelected.contains(uid)) {
 						// Check for abort
 						if (mAbort && !mListUidRestrictions.contains(uid)) {
 							setState(uid, STATE_FAILURE);
@@ -1010,7 +1010,7 @@
 						// Check for new uid
 						if (!mListUidRestrictions.contains(uid)) {
 							// Mark previous as success
-							if (lastUid >= 0) {
+							if (lastUid > 0) {
 								boolean restart = !PrivacyManager.getRestartStates(lastUid, null).equals(mOldState);
 								setState(lastUid, STATE_SUCCESS, restart ? getString(R.string.msg_restart) : null);
 							}
@@ -1042,7 +1042,7 @@
 		@Override
 		public void endElement(String uri, String localName, String qName) {
 			if (qName.equals("XPrivacy"))
-				if (lastUid >= 0) {
+				if (lastUid > 0) {
 					boolean restart = !PrivacyManager.getRestartStates(lastUid, null).equals(mOldState);
 					setState(lastUid, STATE_SUCCESS, restart ? getString(R.string.msg_restart) : null);
 				}
