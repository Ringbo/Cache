diff --git a/src/be/ibridge/kettle/trans/TransMeta.java b/src/be/ibridge/kettle/trans/TransMeta.java
index 6c16e8f..280e774 100644
--- a/src/be/ibridge/kettle/trans/TransMeta.java
+++ b/src/be/ibridge/kettle/trans/TransMeta.java
@@ -2028,7 +2028,7 @@
         }
         else
         {
-            throw new KettleXMLException(Messages.getString("TransMeta.Exception.ErrorOpeningOrValidatingTheXMLFile")); //$NON-NLS-1$
+            throw new KettleXMLException(Messages.getString("TransMeta.Exception.ErrorOpeningOrValidatingTheXMLFile", fname)); //$NON-NLS-1$
         }
     }
 
