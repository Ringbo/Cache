diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
index b392e39..d4ad2a5 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
@@ -1594,7 +1594,7 @@
         if (orig.isGenericsPlaceHolder()!=copy.isGenericsPlaceHolder()) return false;
         if (!orig.equals(copy)) return false;
         GenericsType[] gt1 = orig.getGenericsTypes();
-        GenericsType[] gt2 = copy.getGenericsTypes();
+        GenericsType[] gt2 = orig.getGenericsTypes();
         if ((gt1==null) ^ (gt2==null)) return false;
         if (gt1==gt2) return true;
         if (gt1.length!=gt2.length) return false;
