diff --git a/core/src/main/java/com/capitalone/dashboard/util/SuperFeatureComparator.java b/core/src/main/java/com/capitalone/dashboard/util/SuperFeatureComparator.java
index 4571809..da22852 100644
--- a/core/src/main/java/com/capitalone/dashboard/util/SuperFeatureComparator.java
+++ b/core/src/main/java/com/capitalone/dashboard/util/SuperFeatureComparator.java
@@ -26,9 +26,9 @@
 	 */
 	@Override
 	public int compare(Feature f, Feature ff) {
-		if (f.getsEpicID().compareToIgnoreCase(ff.getsEpicID()) == -1) {
+		if (f.getsEpicID().compareToIgnoreCase(ff.getsEpicID()) <= -1) {
 			return -1;
-		} else if (f.getsEpicID().compareToIgnoreCase(ff.getsEpicID()) == 1) {
+		} else if (f.getsEpicID().compareToIgnoreCase(ff.getsEpicID()) >= 1) {
 			return 1;
 		} else {
 			return 0;
