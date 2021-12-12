diff --git a/spock-core/src/main/java/org/spockframework/runtime/extension/builtin/RuleExtension.java b/spock-core/src/main/java/org/spockframework/runtime/extension/builtin/RuleExtension.java
index 055262a..55c6e82 100644
--- a/spock-core/src/main/java/org/spockframework/runtime/extension/builtin/RuleExtension.java
+++ b/spock-core/src/main/java/org/spockframework/runtime/extension/builtin/RuleExtension.java
@@ -25,7 +25,7 @@
 public class RuleExtension implements IGlobalExtension {
   public void visitSpec(SpecInfo spec) {
     List<FieldInfo> ruleFields = new ArrayList<FieldInfo>();
-    for (FieldInfo field : spec.getFields())
+    for (FieldInfo field : spec.getAllFields())
       if (field.getReflection().isAnnotationPresent(Rule.class))
         ruleFields.add(field);
 
