diff --git a/drools-core/src/main/java/org/drools/ruleflow/core/impl/Variable.java b/drools-core/src/main/java/org/drools/ruleflow/core/impl/Variable.java
index 1311935..c9ed99e 100644
--- a/drools-core/src/main/java/org/drools/ruleflow/core/impl/Variable.java
+++ b/drools-core/src/main/java/org/drools/ruleflow/core/impl/Variable.java
@@ -28,7 +28,7 @@
  */
 public class Variable implements IVariable, Serializable {
 
-    private static final long serialVersionUID = 3256441400072353336L;
+    private static final long serialVersionUID = 320L;
 
     private String name;
     private IDataType type;
@@ -65,7 +65,7 @@
     	if (this.type.verifyDataType(value)) {
     		this.value = value;
     	} else {
-    		StringBuilder sb = new StringBuilder();
+    		StringBuffer sb = new StringBuffer();
     		sb.append("Value <");
     		sb.append(value);
     		sb.append("> is not valid for datatype: ");
