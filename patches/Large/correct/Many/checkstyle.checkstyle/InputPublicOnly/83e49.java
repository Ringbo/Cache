diff --git a/src/testinputs/com/puppycrawl/tools/checkstyle/InputPublicOnly.java b/src/testinputs/com/puppycrawl/tools/checkstyle/InputPublicOnly.java
index 8d7ebb5..5f2002e 100644
--- a/src/testinputs/com/puppycrawl/tools/checkstyle/InputPublicOnly.java
+++ b/src/testinputs/com/puppycrawl/tools/checkstyle/InputPublicOnly.java
@@ -110,8 +110,8 @@
     }
 
     @Deprecated @Override
-    public Class getClass()
+    public int hashCode()
     {
-        return super.getClass();
+        return super.hashCode();
     }
 }
