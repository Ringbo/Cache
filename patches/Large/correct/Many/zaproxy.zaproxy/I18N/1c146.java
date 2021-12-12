diff --git a/src/org/zaproxy/zap/utils/I18N.java b/src/org/zaproxy/zap/utils/I18N.java
index e8842ad..9b5ec65 100644
--- a/src/org/zaproxy/zap/utils/I18N.java
+++ b/src/org/zaproxy/zap/utils/I18N.java
@@ -63,9 +63,9 @@
 
 	public boolean containsKey(String key) {
     	if (key.indexOf(".") > 0) {
-    		String prefix = key.substring(0, key.indexOf(".") -1);
+    		String prefix = key.substring(0, key.indexOf("."));
     		ResourceBundle bundle = this.addonMessages.get(prefix);
-    		if (bundle != null & bundle.containsKey(key)) {
+    		if (bundle != null && bundle.containsKey(key)) {
     			return true;
     		}
     	}
