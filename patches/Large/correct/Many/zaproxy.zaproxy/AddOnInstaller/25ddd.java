diff --git a/src/org/zaproxy/zap/control/AddOnInstaller.java b/src/org/zaproxy/zap/control/AddOnInstaller.java
index 2c1bcc6..0a2db80 100644
--- a/src/org/zaproxy/zap/control/AddOnInstaller.java
+++ b/src/org/zaproxy/zap/control/AddOnInstaller.java
@@ -291,7 +291,7 @@
             }
         }
 
-        Control.getSingleton().getExtensionLoader().addonFilesAdded();
+        Control.getSingleton().getExtensionLoader().addonFilesRemoved();
 
         return uninstalledWithoutErrors;
     }
