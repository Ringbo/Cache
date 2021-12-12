diff --git a/src/com/androidquery/callback/AbstractAjaxCallback.java b/src/com/androidquery/callback/AbstractAjaxCallback.java
index 2ef4f85..041aacc 100644
--- a/src/com/androidquery/callback/AbstractAjaxCallback.java
+++ b/src/com/androidquery/callback/AbstractAjaxCallback.java
@@ -594,7 +594,7 @@
 		
 		Activity a = act.get();
 		
-		if(a.isFinishing()){					
+		if(a == null || a.isFinishing()){					
 			return false;
 		}
 		
