diff --git a/test/com/google/javascript/jscomp/TypeICompilerTestCase.java b/test/com/google/javascript/jscomp/TypeICompilerTestCase.java
index 5c2f51d..b8b4afa 100644
--- a/test/com/google/javascript/jscomp/TypeICompilerTestCase.java
+++ b/test/com/google/javascript/jscomp/TypeICompilerTestCase.java
@@ -27,20 +27,20 @@
 public abstract class TypeICompilerTestCase extends CompilerTestCase {
 
   protected static enum TypeInferenceMode {
-    OtiOnly,
-    NtiOnly,
-    Both;
+    OTI_ONLY,
+    NTI_ONLY,
+    BOTH;
 
     boolean runsOTI() {
-      return this == OtiOnly || this == Both;
+      return this == OTI_ONLY || this == BOTH;
     }
 
     boolean runsNTI() {
-      return this == NtiOnly || this == Both;
+      return this == NTI_ONLY || this == BOTH;
     }
   }
 
-  protected TypeInferenceMode mode = TypeInferenceMode.Both;
+  protected TypeInferenceMode mode = TypeInferenceMode.BOTH;
 
   public TypeICompilerTestCase() {
     super();
@@ -53,7 +53,7 @@
   @Override
   protected void setUp() throws Exception {
     super.setUp();
-    this.mode = TypeInferenceMode.Both;
+    this.mode = TypeInferenceMode.BOTH;
   }
 
   // NOTE(aravindpg): the idea with these selective overrides is that every `test` call
