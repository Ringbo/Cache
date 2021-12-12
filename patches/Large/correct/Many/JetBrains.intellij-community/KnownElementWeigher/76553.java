diff --git a/java/java-impl/src/com/intellij/psi/util/proximity/KnownElementWeigher.java b/java/java-impl/src/com/intellij/psi/util/proximity/KnownElementWeigher.java
index d98e2cf..5d82f6f1 100644
--- a/java/java-impl/src/com/intellij/psi/util/proximity/KnownElementWeigher.java
+++ b/java/java-impl/src/com/intellij/psi/util/proximity/KnownElementWeigher.java
@@ -98,7 +98,7 @@
   }
 
   private static boolean isPopularJdkClass(String qname) {
-    return qname.startsWith(CommonClassNames.JAVA_LANG_STRING) || 
+    return qname.equals(CommonClassNames.JAVA_LANG_STRING) || 
            qname.equals(System.class.getName()) || 
            qname.equals(CommonClassNames.JAVA_LANG_EXCEPTION) || 
            qname.equals(CommonClassNames.JAVA_LANG_THROWABLE) || 
