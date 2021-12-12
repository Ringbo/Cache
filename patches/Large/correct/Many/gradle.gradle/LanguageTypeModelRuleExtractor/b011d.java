diff --git a/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/LanguageTypeModelRuleExtractor.java b/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/LanguageTypeModelRuleExtractor.java
index ec3ae5c..6b8e85c 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/LanguageTypeModelRuleExtractor.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/platform/base/internal/registry/LanguageTypeModelRuleExtractor.java
@@ -87,7 +87,7 @@
         private final String languageName;
 
         protected RegisterTypeRule(ModelType<? extends LanguageSourceSet> type, ModelType<? extends BaseLanguageSourceSet> implementation, String languageName, ModelRuleDescriptor descriptor) {
-            super(ModelReference.of(LanguageRegistry.class), descriptor, ModelReference.of(ServiceRegistry.class));
+            super(ModelReference.of(LanguageRegistry.class), descriptor, ModelReference.of("serviceRegistry", ServiceRegistry.class));
             this.type = type;
             this.implementation = implementation;
             this.languageName = languageName;
