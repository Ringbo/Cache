diff --git a/src/org/parosproxy/paros/core/scanner/Scanner.java b/src/org/parosproxy/paros/core/scanner/Scanner.java
index 09ff33c..5089e4a 100644
--- a/src/org/parosproxy/paros/core/scanner/Scanner.java
+++ b/src/org/parosproxy/paros/core/scanner/Scanner.java
@@ -42,6 +42,7 @@
 // ZAP: 2016/07/01 Issue 2647 Support a/pscan rule configuration 
 // ZAP: 2016/11/14 Restore and deprecate old constructor, to keep binary compatibility
 // ZAP: 2017/06/29 Remove code duplication in scan()
+// ZAP: 2018/02/09 Check also its excluded URLs when scanning a context (Issue 4368).
 
 package org.parosproxy.paros.core.scanner;
 
@@ -426,7 +427,7 @@
 			return false;
 		}
 		if (this.target.getContext() != null) {
-			if ( ! target.getContext().isIncluded(nodeName)) {
+			if ( ! target.getContext().isInContext(nodeName)) {
 				// Restricted to nodes in the given context, and this isnt
 				return false;
 			}
