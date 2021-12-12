diff --git a/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/FieldByFieldComparison.java b/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/FieldByFieldComparison.java
index 77bcaf2..bfc8a32 100644
--- a/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/FieldByFieldComparison.java
+++ b/byte-buddy-dep/src/test/java/net/bytebuddy/test/utility/FieldByFieldComparison.java
@@ -55,7 +55,7 @@
         }
         while (type.getName().startsWith("net.bytebuddy.")) {
             for (Field field : type.getDeclaredFields()) {
-                if (Modifier.isStatic(field.getModifiers())) {
+                if (Modifier.isStatic(field.getModifiers()) || field.isSynthetic() && !field.getName().equals("this$0")) {
                     continue;
                 }
                 HashCodeAndEqualsPlugin.ValueHandling valueHandling = field.getAnnotation(HashCodeAndEqualsPlugin.ValueHandling.class);
