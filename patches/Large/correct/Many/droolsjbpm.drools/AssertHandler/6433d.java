diff --git a/drools-core/src/main/java/org/drools/reteoo/compiled/AssertHandler.java b/drools-core/src/main/java/org/drools/reteoo/compiled/AssertHandler.java
index 6a83d48..d18abd5 100644
--- a/drools-core/src/main/java/org/drools/reteoo/compiled/AssertHandler.java
+++ b/drools-core/src/main/java/org/drools/reteoo/compiled/AssertHandler.java
@@ -28,7 +28,7 @@
 /**
  * todo: document
  */
-class AssertHandler extends AbstractCompilerHandler {
+public class AssertHandler extends AbstractCompilerHandler {
     private static final String LOCAL_FACT_VAR_NAME = "fact";
 
     private static final String FACT_HANDLE_PARAM_TYPE = InternalFactHandle.class.getName();
@@ -60,7 +60,7 @@
         this(builder, factClassName, false);
     }
 
-    AssertHandler(StringBuilder builder, String factClassName, boolean alphaNetContainsHashedField) {
+    public AssertHandler(StringBuilder builder, String factClassName, boolean alphaNetContainsHashedField) {
         this.builder = builder;
         this.factClassName = factClassName;
         this.alphaNetContainsHashedField = alphaNetContainsHashedField;
