diff --git a/plugins/javaFX/javaFX-CE/testSrc/org/jetbrains/plugins/javaFX/fxml/JavaFXHighlightingTest.java b/plugins/javaFX/javaFX-CE/testSrc/org/jetbrains/plugins/javaFX/fxml/JavaFXHighlightingTest.java
index bbb3fe3..ca2df73 100644
--- a/plugins/javaFX/javaFX-CE/testSrc/org/jetbrains/plugins/javaFX/fxml/JavaFXHighlightingTest.java
+++ b/plugins/javaFX/javaFX-CE/testSrc/org/jetbrains/plugins/javaFX/fxml/JavaFXHighlightingTest.java
@@ -237,7 +237,7 @@
                        "  public javafx.beans.property.Property<javafx.scene.Node> axis;" +
                        "  public void setAxis() {}" + 
                        "} ");
-    doTest(getTestName(false) + ".fxml");
+    doTest(getTestName(true) + ".fxml");
   }
 
   public void testFqnTagNames() throws Exception {
