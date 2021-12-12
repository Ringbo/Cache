diff --git a/Menus/Menus/src/com/commonsware/android/menus/MenuDemo.java b/Menus/Menus/src/com/commonsware/android/menus/MenuDemo.java
index 8cf24fb..1ec0a7d 100755
--- a/Menus/Menus/src/com/commonsware/android/menus/MenuDemo.java
+++ b/Menus/Menus/src/com/commonsware/android/menus/MenuDemo.java
@@ -106,7 +106,7 @@
 				return(true);
 		}
 		
-		return(super.onOptionsItemSelected(item));
+		return(super.onContextItemSelected(item));
 	}
 	
 	private void initAdapter() {
