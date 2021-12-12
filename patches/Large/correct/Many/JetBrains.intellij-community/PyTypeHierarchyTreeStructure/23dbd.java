diff --git a/python/src/com/jetbrains/python/hierarchy/treestructures/PyTypeHierarchyTreeStructure.java b/python/src/com/jetbrains/python/hierarchy/treestructures/PyTypeHierarchyTreeStructure.java
index 0657138..2387a49 100644
--- a/python/src/com/jetbrains/python/hierarchy/treestructures/PyTypeHierarchyTreeStructure.java
+++ b/python/src/com/jetbrains/python/hierarchy/treestructures/PyTypeHierarchyTreeStructure.java
@@ -8,10 +8,7 @@
 import org.jetbrains.annotations.NotNull;
 
 /**
- * Created by IntelliJ IDEA.
- * User: Alexey.Ivanov
- * Date: Jul 31, 2009
- * Time: 6:29:00 PM
+ * @author Alexey.Ivanov
  */
 public class PyTypeHierarchyTreeStructure extends PySubTypesHierarchyTreeStructure {
   private static PyTypeHierarchyNodeDescriptor buildHierarchyElement(@NotNull final PyClass cl) {
@@ -21,7 +18,7 @@
       final PyClass superClass = superClasses[i];
       final PyTypeHierarchyNodeDescriptor newDescriptor = new PyTypeHierarchyNodeDescriptor(descriptor, superClass, false);
       if (descriptor != null) {
-        newDescriptor.setCachedChildren(new PyTypeHierarchyNodeDescriptor[]{newDescriptor});
+        descriptor.setCachedChildren(new PyTypeHierarchyNodeDescriptor[]{newDescriptor});
       }
       descriptor = newDescriptor;
     }
