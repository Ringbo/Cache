diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java
index b6afbc0..e2df937 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java
@@ -196,7 +196,7 @@
     @Override
     public void beginTree(DetailAST rootAST)
     {
-        currentFrame = new FieldFrame(null, true, null, null);
+        currentFrame = new FieldFrame(null, true, null);
     }
 
     @Override
@@ -234,7 +234,7 @@
                         && typeMods.branchContains(TokenTypes.LITERAL_STATIC);
 
         final FieldFrame frame =
-            new FieldFrame(currentFrame, isStaticInnerType, type,
+            new FieldFrame(currentFrame, isStaticInnerType,
                 type == TokenTypes.CLASS_DEF || type == TokenTypes.ENUM_DEF
                     ? ast.findFirstToken(TokenTypes.IDENT).getText()
                     : null
@@ -558,14 +558,11 @@
 
         /**
          * Creates new frame.
-         * @param staticType is this a static inner type (class or enum).
          * @param parent parent frame.
-         * @param frameType frameType derived from {@link TokenTypes}
+         * @param staticType is this a static inner type (class or enum).
          * @param frameName name associated with the frame, which can be a
-         * class or enum name or null if no relevan information is available.
          */
-        public FieldFrame(FieldFrame parent, boolean staticType,
-            Integer frameType, String frameName)
+        public FieldFrame(FieldFrame parent, boolean staticType, String frameName)
         {
             this.parent = parent;
             this.staticType = staticType;
