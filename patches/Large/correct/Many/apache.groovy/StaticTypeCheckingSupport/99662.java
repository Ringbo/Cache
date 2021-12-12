diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
index eb6bac9..69359e9 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
@@ -1576,7 +1576,7 @@
         if (orig.isGenericsPlaceHolder()!=copy.isGenericsPlaceHolder()) return false;
         if (!orig.equals(copy)) return false;
         GenericsType[] gt1 = orig.getGenericsTypes();
-        GenericsType[] gt2 = orig.getGenericsTypes();
+        GenericsType[] gt2 = copy.getGenericsTypes();
         if ((gt1==null || gt2==null) && gt1!=gt2) return false;
         if (gt1==gt2) return true;
         if (gt1.length!=gt2.length) return false;
