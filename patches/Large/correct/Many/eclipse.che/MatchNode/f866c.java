diff --git a/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/MatchNode.java b/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/MatchNode.java
index 98b68bc..0f930a4 100644
--- a/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/MatchNode.java
+++ b/plugins/plugin-java/che-plugin-java-ext-lang-client/src/main/java/org/eclipse/che/ide/ext/java/client/search/MatchNode.java
@@ -69,7 +69,7 @@
   @Override
   public NewNodePresentation getPresentation() {
     SpanElement spanElement =
-        Elements.createSpanElement(styles.styles().presentableTextContainer());
+        Elements.createSpanElement(styles.treeStylesCss().presentableTextContainer());
 
     SpanElement lineNumberElement = Elements.createSpanElement();
     lineNumberElement.setInnerHTML(
