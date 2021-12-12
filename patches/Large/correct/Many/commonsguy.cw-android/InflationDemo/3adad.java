diff --git a/Menus/Inflation/src/com/commonsware/android/inflation/InflationDemo.java b/Menus/Inflation/src/com/commonsware/android/inflation/InflationDemo.java
index d895592..1dfe7f0 100755
--- a/Menus/Inflation/src/com/commonsware/android/inflation/InflationDemo.java
+++ b/Menus/Inflation/src/com/commonsware/android/inflation/InflationDemo.java
@@ -97,7 +97,7 @@
 				return(true);
 		}
 		
-		return(super.onOptionsItemSelected(item));
+		return(super.onContextItemSelected(item));
 	}
 	
 	private void initAdapter() {
