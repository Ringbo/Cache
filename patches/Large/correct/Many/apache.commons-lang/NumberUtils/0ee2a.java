diff --git a/src/main/java/org/apache/commons/lang3/math/NumberUtils.java b/src/main/java/org/apache/commons/lang3/math/NumberUtils.java
index 5b7891a..ec6fc84 100644
--- a/src/main/java/org/apache/commons/lang3/math/NumberUtils.java
+++ b/src/main/java/org/apache/commons/lang3/math/NumberUtils.java
@@ -665,7 +665,8 @@
     }
 
     /**
-     * <p>Convert a <code>String</code> to a <code>Long</code>.</p>
+     * <p>Convert a <code>String</code> to a <code>Long</code>; 
+     * since 3.0.2 it handles hex and octal notations.</p>
      * 
      * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
      *
@@ -677,7 +678,7 @@
         if (str == null) {
             return null;
         }
-        return Long.valueOf(str);
+        return Long.decode(str);
     }
 
     /**
