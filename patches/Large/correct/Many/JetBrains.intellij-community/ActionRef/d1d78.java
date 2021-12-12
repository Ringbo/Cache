diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/actionholder/ActionRef.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/actionholder/ActionRef.java
index 8dfb725..49abbfb 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/actionholder/ActionRef.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/actionholder/ActionRef.java
@@ -20,7 +20,7 @@
 
 public abstract class ActionRef<T extends AnAction> {
   private static ActionManager ourManager;
-  private static ActionManager getManager() {
+  static ActionManager getManager() {
     if (ourManager == null) {
       ourManager = ActionManager.getInstance();
     }
