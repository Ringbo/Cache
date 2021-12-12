diff --git a/src/org/parosproxy/paros/control/MenuFileControl.java b/src/org/parosproxy/paros/control/MenuFileControl.java
index 6d65084..5db0c26 100644
--- a/src/org/parosproxy/paros/control/MenuFileControl.java
+++ b/src/org/parosproxy/paros/control/MenuFileControl.java
@@ -570,7 +570,7 @@
 				}
 				View.getSingleton().showWarningDialog(Constant.messages.getString("context.import.error", detailError));
 			} catch (Exception e1) {
-				log.debug(e1.getMessage(), e1);
+				log.error(e1.getMessage(), e1);
 				View.getSingleton().showWarningDialog(Constant.messages.getString("context.import.error", e1.getMessage()));
 			}
 	    }
