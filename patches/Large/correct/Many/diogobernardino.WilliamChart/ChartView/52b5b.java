diff --git a/library/src/com/db/chart/view/ChartView.java b/library/src/com/db/chart/view/ChartView.java
index 5e7087c..0836871 100644
--- a/library/src/com/db/chart/view/ChartView.java
+++ b/library/src/com/db/chart/view/ChartView.java
@@ -942,7 +942,7 @@
      */
     public ArrayList<Rect> getEntriesArea(int index){
 
-		ArrayList<Rect> result = new ArrayList<>();
+		ArrayList<Rect> result = new ArrayList<>(mRegions.get(index).size());
 		for(Region r: mRegions.get(index))
 			result.add(getEntryRect(r));
 
