diff --git a/src/main/org/codehaus/groovy/vmplugin/v5/Java5.java b/src/main/org/codehaus/groovy/vmplugin/v5/Java5.java
index a3786ca..9bea21d 100644
--- a/src/main/org/codehaus/groovy/vmplugin/v5/Java5.java
+++ b/src/main/org/codehaus/groovy/vmplugin/v5/Java5.java
@@ -149,7 +149,7 @@
         ClassNode[] lowers = configureTypes(wildcardType.getLowerBounds());
         ClassNode lower = null;
         // TODO: is it safe to remove this? What was the original intention?
-        if (lower != null) lower = lowers[0];
+        if (lowers != null) lower = lowers[0];
 
         ClassNode[] upper = configureTypes(wildcardType.getUpperBounds());
         GenericsType t = new GenericsType(base, upper, lower);
