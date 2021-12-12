diff --git a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/result/ComponentSelectorSerializer.java b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/result/ComponentSelectorSerializer.java
index 242ba19..afa9ea5 100644
--- a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/result/ComponentSelectorSerializer.java
+++ b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/result/ComponentSelectorSerializer.java
@@ -49,7 +49,7 @@
             ModuleComponentSelector moduleComponentSelector = (ModuleComponentSelector)value;
             encoder.writeByte(Implementation.MODULE.getId());
             encoder.writeString(moduleComponentSelector.getGroup());
-            encoder.writeString(moduleComponentSelector.getName());
+            encoder.writeString(moduleComponentSelector.getModule());
             encoder.writeString(moduleComponentSelector.getVersion());
         } else if(value instanceof DefaultBuildComponentSelector) {
             BuildComponentSelector buildComponentSelector = (BuildComponentSelector)value;
