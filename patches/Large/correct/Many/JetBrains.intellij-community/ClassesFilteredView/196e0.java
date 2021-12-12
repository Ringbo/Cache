diff --git a/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java b/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java
index f8c8366..4fa40b0 100644
--- a/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java
+++ b/java/debugger/impl/src/com/intellij/debugger/memory/ui/ClassesFilteredView.java
@@ -395,7 +395,7 @@
 
       if (!classes.isEmpty()) {
         final VirtualMachine vm = classes.get(0).virtualMachine();
-        if (!vm.canGetInstanceInfo()) {
+        if (vm.canGetInstanceInfo()) {
           final Map<ReferenceType, Long> counts = getInstancesCounts(classes, vm);
           if (isContextValid()) {
             ApplicationManager.getApplication().invokeLater(() -> myTable.updateContent(counts));
