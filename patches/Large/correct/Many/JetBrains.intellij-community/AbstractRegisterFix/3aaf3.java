diff --git a/plugins/devkit/src/inspections/quickfix/AbstractRegisterFix.java b/plugins/devkit/src/inspections/quickfix/AbstractRegisterFix.java
index d167910..daaf9c6 100644
--- a/plugins/devkit/src/inspections/quickfix/AbstractRegisterFix.java
+++ b/plugins/devkit/src/inspections/quickfix/AbstractRegisterFix.java
@@ -49,7 +49,7 @@
 
   @NotNull
   public String getFamilyName() {
-    return DevKitBundle.message("inspections.component.not.registered.quickfix.family");
+    return DevKitBundle.message("inspections.component.not.registered.quickfix.family", StringUtil.toLowerCase(getType()));
   }
 
   @Override
