diff --git a/src/acr/browser/lightning/BookmarkManager.java b/src/acr/browser/lightning/BookmarkManager.java
index 417df9b..4442432 100644
--- a/src/acr/browser/lightning/BookmarkManager.java
+++ b/src/acr/browser/lightning/BookmarkManager.java
@@ -320,7 +320,7 @@
 	 * This method imports all bookmarks that are included in the device's
 	 * permanent bookmark storage
 	 */
-	public synchronized void importBookmarksFromBrowser() {
+	public synchronized void importBookmarksFromBrowser(Context context) {
 		if (PreferenceManager.getInstance().getSystemBrowserPresent()) {
 
 			List<HistoryItem> bookmarkList = new ArrayList<HistoryItem>();
@@ -350,7 +350,7 @@
 			Utils.showToast(mContext,
 					number + " " + mContext.getResources().getString(R.string.message_import));
 		} else {
-			Utils.createInformativeDialog(mContext,
+			Utils.createInformativeDialog(context,
 					mContext.getResources().getString(R.string.title_error), mContext
 							.getResources().getString(R.string.dialog_import_error));
 		}
@@ -363,7 +363,7 @@
 	 * @param dir
 	 * @param file
 	 */
-	public synchronized void importBookmarksFromFile(File file) {
+	public synchronized void importBookmarksFromFile(File file, Context context) {
 		if (file == null) {
 			return;
 		}
@@ -388,17 +388,17 @@
 					number + " " + mContext.getResources().getString(R.string.message_import));
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
-			Utils.createInformativeDialog(mContext,
+			Utils.createInformativeDialog(context,
 					mContext.getResources().getString(R.string.title_error), mContext
 							.getResources().getString(R.string.import_bookmark_error));
 		} catch (IOException e) {
 			e.printStackTrace();
-			Utils.createInformativeDialog(mContext,
+			Utils.createInformativeDialog(context,
 					mContext.getResources().getString(R.string.title_error), mContext
 							.getResources().getString(R.string.import_bookmark_error));
 		} catch (JSONException e) {
 			e.printStackTrace();
-			Utils.createInformativeDialog(mContext,
+			Utils.createInformativeDialog(context,
 					mContext.getResources().getString(R.string.title_error), mContext
 							.getResources().getString(R.string.import_bookmark_error));
 		}
