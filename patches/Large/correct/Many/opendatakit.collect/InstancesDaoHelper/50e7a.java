diff --git a/collect_app/src/main/java/org/odk/collect/android/dao/helpers/InstancesDaoHelper.java b/collect_app/src/main/java/org/odk/collect/android/dao/helpers/InstancesDaoHelper.java
index 65d46ee..d136333 100644
--- a/collect_app/src/main/java/org/odk/collect/android/dao/helpers/InstancesDaoHelper.java
+++ b/collect_app/src/main/java/org/odk/collect/android/dao/helpers/InstancesDaoHelper.java
@@ -44,7 +44,7 @@
         boolean complete = false;
 
         FormController formController = Collect.getInstance().getFormController();
-        if (formController != null) {
+        if (formController != null && formController.getInstancePath() != null) {
             // First check if we're at the end of the form, then check the preferences
             complete = end && (boolean) GeneralSharedPreferences.getInstance()
                     .get(PreferenceKeys.KEY_COMPLETED_DEFAULT);
