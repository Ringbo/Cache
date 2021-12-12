diff --git a/packages/DocumentsUI/src/com/android/documentsui/MultiSelectManager.java b/packages/DocumentsUI/src/com/android/documentsui/MultiSelectManager.java
index 4284f6f..30a5a47 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/MultiSelectManager.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/MultiSelectManager.java
@@ -339,7 +339,7 @@
         }
 
         handlePositionChanged(position, metaState);
-        return false;
+        return true;
     }
 
     /**
