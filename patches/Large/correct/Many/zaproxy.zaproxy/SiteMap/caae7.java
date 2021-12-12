diff --git a/src/org/parosproxy/paros/model/SiteMap.java b/src/org/parosproxy/paros/model/SiteMap.java
index e084e48..bf70114 100644
--- a/src/org/parosproxy/paros/model/SiteMap.java
+++ b/src/org/parosproxy/paros/model/SiteMap.java
@@ -260,9 +260,11 @@
      * @return 
      */
     public SiteNode addPath(HistoryReference ref, HttpMessage msg) {
-    	if (! SwingUtilities.isEventDispatchThread() &&
-    			! Thread.currentThread().getName().startsWith("ZAP")) {
-    		// Log an error but carry on anyway
+    	if (Constant.isDevBuild() && ! SwingUtilities.isEventDispatchThread() &&
+    			! Thread.currentThread().getName().startsWith("ZAP") &&
+    			! Thread.currentThread().getName().startsWith("DirBuster")) {
+    		// In developer mode log an error if we're no on the EDT or other known thread but carry on anyway
+    		// Adding to the site tree on GUI ('initial') threads causes problems
     		log.error("SiteMap.addPath not on EDT " + Thread.currentThread().getName(), new Exception());
     	}
         
