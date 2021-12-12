diff --git a/src/main/groovy/inspect/Inspector.java b/src/main/groovy/inspect/Inspector.java
index 7eb865e..5361f17 100644
--- a/src/main/groovy/inspect/Inspector.java
+++ b/src/main/groovy/inspect/Inspector.java
@@ -229,7 +229,7 @@
         result[MEMBER_NAME_IDX] = method.getName();
         result[MEMBER_TYPE_IDX] = shortName(method.getReturnType());
         Class[] params = method.getParameterTypes();
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         for (int j = 0; j < params.length; j++) {
             sb.append(shortName(params[j]));
             if (j < (params.length - 1)) sb.append(", ");
@@ -254,7 +254,7 @@
         result[MEMBER_TYPE_IDX] = shortName(ctor.getDeclaringClass());
         result[MEMBER_NAME_IDX] = ctor.getName();
         Class[] params = ctor.getParameterTypes();
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         for (int j = 0; j < params.length; j++) {
             sb.append(shortName(params[j]));
             if (j < (params.length - 1)) sb.append(", ");
@@ -279,7 +279,7 @@
         result[MEMBER_TYPE_IDX] = shortName(method.getReturnType());
         result[MEMBER_NAME_IDX] = method.getName();
         CachedClass[] params = method.getParameterTypes();
-        StringBuffer sb = new StringBuffer();
+        StringBuilder sb = new StringBuilder();
         for (int j = 0; j < params.length; j++) {
             sb.append(shortName(params[j].getTheClass()));
             if (j < (params.length - 1)) sb.append(", ");
