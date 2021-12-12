diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/ex/ActionButtonLook.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/ex/ActionButtonLook.java
index ef4d3b83..1a98ef1 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/ex/ActionButtonLook.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/ex/ActionButtonLook.java
@@ -86,6 +86,6 @@
   }
 
   public Insets getInsets() {
-    return JBUI.insets(2);
+    return JBUI.insets(1, 2);
   }
 }
