diff --git a/java/java-psi-api/src/com/intellij/lang/jvm/JvmModifiersOwner.java b/java/java-psi-api/src/com/intellij/lang/jvm/JvmModifiersOwner.java
index cabeea8..f226d93 100644
--- a/java/java-psi-api/src/com/intellij/lang/jvm/JvmModifiersOwner.java
+++ b/java/java-psi-api/src/com/intellij/lang/jvm/JvmModifiersOwner.java
@@ -34,6 +34,6 @@
    * @return true if the element has the modifier, false otherwise
    */
   default boolean hasModifier(@NotNull JvmModifier modifier) {
-    return contains(getModifiers(), modifier);
+    return contains(modifier, getModifiers());
   }
 }
