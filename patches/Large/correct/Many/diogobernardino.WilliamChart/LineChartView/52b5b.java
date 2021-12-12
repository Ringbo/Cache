diff --git a/library/src/com/db/chart/view/LineChartView.java b/library/src/com/db/chart/view/LineChartView.java
index 8445256..7f77689 100644
--- a/library/src/com/db/chart/view/LineChartView.java
+++ b/library/src/com/db/chart/view/LineChartView.java
@@ -342,7 +342,7 @@
 	@Override
 	public ArrayList<ArrayList<Region>> defineRegions(ArrayList<ChartSet> data){
 
-		ArrayList<ArrayList<Region>> result = new ArrayList<>();
+		ArrayList<ArrayList<Region>> result = new ArrayList<>(data.size());
 		
 		ArrayList<Region> regionSet;
 		float x;
