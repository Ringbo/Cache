diff --git a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/DataFlowAnalyzer.java b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/DataFlowAnalyzer.java
index c4f8947..fbc90f2 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/DataFlowAnalyzer.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/DataFlowAnalyzer.java
@@ -381,17 +381,18 @@
             @NotNull ResolutionContext c
     ) {
         DataFlowValue dataFlowValue = DataFlowValueFactory.createDataFlowValue(expression, type, c);
-        return getAllPossibleTypes(type, c, dataFlowValue);
+        return getAllPossibleTypes(type, c, dataFlowValue, c.languageVersionSettings);
     }
 
     @NotNull
     public static Collection<KotlinType> getAllPossibleTypes(
             @NotNull KotlinType type,
             @NotNull ResolutionContext c,
-            @NotNull DataFlowValue dataFlowValue
+            @NotNull DataFlowValue dataFlowValue,
+            @NotNull LanguageVersionSettings languageVersionSettings
     ) {
         Collection<KotlinType> possibleTypes = Sets.newHashSet(type);
-        possibleTypes.addAll(c.dataFlowInfo.getStableTypes(dataFlowValue));
+        possibleTypes.addAll(c.dataFlowInfo.getStableTypes(dataFlowValue, languageVersionSettings));
         return possibleTypes;
     }
 
