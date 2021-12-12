diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/model/ParameterDesc.java b/core-metadata/src/main/java/org/apache/kylin/metadata/model/ParameterDesc.java
index 0cf31b1..930dc02 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/model/ParameterDesc.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/model/ParameterDesc.java
@@ -145,7 +145,7 @@
             if (p.isColumnType()) {
                 if (q.isColumnType() == false)
                     return false;
-                if (this.getColRef().equals(that.getColRef()) == false)
+                if (q.getColRef().equals(p.getColRef()) == false)
                     return false;
             } else {
                 if (q.isColumnType() == true)
