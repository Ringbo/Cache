diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/formatter/GroovyBlockGenerator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/formatter/GroovyBlockGenerator.java
index c89c932..92987b9 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/formatter/GroovyBlockGenerator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/formatter/GroovyBlockGenerator.java
@@ -140,7 +140,7 @@
         if (childNode.getTextRange().getLength() > 0) {
           final Indent indent = GroovyIndentProcessor.getChildIndent(myBlock, childNode);
           if (myAlignment != null) {
-            myAlignmentProvider.addPair(myNode, childNode, true);
+            myAlignmentProvider.addPair(myNode, childNode, false);
           }
           subBlocks.add(new GroovyBlock(childNode, indent, myWrap, mySettings, myGroovySettings, myAlignmentProvider));
         }
