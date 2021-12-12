diff --git a/src/main/java/com/google/security/zynamics/reil/ReilOperand.java b/src/main/java/com/google/security/zynamics/reil/ReilOperand.java
index 08a24c8..7635003 100644
--- a/src/main/java/com/google/security/zynamics/reil/ReilOperand.java
+++ b/src/main/java/com/google/security/zynamics/reil/ReilOperand.java
@@ -30,7 +30,7 @@
    * @param root The root operand node of the operand.
    */
   public ReilOperand(final ReilOperandNode root) {
-    m_root = Preconditions.checkNotNull(root, "Root value can't be null");
+    m_root = Preconditions.checkNotNull(root);
   }
 
   @Override
