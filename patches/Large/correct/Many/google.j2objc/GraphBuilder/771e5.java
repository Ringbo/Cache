diff --git a/cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java b/cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java
index 555fad2..83c63d4 100644
--- a/cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java
+++ b/cycle_finder/src/main/java/com/google/devtools/cyclefinder/GraphBuilder.java
@@ -275,7 +275,7 @@
       TypeNode declarationType = getOrCreateNode(element.asType());
       if (declarationType != null && enclosingTypeNode != null
           && ElementUtil.hasOuterContext(element)
-          && !ElementUtil.isWeakOuterType(element)
+          && !elementUtil.isWeakOuterType(element)
           && !whitelist.containsType(enclosingTypeNode)
           && !whitelist.hasOuterForType(typeNode)) {
         possibleOuterEdges.put(
