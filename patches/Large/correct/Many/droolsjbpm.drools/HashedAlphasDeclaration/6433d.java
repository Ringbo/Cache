diff --git a/drools-core/src/main/java/org/drools/reteoo/compiled/HashedAlphasDeclaration.java b/drools-core/src/main/java/org/drools/reteoo/compiled/HashedAlphasDeclaration.java
index 8692bb1..75a3852 100644
--- a/drools-core/src/main/java/org/drools/reteoo/compiled/HashedAlphasDeclaration.java
+++ b/drools-core/src/main/java/org/drools/reteoo/compiled/HashedAlphasDeclaration.java
@@ -29,7 +29,7 @@
  *
  * @see org.kie.reteoo.compiled.DeclarationsHandler
  */
-class HashedAlphasDeclaration {
+public class HashedAlphasDeclaration {
     private final String variableName;
     private final ValueType valueType;
 
@@ -44,11 +44,11 @@
         this.valueType = valueType;
     }
 
-    ValueType getValueType() {
+    public ValueType getValueType() {
         return valueType;
     }
 
-    String getVariableName() {
+    public String getVariableName() {
         return variableName;
     }
 
@@ -56,11 +56,11 @@
         hashedValuesToNodeIds.put(hashedValue,  nodeId);
     }
 
-    Collection<Object> getHashedValues() {
+    public Collection<Object> getHashedValues() {
         return Collections.unmodifiableSet(hashedValuesToNodeIds.keySet());
     }
 
-    String getNodeId(Object hashedValue) {
+    public String getNodeId(Object hashedValue) {
         return hashedValuesToNodeIds.get(hashedValue);
     }
 }
