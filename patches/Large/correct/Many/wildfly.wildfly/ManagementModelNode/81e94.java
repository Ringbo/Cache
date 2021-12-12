diff --git a/cli/src/main/java/org/jboss/as/cli/gui/ManagementModelNode.java b/cli/src/main/java/org/jboss/as/cli/gui/ManagementModelNode.java
index 484e868..fcd0dc7 100644
--- a/cli/src/main/java/org/jboss/as/cli/gui/ManagementModelNode.java
+++ b/cli/src/main/java/org/jboss/as/cli/gui/ManagementModelNode.java
@@ -169,7 +169,7 @@
             this.name = "/";
             this.value = "";
             this.isLeaf = false;
-            this.seperator = "";
+            this.separator = "";
         }
         /**
          * Constructor for generic folder where resource=*.
