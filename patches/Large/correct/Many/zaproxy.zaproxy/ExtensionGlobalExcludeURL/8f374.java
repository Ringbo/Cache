diff --git a/src/org/zaproxy/zap/extension/globalexcludeurl/ExtensionGlobalExcludeURL.java b/src/org/zaproxy/zap/extension/globalexcludeurl/ExtensionGlobalExcludeURL.java
index 226c60a..fd38f34 100644
--- a/src/org/zaproxy/zap/extension/globalexcludeurl/ExtensionGlobalExcludeURL.java
+++ b/src/org/zaproxy/zap/extension/globalexcludeurl/ExtensionGlobalExcludeURL.java
@@ -78,7 +78,7 @@
 
 	private void initialize() {
         this.setName(NAME);
-        this.setOrder(50);
+        this.setOrder(969);		// TODO find optimal load order at some point
 	}
 
 	@Override
