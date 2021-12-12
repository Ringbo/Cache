diff --git a/java/debugger/impl/src/com/intellij/debugger/memory/utils/StackFrameItem.java b/java/debugger/impl/src/com/intellij/debugger/memory/utils/StackFrameItem.java
index 53df0af..fa84ab1 100644
--- a/java/debugger/impl/src/com/intellij/debugger/memory/utils/StackFrameItem.java
+++ b/java/debugger/impl/src/com/intellij/debugger/memory/utils/StackFrameItem.java
@@ -276,7 +276,7 @@
                         SimpleTextAttributes.REGULAR_ATTRIBUTES, CAPTURE_SETTINGS_OPENER);
       }
       else if (myVariables != null) {
-        children = new XValueChildrenList();
+        children = new XValueChildrenList(myVariables.size());
         myVariables.forEach(children::add);
       }
       node.addChildren(children, true);
