diff --git a/drools-core/src/main/java/org/drools/reteoo/compiled/SetNodeReferenceHandler.java b/drools-core/src/main/java/org/drools/reteoo/compiled/SetNodeReferenceHandler.java
index 23a1474..af778c9 100644
--- a/drools-core/src/main/java/org/drools/reteoo/compiled/SetNodeReferenceHandler.java
+++ b/drools-core/src/main/java/org/drools/reteoo/compiled/SetNodeReferenceHandler.java
@@ -29,7 +29,7 @@
  * <li>{@link LeftInputAdapterNode}s</li>
  * <li>{@link BetaNode}s</li>
  */
-class SetNodeReferenceHandler extends AbstractCompilerHandler {
+public class SetNodeReferenceHandler extends AbstractCompilerHandler {
 
     private static final String PARAM_TYPE = NetworkNode.class.getName();
     private static final String PARAM_NAME = "node";
@@ -38,7 +38,7 @@
 
     private final StringBuilder builder;
 
-    SetNodeReferenceHandler(StringBuilder builder) {
+    public SetNodeReferenceHandler(StringBuilder builder) {
         this.builder = builder;
     }
 
