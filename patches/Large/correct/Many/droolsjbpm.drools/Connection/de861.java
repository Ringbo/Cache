diff --git a/drools-core/src/main/java/org/drools/ruleflow/core/impl/Connection.java b/drools-core/src/main/java/org/drools/ruleflow/core/impl/Connection.java
index 8e6cfd5..b3a4a34 100644
--- a/drools-core/src/main/java/org/drools/ruleflow/core/impl/Connection.java
+++ b/drools-core/src/main/java/org/drools/ruleflow/core/impl/Connection.java
@@ -27,7 +27,7 @@
  */
 public class Connection implements IConnection, Serializable {
     
-    private static final long serialVersionUID = 3256439218229424434L;
+    private static final long serialVersionUID = 320L;
 
     private int type;
     private Node from;
@@ -95,7 +95,7 @@
     }
     
     public String toString() {
-    	StringBuilder sb = new StringBuilder("Connection ");
+    	StringBuffer sb = new StringBuffer("Connection ");
     	sb.append(getFrom());
     	sb.append(" - ");
     	sb.append(getTo());
