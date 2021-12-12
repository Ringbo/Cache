diff --git a/src/it/feio/android/omninotes/DetailFragment.java b/src/it/feio/android/omninotes/DetailFragment.java
index bf18c53..ef3891a 100644
--- a/src/it/feio/android/omninotes/DetailFragment.java
+++ b/src/it/feio/android/omninotes/DetailFragment.java
@@ -1721,7 +1721,7 @@
 
 	private String getNoteTitle() {
 		String res = "";
-		if (getActivity().findViewById(R.id.detail_title) != null) {
+		if (getActivity() != null && getActivity().findViewById(R.id.detail_title) != null) {
 			Editable editableTitle = ((EditText) getActivity().findViewById(R.id.detail_title)).getText();
 			res = TextUtils.isEmpty(editableTitle) ? "" : editableTitle.toString();
 		} else {
