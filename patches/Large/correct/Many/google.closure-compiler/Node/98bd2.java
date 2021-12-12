diff --git a/src/com/google/javascript/rhino/Node.java b/src/com/google/javascript/rhino/Node.java
index 07796fe..9b911db 100644
--- a/src/com/google/javascript/rhino/Node.java
+++ b/src/com/google/javascript/rhino/Node.java
@@ -2343,7 +2343,7 @@
    * #getDeclaredTypeExpression()} which returns the syntactically specified type.
    */
   @Nullable
-  public JSType getJSType() {  // TODO(johnlenz): make this final
+  public final JSType getJSType() {
     return typei instanceof JSType ? (JSType) typei : null;
   }
 
