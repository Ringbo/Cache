diff --git a/src/com/google/javascript/jscomp/testing/TypeSubject.java b/src/com/google/javascript/jscomp/testing/TypeSubject.java
index 2053924..359e068 100644
--- a/src/com/google/javascript/jscomp/testing/TypeSubject.java
+++ b/src/com/google/javascript/jscomp/testing/TypeSubject.java
@@ -95,6 +95,6 @@
   }
 
   public void toStringIsEqualTo(String typeString) {
-    assertEquals(actual().toString(), typeString);
+    assertEquals(typeString, actual().toString());
   }
 }
