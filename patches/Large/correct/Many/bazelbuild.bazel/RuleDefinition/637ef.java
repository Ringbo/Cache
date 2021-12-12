diff --git a/src/main/java/com/google/devtools/build/lib/analysis/RuleDefinition.java b/src/main/java/com/google/devtools/build/lib/analysis/RuleDefinition.java
index 77670d5..2c0fbd9 100644
--- a/src/main/java/com/google/devtools/build/lib/analysis/RuleDefinition.java
+++ b/src/main/java/com/google/devtools/build/lib/analysis/RuleDefinition.java
@@ -96,7 +96,8 @@
       public abstract Builder type(RuleClassType type);
       public abstract Builder factoryClass(Class<? extends RuleConfiguredTargetFactory> factory);
       public abstract Builder ancestors(List<Class<? extends RuleDefinition>> ancestors);
-      public Builder ancestors(Class<? extends RuleDefinition>... ancstrs) {
+      @SafeVarargs
+      public final Builder ancestors(Class<? extends RuleDefinition>... ancstrs) {
         return ancestors(Arrays.asList(ancstrs));
       }
       public abstract Metadata build();
