diff --git a/taptargetview/src/main/java/com/getkeepsafe/taptargetview/ToolbarTapTarget.java b/taptargetview/src/main/java/com/getkeepsafe/taptargetview/ToolbarTapTarget.java
index f6e180a..fdc2110 100755
--- a/taptargetview/src/main/java/com/getkeepsafe/taptargetview/ToolbarTapTarget.java
+++ b/taptargetview/src/main/java/com/getkeepsafe/taptargetview/ToolbarTapTarget.java
@@ -102,7 +102,7 @@
       }
     }
 
-    throw new IllegalStateException("Could not find navigation view for Toolbar!", e);
+    throw new IllegalStateException("Could not find navigation view for Toolbar!");
   }
 
   private static View findOverflowView(Object instance) {
