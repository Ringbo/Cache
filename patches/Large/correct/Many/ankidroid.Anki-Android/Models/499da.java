diff --git a/src/com/ichi2/libanki/Models.java b/src/com/ichi2/libanki/Models.java
index 8f1ea32..7d0e5e6 100644
--- a/src/com/ichi2/libanki/Models.java
+++ b/src/com/ichi2/libanki/Models.java
@@ -367,9 +367,9 @@
     }
 
     private void _setID(JSONObject m) {
-    	long id = Utils.intNow();
+    	long id = Utils.intNow(1000);
     	while (mModels.containsKey(id)) {
-    		id = Utils.intNow();
+    		id = Utils.intNow(1000);
     	}
     	try {
 			m.put("id", id);
