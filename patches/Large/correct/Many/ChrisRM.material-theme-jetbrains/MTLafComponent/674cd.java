diff --git a/src/main/java/com/chrisrm/idea/MTLafComponent.java b/src/main/java/com/chrisrm/idea/MTLafComponent.java
index 07d6545..8fc1a3e 100644
--- a/src/main/java/com/chrisrm/idea/MTLafComponent.java
+++ b/src/main/java/com/chrisrm/idea/MTLafComponent.java
@@ -150,13 +150,14 @@
       });
 
       // Edit paintborder
+      // outdated in EAP 2017.3
       final CtClass[] paintBackgroundParams = new CtClass[]{
           cp.get("java.awt.Graphics"),
           cp.get("java.awt.Dimension"),
           cp.get("java.awt.Color"),
           cp.get("int")
       };
-      final CtMethod paintBackground = ctClass.getDeclaredMethod("paintBackground", paintBackgroundParams);
+      final CtMethod paintBackground = ctClass.getDeclaredMethod("paintBackground");
       paintBackground.instrument(new ExprEditor() {
         @Override
         public void edit(final MethodCall m) throws CannotCompileException {
@@ -175,7 +176,8 @@
         public void edit(final MethodCall m) throws CannotCompileException {
           if (m.getMethodName().equals("drawRoundRect")) {
             m.replace("{ $2 = $4; $5 = 0; $6 = 0; $_ = $proceed($$); }");
-          } else if (m.getMethodName().equals("setPaint") && m.getLineNumber() > 454 && m.getLineNumber() < 460) {
+          }
+          else if (m.getMethodName().equals("setPaint") && m.getLineNumber() > 454 && m.getLineNumber() < 461) {
             final String color = "javax.swing.UIManager.getColor(\"TextField.selectedSeparatorColor\")";
             m.replace("{ $1 = myMouseInside ? " + color + " : com.intellij.ui.Gray._95; $_ = $proceed($$); }");
           }
