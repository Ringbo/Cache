diff --git a/src/org/odk/collect/android/activities/FormEntryActivity.java b/src/org/odk/collect/android/activities/FormEntryActivity.java
index 6dfcefa..ddf580f 100644
--- a/src/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/src/org/odk/collect/android/activities/FormEntryActivity.java
@@ -1552,7 +1552,7 @@
 	}
 
 	private boolean indexContainsRepeatableGroup(FormIndex index) {
-		FormEntryCaption[] groups = mFormEntryModel.getCaptionHierarchy();
+		FormEntryCaption[] groups = mFormEntryModel.getCaptionHierarchy(index);
 		if (groups.length == 0) {
 			return false;
 		}
