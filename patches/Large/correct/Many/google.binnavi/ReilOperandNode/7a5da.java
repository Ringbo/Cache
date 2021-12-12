diff --git a/src/main/java/com/google/security/zynamics/reil/ReilOperandNode.java b/src/main/java/com/google/security/zynamics/reil/ReilOperandNode.java
index 3ea772c..96c0353 100644
--- a/src/main/java/com/google/security/zynamics/reil/ReilOperandNode.java
+++ b/src/main/java/com/google/security/zynamics/reil/ReilOperandNode.java
@@ -32,7 +32,7 @@
   private final ExpressionType m_type;
 
   public ReilOperandNode(final String value, final ExpressionType type) {
-    m_value = Preconditions.checkNotNull(value, "Value argument can not be null");
+    m_value = Preconditions.checkNotNull(value);
     m_type = type;
   }
 
