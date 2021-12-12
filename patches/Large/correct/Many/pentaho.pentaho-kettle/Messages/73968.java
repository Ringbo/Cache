diff --git a/src/be/ibridge/kettle/trans/step/Messages.java b/src/be/ibridge/kettle/trans/step/Messages.java
index 0b8de07..fd2ef0b 100644
--- a/src/be/ibridge/kettle/trans/step/Messages.java
+++ b/src/be/ibridge/kettle/trans/step/Messages.java
@@ -34,7 +34,7 @@
         try {
             return be.ibridge.kettle.i18n.GlobalMessages.getString(packageName, key, param1, param2, param3);
         } catch (MissingResourceException e) {
-            return Messages.getString(key, param1, param2);
+            return Messages.getString(key, param1, param2, param3);
         }
     }
     
@@ -42,7 +42,7 @@
         try {
             return be.ibridge.kettle.i18n.GlobalMessages.getString(packageName, key, param1, param2, param3,param4);
         } catch (MissingResourceException e) {
-            return Messages.getString(key, param1, param2);
+            return Messages.getString(key, param1, param2, param3, param4);
         }
     }
     
@@ -51,7 +51,7 @@
             return be.ibridge.kettle.i18n.GlobalMessages.getString(packageName, key, param1, param2, param3,param4,param5);
         } catch (MissingResourceException e) {
         
-            return Messages.getString(key, param1, param2);
+            return Messages.getString(key, param1, param2, param3, param4, param5);
         }
     }
     
@@ -60,7 +60,7 @@
             return be.ibridge.kettle.i18n.GlobalMessages.getString(packageName, key, param1, param2, param3,param4,param5,param6);
         } catch (MissingResourceException e) {
         
-            return Messages.getString(key, param1, param2);
+            return Messages.getString(key, param1, param2, param3, param4, param5, param6);
         }
     }
 
