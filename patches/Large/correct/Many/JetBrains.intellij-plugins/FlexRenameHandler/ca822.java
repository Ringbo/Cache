diff --git a/flex/src/com/intellij/javascript/flex/FlexRenameHandler.java b/flex/src/com/intellij/javascript/flex/FlexRenameHandler.java
index bca01d7..4aa5565 100644
--- a/flex/src/com/intellij/javascript/flex/FlexRenameHandler.java
+++ b/flex/src/com/intellij/javascript/flex/FlexRenameHandler.java
@@ -67,6 +67,6 @@
         allRenames.put(jsFunction, newName);
         return true;
       }
-    }); // check override modifier to keep consistency with current logic
+    }, true); // check override modifier to keep consistency with current logic
   }
 }
