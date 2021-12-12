diff --git a/subprojects/model-core/src/main/java/org/gradle/model/internal/core/FactoryBasedNodeInitializer.java b/subprojects/model-core/src/main/java/org/gradle/model/internal/core/FactoryBasedNodeInitializer.java
index 45e16fe..5b69244 100644
--- a/subprojects/model-core/src/main/java/org/gradle/model/internal/core/FactoryBasedNodeInitializer.java
+++ b/subprojects/model-core/src/main/java/org/gradle/model/internal/core/FactoryBasedNodeInitializer.java
@@ -131,10 +131,10 @@
         addNonDelegatedManagedProperties(schema, delegateSchema, properties);
         for (ModelType<?> internalView : instanceFactory.getInternalViews(schema.getType())) {
             ModelSchema<?> internalViewSchema = schemaStore.getSchema(internalView);
-            if (!(internalViewSchema instanceof ManagedImplStructSchema)) {
+            if (!(internalViewSchema instanceof StructSchema)) {
                 continue;
             }
-            addNonDelegatedManagedProperties((ManagedImplStructSchema<?>) internalViewSchema, delegateSchema, properties);
+            addNonDelegatedManagedProperties((StructSchema<?>) internalViewSchema, delegateSchema, properties);
         }
         return properties.build();
     }
@@ -157,7 +157,7 @@
         addNonDelegatedManagedProperties(schema, delegateSchema, pubPropsBuilder);
         for (ModelType<?> internalView : instanceFactory.getInternalViews(schema.getType())) {
             ModelSchema<?> internalViewSchema = schemaStore.getSchema(internalView);
-            if (!(internalViewSchema instanceof ManagedImplStructSchema)) {
+            if (!(internalViewSchema instanceof StructSchema)) {
                 continue;
             }
             addNonDelegatedManagedProperties((StructSchema<?>) internalViewSchema, delegateSchema, intPropsBuilder);
