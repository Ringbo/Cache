diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntAllTasksContainerImpl.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntAllTasksContainerImpl.java
index a272c7a..8b9101f 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntAllTasksContainerImpl.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntAllTasksContainerImpl.java
@@ -11,7 +11,7 @@
 
   public AntAllTasksContainerImpl(final AntElement parent, final XmlTag sourceElement, final AntTypeDefinition definition) {
     super(parent, sourceElement, definition);
-    if (myDefinition.getNestedClassName(definition.getTypeId()) == null) {
+    if (myDefinition != null && definition != null && myDefinition.getNestedClassName(definition.getTypeId()) == null) {
       // allow all tasks as nested elements
       for (final AntTypeDefinition def : getAntFile().getBaseTypeDefinitions()) {
         if (def.isTask()) {
