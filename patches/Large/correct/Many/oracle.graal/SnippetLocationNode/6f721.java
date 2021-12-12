diff --git a/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/SnippetLocationNode.java b/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/SnippetLocationNode.java
index 9af057a..868cae4 100644
--- a/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/SnippetLocationNode.java
+++ b/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/SnippetLocationNode.java
@@ -58,12 +58,11 @@
         return graph.unique(new SnippetLocationNode(snippetReflection, identity, kind, displacement, index, indexScaling));
     }
 
-    private SnippetLocationNode(@InjectedNodeParameter SnippetReflectionProvider snippetReflection, ValueNode locationIdentity, ValueNode kind, ValueNode displacement) {
+    SnippetLocationNode(@InjectedNodeParameter SnippetReflectionProvider snippetReflection, ValueNode locationIdentity, ValueNode kind, ValueNode displacement) {
         this(snippetReflection, locationIdentity, kind, displacement, null, null);
     }
 
-    private SnippetLocationNode(@InjectedNodeParameter SnippetReflectionProvider snippetReflection, ValueNode locationIdentity, ValueNode kind, ValueNode displacement, ValueNode index,
-                    ValueNode indexScaling) {
+    SnippetLocationNode(@InjectedNodeParameter SnippetReflectionProvider snippetReflection, ValueNode locationIdentity, ValueNode kind, ValueNode displacement, ValueNode index, ValueNode indexScaling) {
         super(StampFactory.object());
         this.snippetReflection = snippetReflection;
         this.valueKind = kind;
