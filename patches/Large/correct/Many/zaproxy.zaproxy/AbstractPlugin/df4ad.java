diff --git a/src/org/parosproxy/paros/core/scanner/AbstractPlugin.java b/src/org/parosproxy/paros/core/scanner/AbstractPlugin.java
index 9e85745..2fa99d0 100644
--- a/src/org/parosproxy/paros/core/scanner/AbstractPlugin.java
+++ b/src/org/parosproxy/paros/core/scanner/AbstractPlugin.java
@@ -30,6 +30,7 @@
 // ZAP: 2013/01/19 Issue 460 Add support for a scan progress dialog
 // ZAP: 2013/01/25 Removed the "(non-Javadoc)" comments.
 // ZAP: 2013/02/19 Issue 528 Scan progress dialog can show negative progress times
+// ZAP: 2013/04/14 Issue 611: Log the exceptions thrown by active scanners as error
 
 package org.parosproxy.paros.core.scanner;
 
@@ -241,7 +242,7 @@
                 scan();
             }
         } catch (Exception e) {
-            getLog().warn(e.getMessage());
+            getLog().error(e.getMessage(), e);
         }
         notifyPluginCompleted(getParent());
     	this.finished = new Date();
