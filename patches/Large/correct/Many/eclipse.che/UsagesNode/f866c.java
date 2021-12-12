diff --git a/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/UsagesNode.java b/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/UsagesNode.java
index 227a836..744cd70 100644
--- a/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/UsagesNode.java
+++ b/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/UsagesNode.java
@@ -69,7 +69,7 @@
   @Override
   public NewNodePresentation getPresentation() {
     SpanElement spanElement =
-        Elements.createSpanElement(styles.styles().presentableTextContainer());
+        Elements.createSpanElement(styles.treeStylesCss().presentableTextContainer());
     spanElement.setInnerHTML(
         "Usages of <span class=\""
             + resources.css().searchMatch()
