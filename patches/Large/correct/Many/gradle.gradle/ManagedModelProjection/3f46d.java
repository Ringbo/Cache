diff --git a/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/projection/ManagedModelProjection.java b/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/projection/ManagedModelProjection.java
index 7068896..07f7694 100644
--- a/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/projection/ManagedModelProjection.java
+++ b/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/projection/ManagedModelProjection.java
@@ -210,7 +210,7 @@
 
     @Override
     public Optional<String> getValueDescription(MutableModelNode modelNodeInternal) {
-        ModelView<?> modelView = this.asImmutable(ModelType.untyped(), modelNodeInternal, null);
+        ModelView<?> modelView = modelNodeInternal.asImmutable(ModelType.untyped(), null);
         Object instance = modelView.getInstance();
         if (null != instance && !JavaReflectionUtil.hasDefaultToString(instance)) {
             return Optional.fromNullable(instance.toString());
