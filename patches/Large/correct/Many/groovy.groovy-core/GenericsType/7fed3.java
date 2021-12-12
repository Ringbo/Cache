diff --git a/src/main/org/codehaus/groovy/ast/GenericsType.java b/src/main/org/codehaus/groovy/ast/GenericsType.java
index bee8c54..7d44edf 100644
--- a/src/main/org/codehaus/groovy/ast/GenericsType.java
+++ b/src/main/org/codehaus/groovy/ast/GenericsType.java
@@ -263,8 +263,8 @@
             GenericsType[] cnTypes = classNode.getGenericsTypes();
             if (cnTypes==null && classNode.isRedirectNode()) cnTypes=classNode.redirect().getGenericsTypes();
             if (cnTypes==null) {
-                // should not happen
-                return false;
+                // may happen if generic type is Foo<T extends Foo> and classnode is Foo -> Foo
+                return true;
             }
             GenericsType[] redirectBoundGenericTypes = bound.redirect().getGenericsTypes();
             Map<String, GenericsType> classNodePlaceholders = org.codehaus.groovy.ast.tools.GenericsUtils.extractPlaceholders(classNode);
