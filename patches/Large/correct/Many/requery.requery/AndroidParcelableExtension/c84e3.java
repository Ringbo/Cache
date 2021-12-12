diff --git a/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java b/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java
index 6bfcab7..277a653 100644
--- a/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java
+++ b/requery-processor/src/main/java/io/requery/processor/AndroidParcelableExtension.java
@@ -51,7 +51,8 @@
     public void generate(EntityDescriptor entity, TypeSpec.Builder builder) {
         // if not parcelable or the class implements itself don't implement it
         TypeElement typeElement = entity.element();
-        if (!Mirrors.isInstance(types, typeElement, PACKAGE_ANDROID_OS + ".Parcelable") ||
+        if (entity.isImmutable() ||
+            !Mirrors.isInstance(types, typeElement, PACKAGE_ANDROID_OS + ".Parcelable") ||
             Mirrors.overridesMethod(types, typeElement, "writeToParcel")) {
             return;
         }
